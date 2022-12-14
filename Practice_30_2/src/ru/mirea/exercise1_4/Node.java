package ru.mirea.exercise1_4;

public class Node {
    int data;
    Node nextL;
    Node nextR;
    Node prev;

    public Node(int dataValue) {
        nextL = null;
        nextR = null;
        prev = this;
        data = dataValue;
    }

    public Node() {
        nextL = null;
        nextR = null;
        prev = this;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int dataValue) {
        data = dataValue;
    }

    public Node getNextL() {
        return nextL;
    }

    public Node getNextR() {
        return nextR;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNextL(Node nextValue) {
        nextL = nextValue;
    }

    public void setNextR(Node nextValue) {
        nextR = nextValue;
    }

    public void setPrev(Node prevValue) {
        prev = prevValue;
    }

    @Override
    public String toString() {
        String output = "";
        output = "node data = " + data;
        return output;
    }
}
