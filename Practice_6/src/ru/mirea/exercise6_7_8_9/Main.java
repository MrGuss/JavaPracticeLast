package ru.mirea.exercise6_7_8_9;

public class Main {
    public static void main(String[] args){
        Printable[] printable = new Printable[]{
                new Book("Harry Potter and the Half-Blood Prince", "J. K. Rowling", 2005, "fantasy", "british english"),
                new Book("Murder on the Orient Express", "Agatha Christie", 1934, "detective", "english"),
                new Book("War and peace", "Leo Tolstoy", 1865, "epic novel", "russian"),
                new Shop("Vogue", "monthly", "fashion", "Anna Wintour", 1892),
                new Shop("Hello", "weekly", "celebrities", "Olga Rodionova", 1988),
                new Shop("National Geographic", "monthly", "geography", "Susan Goldberg", 1888)
        };
        for(Printable object : printable){
            object.print();
        }
    }
}
