package ru.mirea.exercise2;

import java.util.List;
import java.util.ArrayList;

public class Realization {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(70);
        list.add(90);
        NewIterator<Integer> iterator = new NewIterator<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
