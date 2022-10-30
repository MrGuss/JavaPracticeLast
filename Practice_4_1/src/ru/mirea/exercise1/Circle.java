package ru.mirea.exercise1;

public class Circle extends Shape {
    public double radius;
    public Circle(String type, double radius){
        super(type);
        this.radius = radius;
    }
    @Override
    public String getType(){
        return type;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return "Type of geometric shape: " + getType() +
                "\n Area of geometric shape: " + getArea() +
                "\n Perimeter of geometric shape: " + getPerimeter();
    }
}
