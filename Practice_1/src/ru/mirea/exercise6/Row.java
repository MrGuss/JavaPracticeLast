package ru.mirea.exercise6;

public class Row {
    public static void main(String[] args){
        float number;
        float n = 1;
        System.out.println("Harmonic series: ");
        for(int i = 1; i <= 10; i++){
            number = n / i;
            System.out.println("a" + i + " = " + number);
        }
    }
}
