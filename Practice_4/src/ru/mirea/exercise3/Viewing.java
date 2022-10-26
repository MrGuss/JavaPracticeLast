package ru.mirea.exercise3;

import java.util.Scanner;

public class Viewing {
    public void watchCatalog(){
        System.out.println();
        System.out.println("Product catalog:");
        for(int i = 0; i < Catalog.values().length; i++){
            int j = i + 1;
            System.out.println(j + ") " + Catalog.values()[i]);
        }
    }
    public void watchProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Select a category:");
        int choice = scanner.nextInt();
        System.out.println();
        Catalog selection = null;
        switch(choice){
            case 1:
                selection = Catalog.SMARTPHONES;
                break;
            case 2:
                selection = Catalog.HEADPHONES;
                break;
            case 3:
                selection = Catalog.POWERBANKS;
                break;
        }
        for(Products product : Products.values()){
            if(product.getCatalog() == selection){
                System.out.println(product);
                System.out.println();
            }
        }
    }
}
