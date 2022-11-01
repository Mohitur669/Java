public class nodeQueue<T> {
    T data;
    nodeQueue<T> next;

    nodeQueue(T data) {
        this.data = data;
        next = null;
    }
}