public class StackUse {
    public static void main(String[] args) throws StackFullException {
        /* Stack using Array */
//        stackUsingArray stack = new stackUsingArray(3);

        /* Stack using LL */
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // Never Reach Here
            }
        }
    }
}