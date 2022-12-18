package ru.mirea.exercise4;

public class Main {
    public static void main(String[] args) {
        MinMax<Integer> element = new MinMax<>(new Integer[]{100, 200, 300, 400, 500});
        System.out.println("Array:");
        System.out.println(element);
        System.out.println("Minimum array element: " + element.minimum());
        System.out.println("Maximum array element: " + element.maximum());
        System.out.println();
        System.out.println("Sum: " + Calculator.sum(32.5, 42.6));
        System.out.println("Multiply: " + Calculator.multiply(18.0, 68.1));
        System.out.println("Divide: " + Calculator.divide(40.7, 64.7));
        System.out.println("Subtraction: " + Calculator.subtraction(49.3, 72.9));
    }
}
