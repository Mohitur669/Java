/*
Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes,
continue the same until end of the linked list. That is, in the given linked list you need to delete N nodes after every M nodes.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : M
Line 3 : N

Sample Input 1 :
1 2 3 4 5 6 7 8 -1
2
2
Sample Output 1 :
1 2 5 6

Sample Input 2 :
1 2 3 4 5 6 7 8 -1
2
3
Sample Output 2 :
1 2 6 7
 */

import java.util.Scanner;

public class deleteEveryNNodes {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = skipMdeleteN(head, 2, 3);
        recursivePrintLL(head);
    }

    // looping to skip M nodes and delete N nodes until it reaches the last node of the Linked List
    public static node<Integer> skipMdeleteN(node<Integer> head, int M, int N) {
        if (M == 0) {
            return null;
        }
        if (N == 0) {
            return head;
        }

        node<Integer> node = head, delNode = null;
        while (node != null) {
            for (int i = 0; i < M - 1 && node != null; i++) {
                //System.out.print(node.data+" ");
                node = node.next;
            }
            //System.out.println();
            if (node == null) {
                break;
            }

            delNode = node.next;
            for (int i = 0; i < N && delNode != null; i++) {
                //System.out.print(delNode.data+" ");
                delNode = delNode.next;
            }
            node.next = delNode;
            node = delNode;
        }
        return head;
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