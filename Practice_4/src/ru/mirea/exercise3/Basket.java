package ru.mirea.exercise3;

import java.util.Scanner;
import java.util.ArrayList;

public class Basket {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Products> basket = new ArrayList<>();
    public void toBasket(){
        System.out.println("Select the item you want to move to the shopping cart to buy it by specifying its code. To complete the selection, enter 0.");
        while(true){
            int option = scanner.nextInt();
            if(option == 0){
                break;
            }
            basket.add(Products.values()[option - 1]);
        }
    }
    public void purchase(){
        int amount = 0;
        for(Products product : basket){
            amount += product.getPrice();
        }
        System.out.println();
        System.out.println("Total: " + amount + " rubles");
        System.out.println();
        System.out.println("Are you sure you want to purchase these products?" + "\n YES" + "\n NO");
        scanner.nextLine();
        String decision = scanner.nextLine();
        switch(decision){
            case "YES":
                System.out.println();
                System.out.println("Enter the card details to pay for the goods and complete the purchase");
                String card = scanner.nextLine();
                System.out.println();
                System.out.println("The payment was successful");
                System.out.println("Thank you for your purchase!");
                break;
            case "NO":
                System.out.println();
                System.out.println("Purchase cancelled");
                break;
        }
    }
}
