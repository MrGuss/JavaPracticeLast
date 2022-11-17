package ru.mirea.exercise5;

import java.util.Scanner;

public class Sum_of_digits_of_number {
    public static int digitsOfNumber(int n){
        if(n == 0){
            return 0;
        }
        int ans = n % 10 + digitsOfNumber(n / 10);
        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = scanner.nextInt();
        System.out.println("Answer:");
        System.out.println(digitsOfNumber(N));
    }
}
