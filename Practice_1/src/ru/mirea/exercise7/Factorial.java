package ru.mirea.exercise7;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int quantity){
        int fact = 1;
        for(int i = 1; i <= quantity; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number < 0){
            System.out.println("Error: factorial is defined only for positive numbers");
        }
        else if(number == 0){
            System.out.println("The factorial = 1");
        }
        else{
            int result = factorial(number);
            System.out.println("The factorial = " + result);
        }
    }
}
