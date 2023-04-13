public class LinkedListUse {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Step 1: Create new node
    public void addFirst(int data) {
        // Step 1: Create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: newNode next = head
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(Node head) {
        if (head == null) {
            System.out.print("Linked List is Empty!");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        
    }

    public static void main(String[] args) {
        LinkedListUse ll = new LinkedListUse();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL(head);
    }
}