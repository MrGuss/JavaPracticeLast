package ru.mirea.exercise1;

import java.util.Scanner;

public class Roads {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] matrix = new int[number][number];
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int quantity = 0;
        for (int i = 0; i < number; i++){
            for (int j = i; j < number; j++){
                quantity = quantity + matrix[i][j];
            }
        }
        System.out.println("Number of roads:");
        System.out.println(quantity);
    }
}
