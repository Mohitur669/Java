/*
You have been given a singly linked list of integers where the elements are sorted in ascending order.
Write a function that removes the consecutive duplicate values such that
the given list only contains unique elements and returns the head to the updated list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.
The first and the only line of each test case or query contains the elements(in ascending order)
of the singly linked list separated by a single space.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and
hence, would never be a list element.

Output format :
For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.
Output for every test case will be printed in a seperate line.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec
Where 'M' is the size of the singly linked list.

Sample Input 1 :
1
1 2 3 3 3 3 4 4 4 5 5 7 -1
Sample Output 1 :
1 2 3 4 5 7

Sample Input 2 :
2
10 20 30 40 50 -1
10 10 10 10 -1
Sample Output 2 :
10 20 30 40 50
10
 */

import java.util.Scanner;

public class eliminateDuplicatesLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        print(head);
        System.out.println("After deleting the duplicates:");
        removeDuplicates(head);
        print(head);
    }

    /*
    Time Complexity: O(n)
    Space Complexity: O(1), where n is the size of the Single Linked List
     */
    public static node<Integer> removeDuplicates(node<Integer> head) {
        if (head == null) {
            return head;
        }
        node<Integer> currHead = head;
        while (currHead.next != null) {
            if (currHead.data.equals(currHead.next.data)) {
                currHead.next = currHead.next.next;
            } else {
                currHead = currHead.next;
            }
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
}