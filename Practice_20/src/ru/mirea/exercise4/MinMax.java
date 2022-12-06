package ru.mirea.exercise4;

import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    public T[] array;

    public MinMax(T[] array){
        this.array = array;
    }

    public T minimum(){
        T minimum;
        if(array.length > 0){
            minimum = array[0];
            for(T t : array){
                if(t.compareTo(minimum) < 0){
                    minimum = t;
                }
            }
            return minimum;
        }
        return null;
    }

    public T maximum(){
        T maximum;
        if(array.length > 0){
            maximum = array[0];
            for(T t : array){
                if(t.compareTo(maximum) > 0){
                    maximum = t;
                }
            }
            return maximum;
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
