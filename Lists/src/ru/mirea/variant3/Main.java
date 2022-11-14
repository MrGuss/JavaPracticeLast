package ru.mirea.variant3;

public class Main {
    public static void main(String[] args){
        List list = new List();
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(17);
        list.add(1);
        list.add(11);
        list.add(20);
        list.add(21);
        list.add(18);
        list.add(19);
        System.out.println("Original list:");
        System.out.println(list);
        list.sorting();
        System.out.println("Sorted list:");
        System.out.println(list);
    }
}
