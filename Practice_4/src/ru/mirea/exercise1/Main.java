package ru.mirea.exercise1;

public class Main {
    public static void main(String[] args){
        Seasons favouriteSeason = Seasons.SPRING;
        System.out.println("My favourite season:");
        System.out.println(favouriteSeason);
        Info info = new Info();
        info.information(favouriteSeason);
        System.out.println("The average temperature: " + favouriteSeason.getAverageTemperature() + " degrees Celsius");
        Love love = new Love();
        love.favorite(favouriteSeason);
        System.out.println();
        for(Seasons season : Seasons.values()){
            System.out.println(season);
            info.information(season);
            System.out.println("The average temperature: " + season.getAverageTemperature() + " degrees Celsius");
            System.out.println(season.getDescription());
            System.out.println();
        }
    }
}
