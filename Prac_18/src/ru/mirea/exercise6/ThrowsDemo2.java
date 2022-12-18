package ru.mirea.exercise6;

public class ThrowsDemo2 {
    public static void main(String[] args) {
        try {
            printMessage("key");
            printMessage(null);
        }
        catch (NullPointerException exception) {
            System.out.println("Error");
        }
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
