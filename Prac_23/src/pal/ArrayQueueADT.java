package pal;

public class ArrayQueueADT {
    private final int START_CAPACITY = 10;
    private Object array[];
    private int size;
    private int head;
    private int tail;

    public ArrayQueueADT() {
        array = new Object[START_CAPACITY];
        size = head = tail = 0;
    }


    // Pre: capacity' > 0
    // Post: if required capacity of array bigger then current
    // Post: capacity' = capacity * 2
    // Inv: if (capacity' = capacity * 2) head < tail
    private static void ensureCapacity(ArrayQueueADT adt, int capacity) {
        if (capacity >= adt.array.length) {
            Object[] temp = new Object[adt.array.length << 1];
            int count = adt.tail < adt.head ? adt.array.length - adt.head : adt.size;
            System.arraycopy(adt.array, adt.head, temp, 0, count);
            if (adt.tail < adt.head)
                System.arraycopy(adt.array, 0, temp, count, adt.tail);
            adt.array = temp;
            adt.head = 0;
            adt.tail = adt.size;
        }
    }

    // Pre: value != null
    // Pre: value is immutable
    // Post: queue[size - 1] = element
    // Post: size' = size + 1
    public static void enqueue(ArrayQueueADT adt, Object element) {
        assert element != null;
        ensureCapacity(adt, adt.size + 1);
        adt.array[adt.tail] = element;
        adt.tail = (adt.tail + 1) % adt.array.length;
        adt.size++;
    }

    // Pre: size > 0
    // Post: Result = queue[0]
    public static Object element(ArrayQueueADT adt) {
        assert adt.size > 0;
        return adt.array[adt.head];
    }

    // Pre: size > 0
    // Post: Result = queue[0]
    // Post: size' = size - 1
    public static Object dequeue(ArrayQueueADT adt) {
        assert adt.size > 0;
        Object result = element(adt);
        adt.array[adt.head] = null;
        adt.size--;
        adt.head = (adt.head + 1) % adt.array.length;
        return result;
    }

    // Post: Result = size
    public static int size(ArrayQueueADT adt) {
        return adt.size;
    }

    // Post: Result = size > 0?
    public static boolean isEmpty(ArrayQueueADT adt) {
        return adt.size == 0;
    }

    // INV: size' = 0;
    // Post: Clear the queue
    public static void clear(ArrayQueueADT adt) {
        adt.size = adt.head = adt.tail = 0;
        adt.array = new Object[adt.START_CAPACITY];
    }

    public static String toString(ArrayQueueADT adt) {
        if (isEmpty(adt)){
            return "Queue: {\n}\n";
        }
        String str = "Queue: \n{";
        for (int i=adt.head;i<adt.tail-1;i++){
            str+=adt.array[i]+",\n";
        }
        str+=adt.array[adt.tail-1] + "}\n";
        return str;
    }
}