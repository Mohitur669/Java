import java.util.*;

public class QueueUsing2Stacks<T> {

    Queue<T> q1, q2;

    public QueueUsing2Stacks() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public Queue<T> getQueue() {

        return q1;
    }

    public void push(T data) {
        q1.add(data);
    }

    public T pop() {

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        T temp = q1.poll();

        Queue<T> tempQ = q2;
        q2 = q1;
        q1 = tempQ;

        return temp;
    }

    public T top() {

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        T elem = q1.peek();
        q2.add(q1.poll());

        Queue<T> tempQ = q1;
        q1 = q2;
        q2 = tempQ;

        return elem;
    }

    public int getSize() {
        return q1.size() + q2.size();
    }
}