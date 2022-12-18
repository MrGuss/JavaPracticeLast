package ru.mirea.exercise3;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception exception) {
            System.out.println("Error");
        }
    }
}
