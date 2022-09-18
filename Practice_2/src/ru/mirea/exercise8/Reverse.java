package ru.mirea.exercise8;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String word;
        for(int i = 0; i < array.length / 2; i++){
            word = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = word;
        }
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
    }
}
