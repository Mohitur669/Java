/*
Given a singly linked list of integers, sort it using 'Bubble Sort.'
Note : No need to print the list, it has already been taken care. Only return the new head to the list.

Input format :
The first and the only line of each test case or query contains
the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.
Output for every test case will be printed in a separate line.

Constraints :
0 <= M <= 10^3
Where M is the size of the singly linked list.
Time Limit: 1sec

Sample Input 1 :
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
3 4 5 6 7 8 9 10

Sample Output 2 :
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90
 */

import java.util.Scanner;

public class bubbleSortIterativeLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        head = bubbleSort(head);
        recursivePrintLL(head);
    }

    public static node<Integer> bubbleSort(node<Integer> head) {
        node<Integer> originalHead = head;
        int n = length(head);
        for (int i = 0; i < n - 1; i++) {
            node<Integer> prev = null, curr = originalHead;
            for (int j = 0; j < n - i - 1; j++) {
                // while(curr.next!=null)
                if (curr.data <= curr.next.data) {

                    prev = curr;
                    curr = curr.next;
                } else {
                    if (prev == null) {
                        node<Integer> curr2 = curr.next;
                        node<Integer> temp = curr2.next;
                        curr2.next = curr;
                        curr.next = temp;
                        prev = curr2;
                        originalHead = curr2;
                    } else {
                        node<Integer> curr2 = curr.next;
                        node<Integer> temp = curr2.next;
                        prev.next = curr2;
                        curr2.next = curr;
                        curr.next = temp;
                        prev = curr2;
                    }
                }
            }
        }
        return originalHead;
    }

    public static int length(node<Integer> head) {

        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
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