/*
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.

Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)

Constraints :
1 <= n <= 10^3

Sample Input 1 :
6
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8

Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5
 */

import java.util.Scanner;

public class MergeSortLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        node<Integer> newHead = mergeSort(head);
        print(newHead);
    }

    public static node<Integer> mergeSort(node<Integer> head) {
        //Handling base case where length of linked is 0 or 1
        if (head == null || head.next == null) {
            return head;
        }
        node<Integer> midNode = midPoint(head), part1Head = head, part2Head = null;
        part2Head = midNode.next;
        midNode.next = null;
        node<Integer> head1 = mergeSort(part1Head);
        node<Integer> head2 = mergeSort(part2Head);
        node<Integer> newHead = mergeTwoSortedLinkedLists(head1, head2);
        return newHead;
    }

    public static node<Integer> midPoint(node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        node<Integer> slow = head;
        node<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static node<Integer> mergeTwoSortedLinkedLists(node<Integer> head1, node<Integer> head2) {
        // basic checks
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        node<Integer> t1 = head1, t2 = head2, tail = null, head = null;
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }
        }
        if (t1 == null)
            tail.next = t2;
        if (t2 == null)
            tail.next = t1;
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