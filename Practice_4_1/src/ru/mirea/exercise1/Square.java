package ru.mirea.exercise1;

public class Square extends Shape {
    public double side;
    public Square(String type, double side){
        super(type);
        this.side = side;
    }
    @Override
    public String getType(){
        return type;
    }
    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
    @Override
    public String toString(){
        return "Type of geometric shape: " + getType() +
                "\n Area of geometric shape: " + getArea() +
                "\n Perimeter of geometric shape: " + getPerimeter();
    }
}
