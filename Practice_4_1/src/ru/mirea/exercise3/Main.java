package ru.mirea.exercise3;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person("Angel Wilkins", 25);
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
