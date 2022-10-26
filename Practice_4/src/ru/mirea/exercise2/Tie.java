package ru.mirea.exercise2;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, double cost, String colour){
        super(size, cost, colour);
    }
    @Override
    public void dressMan(){
        System.out.println("A man puts on a tie");
    }
    @Override
    public String toString() {
        return "Tie: " +
                "\n Size: " + getSize() +
                "\n Cost: " + getCost() + " rubles" +
                "\n Colour: " + getColour() +
                "\n Euro size: " + size.getEuroSize() +
                "\n Size information: " + size.getDescription();
    }
}
