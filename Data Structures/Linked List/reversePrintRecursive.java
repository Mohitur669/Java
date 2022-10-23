import java.util.Scanner;

public class reversePrintRecursive {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        printRecursiveReverseLL(head);
    }

    // print the Linked list reversely without making it reverse
    public static void printRecursiveReverseLL(node<Integer> head) {
        if (head == null) {
            return;
        }
        printRecursiveReverseLL(head.next);
        System.out.println(head.data + " ");
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
}