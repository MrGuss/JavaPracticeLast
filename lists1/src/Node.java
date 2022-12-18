/*** Created by natalazorina on 03.04.15. */
public class Node {
    String name;
    int grade;
    Node next;
    Node prev;
    public Node(String nameValue, int gradeValue){
        next = this;
        prev = this;
        name = nameValue;
        grade = gradeValue;
    }

    public Node() {
        next=this;
        prev=this;
        name = null;
        grade = -1;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() { return next; }
    public Node getPrev() { return prev; }
    public void setNext(Node nextValue) { next = nextValue; }
    public void setPrev(Node prevValue) { prev = prevValue; }
    @Override
    public String toString() {
        return "Student "+name + " at grade " + grade;
    }
}
