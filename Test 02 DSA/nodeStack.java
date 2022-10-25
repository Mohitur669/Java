public class nodeStack<T> {
    public T data;
    public nodeStack<T> next;

    public nodeStack(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}