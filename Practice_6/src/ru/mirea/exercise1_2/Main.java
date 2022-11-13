package ru.mirea.exercise1_2;

public class Main {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 7);
        System.out.println("Starting point \n" + point);
        System.out.println();
        point.moveUp();
        point.moveLeft();
        System.out.println("Point after moving \n" + point);
        System.out.println();
        System.out.println("Original circle \n" + circle);
        System.out.println();
        circle.moveDown();
        circle.moveRight();
        System.out.println("Circle after moving \n" + circle);
        System.out.println();
        MovableRectangle rectangle = new MovableRectangle(1, 5, 5, 1, 10, 10);
        System.out.println("The original rectangle \n" + rectangle);
        System.out.println();
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println("Rectangle after moving \n" + rectangle);
    }
}
