package ru.mirea.exercise1_3;

import java.io.Serializable;

public class Main<T extends Comparable<T>, V extends Animal & Serializable, K> {
    public static void main(String[] args){
        Main main = new Main(17, new Animal("cat", "siberian", "stable"), 18.5);
        main.type();
    }

    public T t;
    public V v;
    public K k;

    Main(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void type() {
        System.out.println("t = " + t + "; class = " + t.getClass() + "; \n"
        + "v = " + v + "; class = " + v.getClass() + "; \n"
        + "k = " + k + "; class = " + k.getClass() + ".");
    }
}
