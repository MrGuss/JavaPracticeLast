package ru.mirea.exercise2;

public class Main {
    public static void main(String[] args){
        Clothes[] clothes = new Clothes[]{
                new TShirt(Sizes.XXS, 500.9, "red"),
                new TShirt(Sizes.M, 490.9, "white"),
                new Pants(Sizes.XS, 1300.9, "blue"),
                new Pants(Sizes.L, 1500.9, "black"),
                new Skirt(Sizes.S, 1700.9, "green"),
                new Tie(Sizes.S, 310.9, "orange")
        };
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}
