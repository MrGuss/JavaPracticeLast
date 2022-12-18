package ru.mirea.exercise1;

import java.util.Scanner;
import java.util.Random;

public class Order {
    public static void main(String[] args){
        try{
            purchase();
        }
        catch (INN exception){
            exception.printStackTrace();
        }
    }

    public static boolean valid(String number){
        Random check = new Random();
        return check.nextBoolean();
    }

    public static void purchase() throws INN {
        Scanner scanner = new Scanner(System.in);
        String name, surname, patronymic, INN;
        System.out.println("Enter your name, surname, patronymic sequentially:");
        name = scanner.nextLine();
        surname = scanner.nextLine();
        patronymic = scanner.nextLine();
        System.out.println("Enter your INN number:");
        INN = scanner.nextLine();
        if(valid(INN)){
            throw new INN("Your INN number is invalid");
        }
        System.out.println("Purchase completed");
    }
}
