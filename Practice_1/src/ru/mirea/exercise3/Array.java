package ru.mirea.exercise3;

public class Array {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        float mean = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        mean = (float)sum / array.length;
        System.out.println("Sum of elements = " + sum);
        System.out.println("Arithmetic mean of the elements = " + mean);
    }
}
