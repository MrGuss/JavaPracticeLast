package ru.mirea.exercise3;

public class Realization {
    public static void main(String[] args) {
        NewList<Integer> list = new NewList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(70);
        list.add(90);
        System.out.println("List:");
        System.out.println(list);
        System.out.println("Pop: " + list.pop());
        System.out.println("Element with index 1: " + list.get(1));
        System.out.println("Size: " + list.size());
        System.out.println("Enumeration:");
        for(int number : list){
            System.out.println(number);
        }
    }
}
