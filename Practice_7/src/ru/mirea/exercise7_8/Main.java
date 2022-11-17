package ru.mirea.exercise7_8;

public class Main {
    public static void main(String[] args){
        Printable[] printable = new Printable[]{
                new Book("Harry Potter and the Half-Blood Prince", "J. K. Rowling"),
                new Book("Murder on the Orient Express", "Agatha Christie"),
                new Book("War and peace", "Leo Tolstoy"),
                new Magazine("Vogue"),
                new Magazine("Hello"),
                new Magazine("National Geographic")
        };
        System.out.printf("%16s", "Magazines:");
        System.out.println();
        Magazine.printMagazines(printable);
        System.out.println();
        System.out.printf("%12s", "Books:");
        System.out.println();
        Book.printBooks(printable);
    }
}
