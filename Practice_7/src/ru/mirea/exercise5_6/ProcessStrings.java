package ru.mirea.exercise5_6;

public class ProcessStrings implements Strings{
    public static void main(String[] args){
        String string = "Silence is always filled with words";
        System.out.println("\n The original phrase:");
        System.out.println(string);
        System.out.println("\n Number of characters per line:");
        System.out.println(Strings.counting(string));
        System.out.println("\n Odd string:");
        System.out.println(Strings.oddString(string));
        System.out.println("\n Inverted string:");
        System.out.println(Strings.invertedString(string));
    }
}
