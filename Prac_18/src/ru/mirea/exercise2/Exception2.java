package ru.mirea.exercise2;

import java.util.Scanner;

public class Exception2 {
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
        catch (ArithmeticException | NumberFormatException exception) {
            System.out.println("Error");
        }
    }
}
