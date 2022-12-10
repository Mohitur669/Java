public class QueuesUsingLL2<T> {
    private nodeQueue<T> front;
    private nodeQueue<T> rear;
    int size;

    public QueuesUsingLL2(int i) {
        front = null;
        rear = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    T front() throws QueueEmptyException2 {
        if (size == 0) {
            throw new QueueEmptyException2();
        }
        return front.data;
    }

    void enqueue(T element) {
        nodeQueue<T> newNode = new nodeQueue<>(element);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    T dequeue() throws QueueEmptyException2 {
        if (size == 0) {
            throw new QueueEmptyException2();
        }
        T temp = front.data;
        front = front.next;
        if (size == 1) {
            rear = null;
        }
        size--;
        return temp;
    }
}