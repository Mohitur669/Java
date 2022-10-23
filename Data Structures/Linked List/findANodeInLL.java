/*
Given a linked list and an integer n you need to find and return index where n is present in the LL.
Do this recursively. Return -1 if n is not present in the LL. Indexing of nodes starts from 0.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n
Output format :
Index

Sample Input 1 :
3 4 5 2 6 1 9 -1
5
Sample Output 1 :
2

Sample Input 2 :
3 4 5 2 6 1 9 -1
6
Sample Output 2 :
4
 */

import java.util.Scanner;

public class findANodeInLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        int nodePos = findNodeRec(head, 3);
        System.out.println(nodePos);
    }

    // finding the position of node using recursion
    public static int findNodeRec(node<Integer> head, int n) {
        if (head == null)
            return -1;
        if (head.data == n)
            return 0;
        int smallAns = findNodeRec(head.next, n);
        if (smallAns == -1)
            return -1;
        else
            return 1 + smallAns;

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