package ru.mirea.exercise1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Author author = new Author("Pietro", "famous@gmail.com", 'M');
        System.out.println(author);
        String newEmail = scanner.nextLine();
        author.setEmail(newEmail);
        System.out.println(author);
    }
}
