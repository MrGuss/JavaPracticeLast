package ru.mirea.exercise1_Shells;

import java.util.Random;

public class Shells {
    public static void main(String[] args){
        Random rand = new Random();
        Double variable1 = Double.valueOf(rand.nextDouble(100));
        Double variable2 = Double.parseDouble("937.15");
        System.out.println("Created object: " + variable1);
        System.out.println("Converted value: " + variable2);
        byte byteType = variable1.byteValue();
        short shortType = variable1.shortValue();
        int intType = variable1.intValue();
        long longType = variable1.longValue();
        float floatType = variable1.floatValue();
        double doubleType = variable1.doubleValue();
        System.out.println("Object values: " + byteType + "; " + shortType + "; " + intType + "; " + longType + "; " + floatType + "; " + doubleType);
        double literal = 3.14;
        String str = Double.toString(literal);
        System.out.println("Literal conversion: value - " + str + "; class - " + str.getClass());
    }
}
