import pal.ArrayQueueModule;
public class testModule {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println(ArrayQueueModule.toStr());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.toStr());
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.toStr());
        System.out.println(ArrayQueueModule.isEmpty());
    }
}
