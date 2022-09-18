package ru.mirea.exercise10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words");
        String[] text = scanner.nextLine().split(" ");
        if((text.length % 10 == 1) & (text.length != 11)){
            System.out.println("You have entered " + text.length + " word");
        }
        else{
            System.out.println("You have entered " + text.length + " words");
        }
    }
}
