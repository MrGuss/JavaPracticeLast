package ru.mirea.exercise2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, double cost, String colour){
        super(size, cost, colour);
    }
    @Override
    public void dressMan(){
        System.out.println("A man puts on a T-shirt");
    }
    @Override
    public void dressWoman(){
        System.out.println("A woman puts on a T-shirt");
    }
    @Override
    public String toString() {
        return "TShirt: " +
                "\n Size: " + getSize() +
                "\n Cost: " + getCost() + " rubles" +
                "\n Colour: " + getColour() +
                "\n Euro size: " + size.getEuroSize() +
                "\n Size information: " + size.getDescription();
    }
}
