package br.com.pi.the.ed.binarytree;
/**
 * Classe que representa uma Árvore Binária.
 *
 * @param <E> o tipo de elementos que a árvore contém, deve ser comparável.
 * @author Luis Eduardo Alencar Melo
 */
public class BinaryTree<E extends Comparable> {

    private TreeNode<E> root;
    /**
     * Cria uma nova instância de BinaryTree.
     * A raiz da árvore é inicializada como nula.
     */
    public BinaryTree() {
        this.root = null;
    }
    /**
     * Adiciona um novo nó à árvore com o valor fornecido.
     *
     * @param value o valor a ser adicionado à árvore.
     */
    public void addTreeNode(E value) {
        TreeNode<E> newNode = new TreeNode<E>(value);
        if (root == null) {
            this.root = newNode;
        } else {
            TreeNode<E> current = this.root;
            while (true) {
                if (newNode.getValue().compareTo(current.getValue()) == -1) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        break;
                    }

                }
            }
        }
    }
    /**
     * Realiza uma busca em ordem (inorder traversal) na árvore,
     * imprimindo os valores dos nós em ordem crescente.
     *
     * @param current o nó atual sendo visitado na recursão.
     */
    public void searchinorder(TreeNode<E> current) {
        if (current != null) {
            searchinorder(current.getLeft());
            System.out.println(current.getValue());
            searchinorder(current.getRight());
        }
    }
    /**
     * Realiza uma busca pré-ordem (preorder traversal) na árvore,
     * imprimindo os valores dos nós em pré-ordem.
     *
     * @param current o nó atual sendo visitado na recursão.
     */
    public void searchpreorder(TreeNode<E> current) {
        if (current != null) {
            System.out.println(current.getValue());
            searchpreorder(current.getLeft());
            searchpreorder(current.getRight());
        }
    }
    /**
     * Realiza uma busca pós-ordem (postorder traversal) na árvore,
     * imprimindo os valores dos nós em pós-ordem.
     *
     * @param current o nó atual sendo visitado na recursão.
     */
    public void searchpostorder(TreeNode<E> current) {
        if (current != null) {
            searchpostorder(current.getLeft());
            searchpostorder(current.getRight());
            System.out.println(current.getValue());
        }
    }
    /**
     * Remove o nó com o valor fornecido da árvore.
     *
     * @param value o valor do nó a ser removido.
     * @return true se o nó foi removido com sucesso, false caso contrário.
     */
    public boolean removeTreeNode(E value) {
        TreeNode<E> current = this.root;
        TreeNode<E> parent = null;

        while (current != null) {
            int comp = value.compareTo(current.getValue());
            if (comp == 0) {
                break;
            } else if (comp < 0) {
                parent = current;
                current = current.getLeft();
            } else {
                parent = current;
                current = current.getRight();
            }
        }

        if (current == null) {
            return false;
        }

        if (current.getLeft() == null && current.getRight() == null) {
            if (parent != null) {
                if (current == parent.getLeft()) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            } else {
                this.root = null;
            }
        } else if (current.getLeft() != null && current.getRight() != null) {
            TreeNode<E> auxParent = current;
            TreeNode<E> aux = current.getRight();

            while (aux.getLeft() != null) {
                auxParent = aux;
                aux = aux.getLeft();
            }

            if (auxParent != current) {
                auxParent.setLeft(aux.getRight());
                aux.setRight(current.getRight());
            }

            aux.setLeft(current.getLeft());

            if (parent != null) {
                if (current == parent.getLeft()) {
                    parent.setLeft(aux);
                } else {
                    parent.setRight(aux);
                }
            } else {
                this.root = aux;
            }
        } else {
            TreeNode<E> child = (current.getLeft() != null) ? current.getLeft() : current.getRight();

            if (parent != null) {
                if (current == parent.getLeft()) {
                    parent.setLeft(child);
                } else {
                    parent.setRight(child);
                }
            } else {
                this.root = child;
            }
        }

        return true;
    }


    /**
     * Obtém a raiz da árvore.
     *
     * @return a raiz da árvore.
     */
    public TreeNode<E> getRoot() {
        return root;
    }
}

