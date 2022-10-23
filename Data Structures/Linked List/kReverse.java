/*
Implement kReverse( int k ) in a linked list i.e.
you need to reverse first K elements then reverse next k elements and join the linked list and so on.
Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well.
If k is greater than length of LL, reverse the complete LL.
You don't need to print the elements, just return the head of updated LL.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : k

Sample Input 1 :
1 2 3 4 5 6 7 8 9 10 -1
4
Sample Output 1 :
4 3 2 1 8 7 6 5 10 9

Sample Input 2 :
1 2 3 4 5 -1
2
Sample Output 2 :
2 1 4 3 5

Sample Input 3 :
1 2 3 4 5 6 7 -1
3
Sample Output 3 :
3 2 1 6 5 4 7
 */

import java.util.Scanner;

public class kReverse {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = kReverse(head, 4);
        recursivePrintLL(head);
    }

    public static node<Integer> reverse(node<Integer> head) {
        node<Integer> pre = null, curr = head;
        while (curr != null) {
            node<Integer> temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public static int len(node<Integer> head) {
        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
    }

    public static node<Integer> kReverse(node<Integer> head, int k) {
        if (k >= len(head)) {
            return reverse(head);
        }
        node<Integer> tempHead = head;
        for (int i = 1; i < k; i++) {
            head = head.next;
        }
        node<Integer> temp = head.next;
        head.next = null;
        node<Integer> reversedHead = reverse(tempHead);
        node<Integer> tail = tempHead;
        node<Integer> smallAns = kReverse(temp, k);
        tail.next = smallAns;
        return reversedHead;
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