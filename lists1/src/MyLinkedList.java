public class MyLinkedList {
    private Node head;
    private int listCount;
    public MyLinkedList() {
        head = new Node();
        listCount = 0;
    }
    public MyLinkedList(String name, int grade) {
        head = new Node(name, grade);
        listCount = 0;
    }
    public void add(String name, int grade){
        Node tmp = new Node(name, grade);
        Node current = head;
        while (current.getNext() != head){
            current = current.getNext();
        }
        current.setNext(tmp);
        tmp.setNext(head);
        listCount++;
    }
    public Node get(int index){
        if (index < 0) return null;
        Node current = head;
        for (int i = 0; i < index; i++){
            if (current.getNext() == null) return null;
            current = current.getNext();
        }
        return current;
    }

    public boolean set(int index, String name, int grade){
        if (index < 0) return false;
        Node current = head;
        for (int i = 0; i < index; i++){
            if (current.getNext() == head) return false;
            current = current.getNext();
        }
        current.setGrade(grade);
        current.setName(name);
        return true;
    }

    public boolean remove(int index){
        if (index < 1 && index > size()) return false;
        Node current = head;
        for (int i =1; i < index; i++){
            if (current.getNext() == head) return false;
            current = current.getNext();
        }
        current.getNext().getNext().setPrev(current);
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
    public boolean swap(int in1, int in2){
        if (in1==in2){
            return true;
        }
        if ((in1<0) || (in2<0)){
            return false;
        }
        String buf_name = this.get(in1).getName();
        int buf_grade = this.get(in1).getGrade();
        this.set(in1, this.get(in2).getName(), this.get(in2).getGrade());
        this.set(in2, buf_name, buf_grade);
        return true;
    }

    public boolean swap(Node in1, Node in2){
        if (in1==in2){
            return true;
        }
        Node buf = in1;
        in1 = in2;
        in2 = buf;
        return true;
    }

    public int size(){ return listCount; }

    @Override
    public String toString() {
        if (head.getNext()==head){
            return "Empty db";
        }
        Node current = head.getNext();
        String output = "";
        do {
            output+="["+current.toString()+"]\n";
            current = current.getNext();}
        while (current != head);
        return output;
    }
}