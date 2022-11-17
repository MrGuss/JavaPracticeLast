package ru.mirea.exercise6;

import java.util.Scanner;

public class Checking_the_number_for_simplicity {
    public static String simplicity(int n, int div){
        if(n < 2){
            return "NO";
        }
        else if(n == 2){
            return "YES";
        }
        else if(n % div == 0){
            return "NO";
        }
        else if(div < n / 2){
            return simplicity(n, div + 1);
        }
        else{
            return "YES";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n > 1:");
        int n = scanner.nextInt();
        System.out.println("Answer:");
        System.out.println(simplicity(n, 2));
    }
}
