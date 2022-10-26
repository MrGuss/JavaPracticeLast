package ru.mirea.exercise3;

import java.util.Scanner;

public class Authentication {
    public String savedLogin = "Hugoaaaaa";
    public String savedPassword = "@HDot4Nm";
    public String login;
    public String password;
    public boolean check;
    public void authorization(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        login = scanner.nextLine();
        System.out.println("Enter the password");
        password = scanner.nextLine();
        if(login.equals(savedLogin) && password.equals(savedPassword)){
            System.out.println("You are logged in");
            check = true;
        }
        else{
            System.out.println("You are not logged in, check your username and password for errors");
            check = false;
        }
    }
}
