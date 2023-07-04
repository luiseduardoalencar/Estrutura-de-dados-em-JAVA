package br.com.pi.the.ed.redblacktree;

public class RedBlackTree<E extends Comparable> {
    private TreeNode<E> root;

    public RedBlackTree() {
        this.root = null;
    }

    // Insertion method
    public void insert(E data) {
        TreeNode<E> newNode = new TreeNode<>(data);
        if (root == null) {
            newNode.setRed(false); // Root node is always black
            root = newNode;
        } else {
            TreeNode<E> current = root;
            TreeNode<E> parent;
            while (true) {
                parent = current;
                int comparison = data.compareTo(current.getData());
                if (comparison < 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        newNode.setParent(parent);
                        break;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        newNode.setParent(parent);
                        break;
                    }
                }
            }
            fixRedBlackTreeAfterInsertion(newNode);
        }
    }


    // Helper method to fix the Red-Black Tree properties after insertion
    private void fixRedBlackTreeAfterInsertion(TreeNode<E> node) {
        node.setRed(true);

        while (node != null && node != root && node.getParent().isRed()) {
            if (node.getParent() == node.getParent().getParent().getLeft()) {
                TreeNode<E> uncle = node.getParent().getParent().getRight();
                if (uncle != null && uncle.isRed()) {
                    node.getParent().setRed(false);
                    uncle.setRed(false);
                    node.getParent().getParent().setRed(true);
                    node = node.getParent().getParent();
                } else {
                    if (node == node.getParent().getRight()) {
                        node = node.getParent();
                        rotateLeft(node);
                    }
                    node.getParent().setRed(false);
                    node.getParent().getParent().setRed(true);
                    rotateRight(node.getParent().getParent());
                }
            } else {
                TreeNode<E> uncle = node.getParent().getParent().getLeft();
                if (uncle != null && uncle.isRed()) {
                    node.getParent().setRed(false);
                    uncle.setRed(false);
                    node.getParent().getParent().setRed(true);
                    node = node.getParent().getParent();
                } else {
                    if (node == node.getParent().getLeft()) {
                        node = node.getParent();
                        rotateRight(node);
                    }
                    node.getParent().setRed(false);
                    node.getParent().getParent().setRed(true);
                    rotateLeft(node.getParent().getParent());
                }
            }
        }

        root.setRed(false);
    }


    // Helper method to perform left rotation
    private void rotateLeft(TreeNode<E> node) {
        TreeNode<E> rightChild = node.getRight();
        node.setRight(rightChild.getLeft());
        if (rightChild.getLeft() != null) {
            rightChild.getLeft().setParent(node);
        }
        rightChild.setParent(node.getParent());
        if (node.getParent() == null) {
            root = rightChild;
        } else if (node == node.getParent().getLeft()) {
            node.getParent().setLeft(rightChild);
        } else {
            node.getParent().setRight(rightChild);
        }
        rightChild.setLeft(node);
        node.setParent(rightChild);
    }

    // Helper method to perform right rotation
    private void rotateRight(TreeNode<E> node) {
        TreeNode<E> leftChild = node.getLeft();
        node.setLeft(leftChild.getRight());
        if (leftChild.getRight() != null) {
            leftChild.getRight().setParent(node);
        }
        leftChild.setParent(node.getParent());
        if (node.getParent() == null) {
            root = leftChild;
        } else if (node == node.getParent().getRight()) {
            node.getParent().setRight(leftChild);
        } else {
            node.getParent().setLeft(leftChild);
        }
        leftChild.setRight(node);
        node.setParent(leftChild);
    }
    public boolean contains(E data) {
        TreeNode<E> current = root;
        while (current != null) {
            int comparison = data.compareTo(current.getData());
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    // Minimum value method
    public E minimum() {
        TreeNode<E> current = root;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getData();
    }

    // Maximum value method
    public E maximum() {
        TreeNode<E> current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }

    // Predecessor method
    public E predecessor(E data) {
        TreeNode<E> node = searchNode(data);
        if (node == null) {
            return null;
        }
        if (node.getLeft() != null) {
            node = node.getLeft();
            while (node.getRight() != null) {
                node = node.getRight();
            }
            return node.getData();
        } else {
            TreeNode<E> parent = node.getParent();
            while (parent != null && node == parent.getLeft()) {
                node = parent;
                parent = parent.getParent();
            }
            return parent != null ? parent.getData() : null;
        }
    }

    // Successor method
    public E successor(E data) {
        TreeNode<E> node = searchNode(data);
        if (node == null) {
            return null;
        }
        if (node.getRight() != null) {
            node = node.getRight();
            while (node.getLeft() != null) {
                node = node.getLeft();
            }
            return node.getData();
        } else {
            TreeNode<E> parent = node.getParent();
            while (parent != null && node == parent.getRight()) {
                node = parent;
                parent = parent.getParent();
            }
            return parent != null ? parent.getData() : null;
        }
    }

    // Deletion method
    public void delete(E data) {
        TreeNode<E> node = searchNode(data);
        if (node == null) {
            return;
        }
        TreeNode<E> successor;
        TreeNode<E> child;
        if (node.getLeft() == null || node.getRight() == null) {
            successor = node;
        } else {
            successor = node.getRight();
            while (successor.getLeft() != null) {
                successor = successor.getLeft();
            }
        }
        if (successor.getLeft() != null) {
            child = successor.getLeft();
        } else {
            child = successor.getRight();
        }
        if (child != null) {
            child.setParent(successor.getParent());
        }
        if (successor.getParent() == null) {
            root = child;
        } else if (successor == successor.getParent().getLeft()) {
            successor.getParent().setLeft(child);
        } else {
            successor.getParent().setRight(child);
        }
        if (successor != node) {
            node.setData(successor.getData());
        }
        if (!successor.isRed()) {
            fixRedBlackTreeAfterDeletion(child, successor.getParent());
        }
    }

    // Helper method to search for a node with the given data
    private TreeNode<E> searchNode(E data) {
        TreeNode<E> current = root;
        while (current != null) {
            int comparison = data.compareTo(current.getData());
            if (comparison == 0) {
                return current;
            } else if (comparison < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;
    }

    // Helper method to fix the Red-Black Tree properties after deletion
    private void fixRedBlackTreeAfterDeletion(TreeNode<E> node, TreeNode<E> parent) {
        while (node != root && (node == null || !node.isRed())) {
            if (node == parent.getLeft()) {
                TreeNode<E> sibling = parent.getRight();
                if (sibling.isRed()) {
                    sibling.setRed(false);
                    parent.setRed(true);
                    rotateLeft(parent);
                    sibling = parent.getRight();
                }
                if ((sibling.getLeft() == null || !sibling.getLeft().isRed()) &&
                        (sibling.getRight() == null || !sibling.getRight().isRed())) {
                    sibling.setRed(true);
                    node = parent;
                    parent = node.getParent();
                } else {
                    if (sibling.getRight() == null || !sibling.getRight().isRed()) {
                        sibling.getLeft().setRed(false);
                        sibling.setRed(true);
                        rotateRight(sibling);
                        sibling = parent.getRight();
                    }
                    sibling.setRed(parent.isRed());
                    parent.setRed(false);
                    sibling.getRight().setRed(false);
                    rotateLeft(parent);
                    node = root;
                    break;
                }
            } else {
                TreeNode<E> sibling = parent.getLeft();
                if (sibling.isRed()) {
                    sibling.setRed(false);
                    parent.setRed(true);
                    rotateRight(parent);
                    sibling = parent.getLeft();
                }
                if ((sibling.getRight() == null || !sibling.getRight().isRed()) &&
                        (sibling.getLeft() == null || !sibling.getLeft().isRed())) {
                    sibling.setRed(true);
                    node = parent;
                    parent = node.getParent();
                } else {
                    if (sibling.getLeft() == null || !sibling.getLeft().isRed()) {
                        sibling.getRight().setRed(false);
                        sibling.setRed(true);
                        rotateLeft(sibling);
                        sibling = parent.getLeft();
                    }
                    sibling.setRed(parent.isRed());
                    parent.setRed(false);
                    sibling.getLeft().setRed(false);
                    rotateRight(parent);
                    node = root;
                    break;
                }
            }
        }
        if (node != null) {
            node.setRed(false);
        }
    }
    public boolean isEmpty() {
        return root == null;
    }

    // Method to get the size (number of elements) in the tree
    public int size() {
        return getSize(root);
    }

    // Helper method to calculate the size recursively
    private int getSize(TreeNode<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSize(node.getLeft()) + getSize(node.getRight());
    }

    // Method to clear the tree
    public void clear() {
        root = null;
    }

    // Method to validate if the tree satisfies the Red-Black Tree properties
    public boolean validate() {
        if (root == null) {
            return true;
        }
        // Check if the root is black
        if (root.isRed()) {
            return false;
        }
        // Check the black height of every path
        int blackHeight = getBlackHeight(root);
        return validateNode(root, blackHeight);
    }

    // Helper method to calculate the black height of a node
    private int getBlackHeight(TreeNode<E> node) {
        int blackHeight = 0;
        while (node != null) {
            if (!node.isRed()) {
                blackHeight++;
            }
            node = node.getLeft();
        }
        return blackHeight;
    }

    // Helper method to validate the Red-Black Tree properties recursively
    private boolean validateNode(TreeNode<E> node, int blackHeight) {
        if (node == null) {
            return blackHeight == 0;
        }
        if (!node.isRed()) {
            blackHeight--;
        }
        TreeNode<E> left = node.getLeft();
        TreeNode<E> right = node.getRight();
        if (left != null && !validateNode(left, blackHeight)) {
            return false;
        }
        if (right != null && !validateNode(right, blackHeight)) {
            return false;
        }
        return true;
    }


}
