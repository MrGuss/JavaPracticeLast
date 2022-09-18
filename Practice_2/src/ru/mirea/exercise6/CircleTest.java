package ru.mirea.exercise6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(5.5, 6.6, 7.7);
        double radius = circle.getR();
        System.out.println(circle);
        System.out.println("Radius = " + radius);
        System.out.println("Circumference = " + circle.getLength());
        System.out.println("Area of the circle = " + circle.getSquare());
        System.out.println("Enter a new radius:");
        double newRadius = scanner.nextDouble();
        circle.setR(newRadius);
        System.out.println(circle);
        System.out.println("New radius = " + newRadius);
        System.out.println("Circumference = " + circle.getLength());
        System.out.println("Area of the circle = " + circle.getSquare());
        System.out.println("Comparison of two circles:");
        System.out.println(circle.comparison(radius, newRadius));
    }
}
