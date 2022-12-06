package ru.mirea.exercise5;

public class ThrowsDemo1 {
    public static void main(String[] args) {
        printMessage("key");
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
}
