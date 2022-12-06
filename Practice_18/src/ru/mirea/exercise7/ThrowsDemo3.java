package ru.mirea.exercise7;

import java.util.Scanner;

public class ThrowsDemo3 {
    public static void main(String[] args) {
        getKey();
    }

    private static String getDetails(String key) throws Exception {
        if (key == "null") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception exception) {
            throw exception;
        }
    }

    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key");
        String key = scanner.next();
        try {
            printDetails(key);
        }
        catch (Exception exception) {
            System.out.println("Error");
        }
    }
}
