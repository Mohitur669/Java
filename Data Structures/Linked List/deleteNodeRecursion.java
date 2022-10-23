import java.util.Scanner;

public class deleteNodeRecursion {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = deleteNodeRecursionLL(head, 2);
        recursivePrintLL(head);
    }

    // delete a node from a linked list with recursion
    public static node<Integer> deleteNodeRecursionLL(node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        } else {
            node<Integer> smallerHead = deleteNodeRecursionLL(head.next, pos - 1);
            head.next = smallerHead;
            return head;
        }
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