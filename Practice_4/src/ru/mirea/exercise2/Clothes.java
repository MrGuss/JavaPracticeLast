package ru.mirea.exercise2;

public abstract class Clothes {
    public Sizes size;
    public double cost;
    public String colour;
    public Clothes(Sizes size, double cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }
    public Sizes getSize() {
        return size;
    }
    public double getCost() {
        return cost;
    }
    public String getColour() {
        return colour;
    }
}
