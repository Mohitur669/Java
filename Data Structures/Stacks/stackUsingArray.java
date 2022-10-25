public class stackUsingArray {
    private int[] data;
    private int top;

    public stackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public stackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public int top() throws StackEmptyException {
        if (size() == 0) {
            // Stack Empty Exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int element) throws StackFullException {
        /*if we want to make the stack dynamic then we don't have to limit the stack with StackFullException
         In the dynamic array case, we should double the capacity of the stack */
        if (size() == data.length) {
            // Stack Full Exception
//            StackFullException e = new StackFullException();
//            throw e;
            doubleCapacity();
        }
        top++;
        data[top] = element;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        for (int i = 0; i <= top; i++) {
            data[i] = temp[i];
        }
    }

    public int pop() throws StackEmptyException {
        if (size() == 0) {
            // Stack Empty Exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}