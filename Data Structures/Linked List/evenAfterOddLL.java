/*
Arrange elements in a given Linked List such that, all even numbers are placed after odd numbers.
Respective order of elements should remain same. Note: Input and Output has already managed for you.
You don't need to print the elements, instead return the head of updated LL.

Input format:
Linked list elements (separated by space and terminated by -1)
Output format:
Print the elements of updated Linked list.

Sample Input 1 :
1 4 5 2 -1
Sample Output 1 :
1 5 4 2

Sample Input 2 :
1 11 3 6 8 0 9 -1
Sample Output 2 :
1 11 3 9 6 8 0
 */

import java.util.Scanner;

public class evenAfterOddLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = evenAfterOdd(head);
        recursivePrintLL(head);
    }

    // printing the odd numbers first then the even ones in a Linked List
    public static node<Integer> evenAfterOdd(node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        node<Integer> evenHead = new node<>(0);
        node<Integer> oddHead = new node<>(0);

        node<Integer> curEven = evenHead;
        node<Integer> curOdd = oddHead;

        while (head != null) {
            if (head.data % 2 == 0) {
                curEven.next = head;
                curEven = curEven.next;
            } else {
                curOdd.next = head;
                curOdd = curOdd.next;
            }
            head = head.next;
        }
        curEven.next = null;
        curOdd.next = evenHead.next;
        return oddHead.next;
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