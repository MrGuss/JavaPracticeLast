package ru.mirea.exercise7_8;

public class Magazine implements Printable {
    String name;
    public Magazine(String name){
        this.name = name;
    }
    public static void printMagazines(Printable[] printable){
        for(Printable element : printable){
            if(element instanceof Magazine){
                element.print();
            }
        }
    }
    @Override
    public void print(){
        System.out.println(name);
    }
}
