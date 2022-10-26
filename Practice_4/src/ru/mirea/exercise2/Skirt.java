package ru.mirea.exercise2;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Sizes size, double cost, String colour){
        super(size, cost, colour);
    }
    @Override
    public void dressWoman(){
        System.out.println("A woman puts on a skirt");
    }
    @Override
    public String toString() {
        return "Skirt: " +
                "\n Size: " + getSize() +
                "\n Cost: " + getCost() + " rubles" +
                "\n Colour: " + getColour() +
                "\n Euro size: " + size.getEuroSize() +
                "\n Size information: " + size.getDescription();
    }
}
