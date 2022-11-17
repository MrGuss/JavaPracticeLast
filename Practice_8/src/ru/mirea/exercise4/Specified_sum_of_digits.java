package ru.mirea.exercise4;

import java.util.Scanner;

public class Specified_sum_of_digits {
    public static int sumOfDigits(int len, int sum, int k, int s){
        if(k == 0){
            return 0;
        }
        if(len == k){
            if(sum == s){
                return 1;
            }
            else{
                return 0;
            }
        }
        int a;
        if(len == 0){
            a = 1;
        }
        else{
            a = 0;
        }
        int ans = 0;
        for(int i = a; i < 10; i++){
            ans += sumOfDigits(len + 1, sum + i, k, s);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k:");
        int k = scanner.nextInt();
        System.out.println("Enter s:");
        int s = scanner.nextInt();
        System.out.println("Answer:");
        System.out.println(sumOfDigits(0, 0, k, s));
    }
}
