package ru.mirea.exercise5_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password:");
        String password = scanner.nextLine();
        String string = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9a-zA-Z_]){8,}";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()){
            System.out.println("The password is secure");
        }
        else {
            System.out.println("The password is not secure");
        }
    }
}
