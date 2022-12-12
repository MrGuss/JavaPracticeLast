package ru.mirea.exercise1_3;

public class Main {
    public static void main(String[] args) {
        Hashtab hashtab = new Hashtab();
        hashtab.add(1, 10);
        hashtab.add(2, 20);
        hashtab.add(3, 30);
        hashtab.add(4, 40);
        hashtab.add(5, 50);
        hashtab.add(6, 60);
        hashtab.add(7, 70);
        hashtab.add(8, 80);
        hashtab.add(9, 90);
        hashtab.add(10, 100);
        System.out.println(hashtab);
        System.out.println("The data with the key 5: " + hashtab.init(5));
        hashtab.delete(5);
        System.out.println();
        System.out.println("After deleting the data with the key 5:");
        System.out.println(hashtab);
    }
}
