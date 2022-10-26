package ru.mirea.exercise2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Sizes size, double cost, String colour){
        super(size, cost, colour);
    }
    @Override
    public void dressMan(){
        System.out.println("A man puts on pants");
    }
    @Override
    public void dressWoman(){
        System.out.println("A woman puts on pants");
    }
    @Override
    public String toString() {
        return "Pants: " +
                "\n Size: " + getSize() +
                "\n Cost: " + getCost() + " rubles" +
                "\n Colour: " + getColour() +
                "\n Euro size: " + size.getEuroSize() +
                "\n Size information: " + size.getDescription();
    }
}
