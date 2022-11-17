package ru.mirea.exercise4;

public class MathFunc implements MathCalculable{
    public long degree(int number, int degree){
        long answer = 1;
        for(int i = 0; i < degree; i++){
            answer = answer * number;
        }
        return answer;
    }
    public double module(double valid, double imaginary){
        double answer;
        answer = Math.sqrt(valid * valid + imaginary * imaginary);
        return answer;
    }
    public static void main(String[] args){
        MathCalculable mc = new MathFunc();
        System.out.println("Exponentiation of a number:");
        System.out.println(mc.degree(10, 3));
        System.out.println("The module of a complex number:");
        System.out.println(mc.module(10.7, 10.8));
        System.out.println("Circumference length:");
        double radius = 5.5;
        double answer = 2 * radius * mc.PI;
        System.out.println(answer);
    }
}
