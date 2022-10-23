import java.util.Scanner;

public class reverseIterativeLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = reverseIterative(head);
        recursivePrintLL(head);
    }

    // reversing a linked list iteratively (means without using a recursion)
    public static node<Integer> reverseIterative(node<Integer> head) {
        node<Integer> curr = head;
        node<Integer> prev = null;
        node<Integer> temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

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