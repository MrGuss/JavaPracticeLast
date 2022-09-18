package ru.mirea.exercise9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] suit = {"spades", "clubs", "diamonds", "hearts"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        System.out.println("Enter the number of players");
        int n = scanner.nextInt();
        if((n < 11) & (n > 0)){
            String[] deck = new String[52];
            for(int i = 0; i < 13; i++){
                for(int j = 0; j < 4; j++){
                    deck[4 * i + j] = rank[i] + " " + suit[j];
                }
            }
            for(int k = 0; k < 52; k++){
                int variable = k + (int)(Math.random() * (52 - k));
                String map = deck[variable];
                deck[variable] = deck[k];
                deck[k] = map;
            }
            for(int u = 0; u < 5 * n; u++){
                System.out.println(deck[u]);
                if(u % 5 == 4){
                    System.out.println();
                }
            }
        }
        else{
            System.out.println("Incorrect number of players entered");
        }
    }
}
