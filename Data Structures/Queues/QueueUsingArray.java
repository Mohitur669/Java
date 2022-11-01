public class QueueUsingArray {
    private int[] data;
    private int front; // index at which the front element is sorted
    private int rear; // index at which the rear element is sorted
    private int size;

    public QueueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int element) throws QueueFullException {
        if (size == data.length) {
//            throw new QueueFullException();
            /* making the queue dynamic */
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
//        rear++;
//        if (rear == data.length) {
//            rear = 0;
//        }
        /* We can write above three line code like this */
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
//        front++;
//        if (front == data.length) {
//            front = 0;
//        }
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    // making the Queue Dynamic
    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i <= front - 1; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }
}