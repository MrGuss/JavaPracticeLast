package ru.mirea.exercise7;

import java.util.Scanner;

public class Factorization {
    public static void factorization(int n, int num){
        if(n < 2){
            System.out.println("This number has no prime factors");
        }
        else if(num > n / 2){
            System.out.println(n);
        }
        else if(n % num == 0){
            System.out.println(num);
            factorization(n / num, num);
        }
        else{
            factorization(n, num + 1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n > 1:");
        int n = scanner.nextInt();
        System.out.println("Answer:");
        factorization(n, 2);
    }
}
