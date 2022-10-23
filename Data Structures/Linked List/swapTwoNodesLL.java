/*
Given a linked list, i & j, swap the nodes that are present at i & j position in the LL.
You need to swap the entire nodes, not just the data.
Indexing starts from 0. You don't need to print the elements, just swap and return the head of updated LL.
Assume i & j given will be within limits. And i can be greater than j also.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : i and j (separated by space)

Sample Input 1 :
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9

Sample Input 2 :
3 4 5 2 6 1 9 -1
2 4
Sample Output 2 :
3 4 6 2 5 1 9
 */

import java.util.Scanner;

public class swapTwoNodesLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = swapNodes(head, 2, 3);
        recursivePrintLL(head);
    }

    public static node<Integer> swapNodes(node<Integer> head, int i, int j) {
        if (i == j) {
            return head;
        }
        node<Integer> curr = head;
        node<Integer> prev1 = head;
        node<Integer> prev2 = head;
        node<Integer> prev = null;
        node<Integer> first = null;
        node<Integer> second = null;

        int x = 0;
        while (curr != null) {
            if (x == i) {
                prev1 = prev;
                first = curr;
            } else if (x == j) {
                prev2 = prev;
                second = curr;
            }

            prev = curr;
            curr = curr.next;
            x++;
        }

        if (prev1 != null) {
            prev1.next = second;
        } else {
            head = second;
        }

        if (prev2 != null) {
            prev2.next = first;
        } else {
            head = first;
        }
        swapnodes(first, second);
        return head;
    }

    public static void swapnodes(node<Integer> n1, node<Integer> n2) {
        node<Integer> temp = n2.next;
        n2.next = n1.next;
        n1.next = temp;
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