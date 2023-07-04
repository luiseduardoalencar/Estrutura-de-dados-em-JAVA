package br.com.pi.the.ed.redblacktree;

class TreeNode<E> {
    private E data;
    private TreeNode<E> parent;
    private TreeNode<E> left;
    private TreeNode<E> right;
    private boolean isRed;

    public TreeNode(E data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
        this.isRed = true;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public TreeNode<E> getParent() {
        return parent;
    }

    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean red) {
        isRed = red;
    }
}

