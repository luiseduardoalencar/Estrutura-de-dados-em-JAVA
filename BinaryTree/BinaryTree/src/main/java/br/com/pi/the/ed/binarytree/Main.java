package br.com.pi.the.ed.binarytree;
/**
 *
 * Classe de ponto de entrada do programa.
 * Esta classe contém o método main, que é o ponto de partida para a execução do programa.
 *
 */
public class Main {
    public static void main(String[] args) {
    BinaryTree<Integer> BinaryTree = new BinaryTree<>();
    BinaryTree.addTreeNode(100);
    BinaryTree.addTreeNode(982);
    BinaryTree.addTreeNode(43);
    BinaryTree.addTreeNode(5);
    BinaryTree.addTreeNode(98);
    BinaryTree.addTreeNode(456);
    BinaryTree.addTreeNode(433);
    BinaryTree.addTreeNode(9988);
    BinaryTree.addTreeNode(54765);
    BinaryTree.addTreeNode(45635);
    BinaryTree.addTreeNode(29);
    BinaryTree.addTreeNode(2);

    System.out.println("Pesquisa Em ordem");
    BinaryTree.searchinorder(BinaryTree.getRoot());
    System.out.println("----------------------");
    System.out.println("Pesquisa em Pré-ordem");
    BinaryTree.searchpreorder(BinaryTree.getRoot());
    System.out.println("----------------------");
    System.out.println("Pesquisa em Pós-ordem");
    BinaryTree.searchpostorder(BinaryTree.getRoot());
    System.out.println("----------------------");

    BinaryTree.removeTreeNode(100);
    System.out.println("----------------------");

    System.out.println("Pesquisa Em ordem");
    BinaryTree.searchinorder(BinaryTree.getRoot());
    System.out.println("----------------------");
    System.out.println("Pesquisa em Pré-ordem");
    BinaryTree.searchpreorder(BinaryTree.getRoot());
    System.out.println("----------------------");
    System.out.println("Pesquisa em Pós-ordem");
    BinaryTree.searchpostorder(BinaryTree.getRoot());


    }
}