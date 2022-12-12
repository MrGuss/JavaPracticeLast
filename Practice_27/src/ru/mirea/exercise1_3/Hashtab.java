package ru.mirea.exercise1_3;

import java.util.Arrays;

public class Hashtab {
    Node[] elements;
    int capacity;

    public Hashtab(){
        capacity = 0;
        elements = new Node[1];
    }

    public int hash(Object key){
        return key.hashCode();
    }

    public int init(Object key){
        if (elements[0] == null){
            return 0;
        }
        for (int i = 0; i < capacity; i++){
            if (elements[i].getHash() == hash(key)){
                return elements[i].getData();
            }
        }
        return 0;
    }

    public void add(Object key, int data){
        if (init(key) == 1) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i].getHash() == hash(key)) {
                    elements[i].setData(data);
                    return;
                }
            }
        }
        else{
            if (capacity == elements.length){
                lookup();
            }
            elements[capacity++] = new Node(hash(key), data);
        }
    }

    public int delete(Object key){
        int hsh = hash(key);
        if (init(hsh) == 0){
            return 0;
        }
        int pos = 0;
        for (int i = 0; i < capacity; i++){
            if (hsh == elements[i].getHash()){
                elements[i] = null;
                pos = i;
                break;
            }
        }
        for (int i = pos; i < capacity - 1; i++){
            elements[i] = elements[i + 1];
            elements[i + 1] = null;
        }
        capacity--;
        return 1;
    }

    public void lookup() {
        this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < capacity; i++){
            out += elements[i] + "\n";
        }
        return out;
    }
}
