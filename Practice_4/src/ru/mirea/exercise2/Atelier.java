package ru.mirea.exercise2;

public class Atelier {
    public void dressMan(Clothes[] array){
        System.out.println("Men's clothing:");
        for(Clothes clothing : array){
            if(clothing instanceof MenClothing){
                System.out.println(clothing + "\n");
            }
        }
    }
    public void dressWoman(Clothes[] array){
        System.out.println("Women's clothing:");
        for(Clothes clothing : array){
            if(clothing instanceof WomenClothing){
                System.out.println(clothing + "\n");
            }
        }
    }
}
