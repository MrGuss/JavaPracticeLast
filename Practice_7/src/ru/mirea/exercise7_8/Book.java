package ru.mirea.exercise7_8;

public class Book implements Printable {
    String name;
    String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public static void printBooks(Printable[] printable){
        for(Printable element : printable){
            if(element instanceof Book){
                element.print();
            }
        }
    }
    @Override
    public void print(){
        System.out.println(name + " (" + author + ")");
    }
}
