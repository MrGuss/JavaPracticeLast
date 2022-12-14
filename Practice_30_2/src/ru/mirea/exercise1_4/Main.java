package ru.mirea.exercise1_4;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(13);
        tree.addNode(11);
        tree.addNode(19);
        tree.addNode(14);
        tree.addNode(15);
        tree.addNode(110);
        tree.addNode(17);
        tree.addNode(18);
        tree.addNode(12);
        tree.addNode(16);
        System.out.println("Source tree:");
        tree.printTree();
        System.out.println();
        System.out.println("After deleting the element 17:");
        tree.delete(17);
        tree.printTree();
        System.out.println();
        System.out.println("Deleting the entire tree:");
        tree.deleteTree();
        tree.printTree();
    }
}
