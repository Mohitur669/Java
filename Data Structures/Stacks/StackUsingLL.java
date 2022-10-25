public class StackUsingLL<T> {
    private nodeStack2<T> head;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    T top() throws StackEmptyException {
        if (size() == 0) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    boolean isEmpty() {
        return size() == 0; // head = null
    }

    void push(T element) {
        nodeStack2<T> newNode = new nodeStack2<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() throws StackEmptyException {
        if (size() == 0) {
            throw new StackEmptyException();
        }
        T tempData = head.data;
        head = head.next;
        size--;
        return tempData;
    }
}