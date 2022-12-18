import pal.ArrayQueueADT;

public class testADT {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, 1);
        ArrayQueueADT.enqueue(queue,2);
        ArrayQueueADT.enqueue(queue,3);
        System.out.println(ArrayQueueADT.toString(queue));
        System.out.println(ArrayQueueADT.dequeue(queue));
        System.out.println(ArrayQueueADT.toString(queue));
        System.out.println(ArrayQueueADT.element(queue));
        System.out.println(ArrayQueueADT.size(queue));
        System.out.println(ArrayQueueADT.isEmpty(queue));
        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.toString(queue));
        System.out.println(ArrayQueueADT.isEmpty(queue));
    }
}