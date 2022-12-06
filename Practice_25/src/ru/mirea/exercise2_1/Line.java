package ru.mirea.exercise2_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Line {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line:");
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String string = scanner.nextLine();
        Matcher matcher = pattern.matcher(string);
        if(matcher.matches()){
            System.out.println("The string is correct");
        }
        else{
            System.out.println("The string is not correct");
        }
    }
}
