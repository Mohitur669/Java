package generics;

/*
Generics allows us to generalize the class. And use it later likewise.
It can be used as integer, string, float, double at the same time.

If I want to make a generic class only single data type then use this "public class pair<T>"
but if you want to use many data type in single generic class then use "public class pair<T, V>"
 */

public class pair<T, V> {
    private T first;
    private V second;

    public pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}