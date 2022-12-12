package ru.mirea.exercise1_3;

public class Node {
    int data;
    int hash;

    public Node(int hash, int dataValue){
        this.hash = hash;
        data = dataValue;
    }

    public int getData() {
        return this.data;
    }

    public int getHash() {
        return this.hash;
    }

    public void setData(int dataValue) {
        data = dataValue;
    }

    @Override
    public String toString() {
        String output = "";
        output = "node data = " + data;
        return output;
    }
}
