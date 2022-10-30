package ru.mirea.exercise3;

public class Person {
    public String fullName;
    public  int age;
    public void move(){
        System.out.println(fullName + ", age " + age + ", is coming.");
    }
    public void talk(){
        System.out.println(fullName + ", age " + age + ", is speaking.");
    }
    public Person(){
        fullName = "Arthur Barton";
        age = 27;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
}
