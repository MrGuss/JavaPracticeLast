package ru.mirea.exercise7;

public class Student extends Learner{
    public int course;
    public Student(String name, int age, String gender, int course, double mark){
        super(name, age, gender, mark);
        this.course = course;
    }
    public int getCourse(){
        return course;
    }
    @Override
    public String toString(){
        return "\n Full name: " + getName() +
                "\n Age: " + getAge() +
                "\n Gender: " + getGender() +
                "\n Course: " + getCourse() +
                "\n Average mark: " + getMark();
    }
}
