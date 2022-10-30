package ru.mirea.exercise1;

public class Shape {
    public String type;
    public Shape(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    @Override
    public String toString(){
        return "Type of geometric shape: " + getType();
    }
}
