package ru.mirea.exercise5_6;

public interface Strings {
    static int counting(String line){
        return line.length();
    }

    static String oddString(String line){
        StringBuilder string = new StringBuilder();
        for(int i = 1; i < line.length(); i = i + 2){
            string.append(line.charAt(i));
        }
        return string.toString();
    }

    static String invertedString(String line){
        StringBuilder string = new StringBuilder();
        for(int i = line.length() - 1; i >= 0; i--){
            string.append(line.charAt(i));
        }
        return string.toString();
    }
}
