package ru.mirea.exercise3;

import java.util.Iterator;
import java.util.Arrays;

public class NewList<T> implements Iterable<T> {
    public int size = 0;
    public Object elements[];
    public int minimum = 1;

    public NewList(){
        this.elements = new Object[this.minimum];
    }

    public void expand(){
        this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    public void add(T object){
        if(this.size == elements.length){
            this.expand();
        }
        this.elements[this.size++] = object;
    }

    public T get(int position){
        if(position >= this.size || position < 0){
            throw new IndexOutOfBoundsException("Index: " + position + ", size: " + position);
        }
        return (T) this.elements[position];
    }

    public T pop(){
        Object last = this.elements[this.size - 1];
        this.elements[size - 1] = null;
        this.size = this.size - 1;
        return (T) last;
    }

    public int size(){
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return  new Iterator<T>() {
            public int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < size;
            }

            @Override
            public T next() {
                return (T) elements[pointer++];
            }
        };
    }

    @Override
    public String toString() {
        String string = " ";
        for(int i = 0; i < this.size; i++){
            string = string + this.elements[i] + " ";
        }
        return "elements = " + string;
    }
}
