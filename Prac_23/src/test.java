import pal.ArrayQueue;

public class test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
