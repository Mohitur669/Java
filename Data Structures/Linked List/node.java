public class node<T> {
    T data;
    node<T> next; // this is the reference to the next node

    node(T data) {
        this.data = data;
        next = null;
    }
}