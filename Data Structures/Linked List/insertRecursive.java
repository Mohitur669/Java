import java.util.Scanner;

public class insertRecursive {
    public static void main(String[] args) {

    }

//    public static void

    public static node<Integer> takeInput() {
        node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next; // also can use this for this line --> tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void recursivePrintLL(node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        recursivePrintLL(head.next);
    }
}