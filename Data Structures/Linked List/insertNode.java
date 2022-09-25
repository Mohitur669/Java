import java.util.Scanner;

public class insertNode {
    public static void main(String[] args) {
        System.out.println("Insert -1 to quit!");
        node<Integer> head = takeInput();
        print(head);
        System.out.println("After Insertion");
        head = insertNode(head, 80, 2);
        print(head);
    }

    public static node<Integer> insertNode(node<Integer> head, int data, int pos) {
        node<Integer> newNode = new node<>(data);
        int i = 0;
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
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