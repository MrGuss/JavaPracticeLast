package ru.mirea.exercise6;

public class Circle {
    private double x;
    private double y;
    private double r;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }

    public double getLength(){
        double l;
        l = 2 * Math.PI * r;
        return l;
    }

    public double getSquare(){
        double s;
        s = Math.PI * r * r;
        return s;
    }

    public String comparison(double firstR, double secondR){
        String str;
        if(firstR > secondR){
            str = "The radius of the first circle is larger, which means that both its length and the area of the circle are larger";
        }
        else{
            str = "The radius of the second circle is larger, which means that both its length and the area of the circle are larger";
        }
        return str;
    }
}
