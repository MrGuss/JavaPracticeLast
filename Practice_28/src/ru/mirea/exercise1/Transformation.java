package ru.mirea.exercise1;

import java.util.HashMap;
import java.util.TreeMap;

public class Transformation {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(10, "a");
        hmap.put(20, "bb");
        hmap.put(30, "ccc");
        System.out.println(hmap);
        Integer[] keys = hmap.keySet().toArray(new Integer[0]);
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        for (Integer key : keys){
            tmap.put(key, hmap.get(key));
        }
        System.out.println(tmap);
    }
}
