package ru.mirea.exercise1;

public class Main {
    public static void main(String[] args){
        Shape[] shape = new Shape[]{
                new Circle("circle", 10),
                new Rectangle("rectangle", 20, 30),
                new Square("square", 40)
        };
        for(Shape figure : shape){
            System.out.println(figure);
            System.out.println();
        }
    }
}
