package ru.mirea.exercise6_7_8_9;

public class Shop implements Printable{
    String name;
    String periodicity;
    String thematics;
    String editor;
    int year;
    public Shop(String name, String periodicity, String thematics, String editor, int year){
        this.name = name;
        this.periodicity = periodicity;
        this.thematics = thematics;
        this.editor = editor;
        this.year = year;
    }
    @Override
    public void print(){
        System.out.println("Journal: \n name: " + name + "; periodicity: " + periodicity + "; thematics: " + thematics + "; chief editor: " + editor + "; year of foundation: " + year + ".");
    }
}
