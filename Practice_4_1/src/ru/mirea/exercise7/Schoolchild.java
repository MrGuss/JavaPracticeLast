package ru.mirea.exercise7;

public class Schoolchild extends Learner{
    public int grade;
    public Schoolchild(String name, int age, String gender, int grade, double mark){
        super(name, age, gender, mark);
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    @Override
    public String toString(){
        return "\n Full name: " + getName() +
                "\n Age: " + getAge() +
                "\n Gender: " + getGender() +
                "\n Grade: " + getGrade() +
                "\n Average mark: " + getMark();
    }
}
