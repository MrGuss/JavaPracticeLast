package ru.mirea.exercise5;

public class Book {
    public String name;
    public String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString(){
        return "\n Title of the book: " + name +
                "\n Author of the book: " + author;
    }
}
