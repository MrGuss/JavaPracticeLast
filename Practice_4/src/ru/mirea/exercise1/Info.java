package ru.mirea.exercise1;

public class Info {
    public void information(Seasons season){
        switch(season){
            case WINTER:
                System.out.println("New year's eve");
                break;
            case SPRING:
                System.out.println("Awakening of nature");
                break;
            case SUMMER:
                System.out.println("Time for vacations");
                break;
            case AUTUMN:
                System.out.println("Everything is painted in golden shades");
                break;
        }
    }
}
