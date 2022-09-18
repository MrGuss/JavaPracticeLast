package ru.mirea.exercise4;

import java.util.Scanner;

public class Massif {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        int sum = 0;
        int max = 0;
        int min = 0;
        int i = 0;
        while(i < size){
            array[i] = scanner.nextInt();
            sum += array[i];
            i += 1;
        }
        min = array[0];
        max = array[0];
        int j = 0;
        do{
            if(array[j] < min){
                min = array[j];
            }
            if(array[j] > max){
                max = array[j];
            }
            j += 1;
        }
        while(j < size);
        System.out.println("Sum of elements = " + sum);
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}
