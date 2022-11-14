package ru.mirea.variant3;

public class Node {
    public Object data;
    public Node prev;
    public Node next;

    public Node(Object dataValue){
        prev = null;
        next = null;
        data = dataValue;
    }

    public Node(Object dataValue, Node prevValue, Node nextValue) {
        prev = prevValue;
        next = nextValue;
        data = dataValue;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prevValue) {
        prev = prevValue;
    }

    @Override
    public String toString() {
        String output = " ";
        output = "node data = " + data;
        return output;
    }
}
