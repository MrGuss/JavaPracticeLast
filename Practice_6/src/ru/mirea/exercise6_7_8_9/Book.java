package ru.mirea.exercise6_7_8_9;

public class Book implements Printable{
    String name;
    String author;
    int year;
    String genre;
    String language;
    public Book(String name, String author, int year, String genre, String language){
        this.name = name;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.language = language;
    }
    @Override
    public void print(){
        System.out.println("Book: \n name: " + name + "; author: " + author + "; year of publication: " + year + "; genre: " + genre + "; original language: " + language + ".");
    }
}
