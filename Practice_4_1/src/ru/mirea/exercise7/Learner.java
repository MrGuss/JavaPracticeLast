package ru.mirea.exercise7;

public class Learner {
    public String name;
    public int age;
    public String gender;
    public double mark;
    public Learner(String name, int age, String gender, double mark){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public double getMark() {
        return mark;
    }
}
