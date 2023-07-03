package br.com.pi.the.ed.binarytree;

/**
 * Classe que representa um nó em uma Árvore Binária.
 *
 * @param <E> o tipo de elemento que o nó armazena.
 * @author Luis Eduardo Alencar Melo
 */
public class TreeNode<E> {
    private E value;
    private TreeNode<E> right;
    private TreeNode<E> left;
    /**
     * Cria um novo nó com o valor fornecido.
     *
     * @param newValue o valor a ser armazenado no nó.
     */
    public TreeNode(E newvalue) {
        this.value = newvalue;
        this.right = null;
        this.left = null;
    }
    /**
     * Obtém o valor armazenado no nó.
     *
     * @return o valor armazenado no nó.
     */
    public E getValue() {
        return value;
    }
    /**
     * Define o valor a ser armazenado no nó.
     *
     * @param value o valor a ser armazenado no nó.
     */
    public void setValue(E value) {
        this.value = value;
    }
    /**
     * Obtém o nó filho à direita.
     *
     * @return o nó filho à direita.
     */
    public TreeNode<E> getRight() {
        return right;
    }
    /**
     * Define o nó filho à direita.
     *
     * @param right o nó filho à direita.
     */
    public void setRight(TreeNode<E> right) {
        this.right = right;
    }
    /**
     * Obtém o nó filho à esquerda.
     *
     * @return o nó filho à esquerda.
     */
    public TreeNode<E> getLeft() {
        return left;
    }
    /**
     * Define o nó filho à esquerda.
     *
     * @param left o nó filho à esquerda.
     */
    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }
}
