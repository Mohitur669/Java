import java.util.Scanner;

public class reverseLLBetter {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        doubleNode ans = reverseLL2(head);
        recursivePrintLL(ans.head);
    }

    // reversing a linked list with better time complexity (returning two values instead of one)
    public static doubleNode reverseLL2(node<Integer> head) {
        if (head == null || head.next == null) {
            doubleNode ans = new doubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        doubleNode smallAns = reverseLL2(head.next);
        smallAns.tail.next = head;
        head.next = null;

        doubleNode ans = new doubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
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