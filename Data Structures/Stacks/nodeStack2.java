public class nodeStack2<T> {
    public T data;
    public nodeStack2<T> next;

    public nodeStack2(T data) {
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