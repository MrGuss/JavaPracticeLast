package ru.mirea.exercise8;

import java.util.Scanner;

public class Palindrome {
    public static String palindrome(String line){
        if(line.length() == 1){
            return "YES";
        }
        else{
            if(line.substring(0, 1).equals(line.substring(line.length() - 1, line.length()))){
                if(line.length() == 2){
                    return "YES";
                }
                return palindrome(line.substring(1, line.length() - 1));
            }
            else{
                return "NO";
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String string = scanner.nextLine();
        System.out.println("Answer:");
        System.out.println(palindrome(string));
    }
}
