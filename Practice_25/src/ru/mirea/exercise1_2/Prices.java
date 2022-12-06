package ru.mirea.exercise1_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {
    public  static void main(String[] args){
        int counting = 0;
        String prices = "Prices: \n 25.98 USD \n 44 ERR \n 0.004 EU \n 324.00 RUB \n 15.51 EU \n 99.999 RUB \n 500.25 CHF";
        System.out.println(prices);
        String string = "\\d+[.]\\d{2}\\s(USD|RUB|EU)";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(prices);
        while (matcher.find()){
            counting = counting + 1;
            System.out.println("Correct price format: " + matcher.group());
        }
        if (counting == 0){
            System.out.println("No correct price formats were found");
        }
    }
}
