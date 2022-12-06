package ru.mirea.exercise1_3;

public class Animal {
    public String kind;
    public String breed;
    public String character;

    Animal(String kind, String breed, String character){
        this.kind = kind;
        this.breed = breed;
        this.character = character;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", breed='" + breed + '\'' +
                ", character='" + character + '\'' +
                '}';
    }
}
