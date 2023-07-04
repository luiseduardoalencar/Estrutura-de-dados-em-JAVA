package br.com.pi.the.ed.redblacktree;

public class Main {
    public static void main(String[] args) {
        // Create a RedBlackTree instance
        RedBlackTree<Integer> RedBlacktree = new RedBlackTree<>();

        // Test insert method
        RedBlacktree.insert(88);
        RedBlacktree.insert(65);
        RedBlacktree.insert(21);
        RedBlacktree.insert(36);
        RedBlacktree.insert(988);
        RedBlacktree.insert(1456);
        RedBlacktree.insert(0);
        RedBlacktree.insert(69);
        RedBlacktree.insert(21);
        RedBlacktree.insert(9865);


        // Test contains method
        System.out.println("Contains 9865: " + RedBlacktree.contains(9865));
        System.out.println("Contains 25: " + RedBlacktree.contains(25));

        // Test minimum and maximum methods
        System.out.println("Minimum value: " + RedBlacktree.minimum());
        System.out.println("Maximum value: " + RedBlacktree.maximum());

        // Test predecessor and successor methods
        System.out.println("Predecessor of 15: " + RedBlacktree.predecessor(15));
        System.out.println("Successor of 15: " + RedBlacktree.successor(15));

        // Test delete method
        RedBlacktree.delete(20);
        System.out.println("Contains 20 after deletion: " + RedBlacktree.contains(20));

        // Test size and isEmpty methods
        System.out.println("Tree size: " + RedBlacktree.size());
        System.out.println("Is tree empty? " + RedBlacktree.isEmpty());

        // Test clear method
        RedBlacktree.clear();
        System.out.println("Tree size after clearing: " + RedBlacktree.size());
        System.out.println("Is tree empty after clearing? " + RedBlacktree.isEmpty());

        // Test validate method
        System.out.println("Is tree valid? " + RedBlacktree.validate());



    }
}
