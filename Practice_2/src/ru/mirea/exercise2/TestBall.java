package ru.mirea.exercise2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Ball ball = new Ball();
        System.out.println(ball);
        double newX = scanner.nextDouble();
        double newY = scanner.nextDouble();
        ball.move(newX, newY);
        System.out.println(ball);
    }
}
