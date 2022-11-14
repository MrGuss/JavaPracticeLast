package ru.mirea.variant3;

public class List {
    public Node head;
    public int listCount;

    public List(){
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data){
        Node tmp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        tmp.setPrev(current);
        current.setNext(tmp);
        listCount++;
    }

    public void add(Object data, int index){
        Node tmp = new Node(data);
        Node current = head;
        for (int i = 1; (i < index) && (current.getNext() != null); i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        tmp.setPrev(current);
        current.getNext().setPrev(tmp);
        current.setNext(tmp);
        listCount++;
    }

    public Object get(int index){
        if (index <= 0) {
            return null;
        }
        Node current = head.getNext();
        for (int i = 1; i < index; i++){
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index){
        if ((index < 1) && (index > listCount)) {
            return false;
        }
        Node current = head;
        for (int i = 1; i < index; i++){
            if (current.getNext() == null) {
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        current.getNext().setPrev(current);
        listCount--;
        return true;
    }

    public int size(){
        return listCount;
    }

    @Override
    public String toString() {
        Node current = head.getNext();
        String output = "[ ";
        while (current != null){
            output = output + current.getData().toString() + " ";
            current = current.getNext();
        }
        output += "]";
        return output;
    }

    public void swap(int index){
        if (index == 0){
            return;
        }
        Node current = head;
        for (int i = 1; i < index + 1; i++){
            if ((current.getNext() == null) || (size() < index)) {
                return;
            }
            current = current.getNext();
        }
        if ((current == null) || (current.getNext() == null)) {
            return;
        }
        current.getPrev().setNext(current.getNext());
        if (current.getNext().getNext() != null){
            current.getNext().getNext().setPrev(current);
        }
        current.getNext().setPrev(current.getPrev());
        current.setPrev(current.getNext());
        current.setNext(current.getNext().getNext());
        current.getPrev().setNext(current);
    }

    public void sorting(){
        int index = 1;
        while (true){
            if (get(index + 1) == null){
                break;
            }
            if (get(index) == null){
                index++;
            }
            if ((int)get(index) > (int)get(index + 1)){
                swap(index);
                index--;
            }
            else {
                index++;
            }
        }
    }
}
