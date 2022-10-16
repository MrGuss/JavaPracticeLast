package ru.mirea.exercise1_MathRandom;

import java.util.Random;
import java.util.Arrays;

public class GeneratorRandom {
    public static void main(String[] args){
        Random rand = new Random();
        double[] array = new double[7];
        System.out.println("Random array:");
        for(int i = 0; i < array.length; i++){
            array[i] = (rand.nextDouble(100) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("Sorted array:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
