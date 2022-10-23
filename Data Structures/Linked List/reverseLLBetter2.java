import java.util.Scanner;

public class reverseLLBetter2 {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = reverseLLbest(head);
        recursivePrintLL(head);
    }

    // reversing a linked list (best approach)
    public static node<Integer> reverseLLbest(node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        node<Integer> reversedTail = head.next;
        node<Integer> smallHead = reverseLLbest(head.next);
        reversedTail.next = head;
        head.next = null;
        return smallHead;
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