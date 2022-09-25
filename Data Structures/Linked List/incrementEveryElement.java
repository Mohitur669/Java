import java.util.Scanner;

public class incrementEveryElement {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        incrementElement(head);
        print(head);
    }

    public static void incrementElement(node<Integer> head) {
        node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
        System.out.println();
    }

    public static node<Integer> takeInput() {
        node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<Integer>(data);
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

    public static void print(node<Integer> head) {
        node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}