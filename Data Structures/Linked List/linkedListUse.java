import java.util.Scanner;

public class linkedListUse {
    public static void main(String[] args) {
//        node<Integer> node1 = new node<>(10);
////        System.out.println(node1.data);
////        System.out.println(node1.next);
//        node<Integer> node2 = new node<>(20);
//        node<Integer> node3 = new node<>(30);
//        node1.next = node2; // this line creates a link between node1 and node2
//        node2.next = node3;
//        node<Integer> head = node1;
        // if the node1 and node2 connected via link then this two lines will give the same reference number
//        System.out.println(node2);
//        System.out.println(node1.next);

//        print(head);
//        print(head);

        node<Integer> head = takeInput2();
        print(head);
        System.out.println("After Insertion");
//        head = insertNode(head, 80, 0);
        head = deleteNode(head, 3);
        print(head);
    }

    /* making a function to take list as node, time complexity: O(n^2) */
    public static node<Integer> takeInput() {
        node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<Integer>(data);
            if (head == null) {
                head = newNode;
            } else {
                node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    /* taking input list with better time complexity: O(n) */
    public static node<Integer> takeInput2() {
        node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
//                node<Integer> temp = head;
//                while (temp.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = newNode;
                tail.next = newNode;
                tail = tail.next; // also can use this for this line --> tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    // printing the node using function
    public static void print(node<Integer> head) {
        node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    /* Insert node inside Linked List */
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

    /* Deleting a node inside a linked list */
    public static node<Integer> deleteNode(node<Integer> head, int pos) {
        /* Empty list */
        if (head == null)
            return head;

        /* when position is 0 meaning delete from head */
        if (pos == 0)
            return head.next;

        node<Integer> cur = head;
        while (pos > 1) {
            if (cur == null)
                return head;

            cur = cur.next;
            pos--;
        }

        /* /if last node is to be deleted */
        if (cur.next == null) {
            cur = null;
            return head;
        }

        /* normal deletion */
        cur.next = cur.next.next;
        return head;
    }

    public static node<Integer> deleteNodeSayan(node<Integer> head, int pos) {

        if (head == null) {
            return head;
        }

        if (pos == 0) {
            return head.next;
        }

        int count = 0;
        node<Integer> currHead = head;
        while (currHead != null && count < (pos - 1)) {
            currHead = currHead.next;
            count++;
        }

        if (currHead == null || currHead.next == null) {
            return head;
        }

        currHead.next = currHead.next.next;
        return head;
    }
}