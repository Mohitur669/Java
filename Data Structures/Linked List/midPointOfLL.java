/*
For a given singly linked list of integers, find and return the node present at the middle of the list.
Note : If the length of the singly linked list is even, then return the first middle node.
Example: Consider, 10 -> 20 -> 30 -> 40 is the given list,
then the nodes present at the middle with respective data values are, 20 and 30.
We return the first node with data 20.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.
The first and the only line of each test case or query contains
the elements of the singly linked list separated by a single space.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
would never be a list element

Output Format :
For each test case/query, print the data value of the node at the middle of the given list.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3

Sample Input 2 :
2
-1
1 2 3 4 -1
Sample Output 2 :
2
 */

import java.util.Scanner;

public class midPointOfLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        node<Integer> mid = midPoint(head);
        System.out.println("Linked list: ");
        print(head);
        System.out.println("Mid point is: " + mid.data);
    }

    // Function for creating a midpoint of Linked List
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