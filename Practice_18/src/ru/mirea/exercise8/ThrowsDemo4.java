package ru.mirea.exercise8;

import java.util.Scanner;

public class ThrowsDemo4 {
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
        String message = getDetails(key);
        System.out.println(message);
    }

    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the key");
            String key = scanner.next();
            try {
                printDetails(key);
                break;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
