/*
You have been given a linked list of integers.
Your task is to write a function that deletes a node from a given position, 'POS'.

Note :
Assume that the Indexing for the linked list always starts from 0.
If the position is greater than or equal to the length of the linked list,
you should return the same linked list without any change.

Input format :
The first line contains an Integer 'T' which denotes the number of test cases or queries to be run.
Then the test cases follow.
The first line of each test case or query contains the elements of the linked list separated by a single space.
The second line of each test case contains the integer value of 'POS'.
It denotes the position in the linked list from where the node has to be deleted.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
would never be a list element

Output format :
For each test case/query, print the resulting linked list of integers in a row, separated by a single space.
Output for every test case will be printed in a separate line.

Note:
You are not required to print the output, it has already been taken care of. Just implement the function.

Constraints :
1 <= T <= 10^2
0 <= N <= 10^5
POS >= 0
Time Limit: 1sec

Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9

Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
10 20 30 40 50 60 -1
7
Sample Output 2 :
4 5 2 6 1 9
10 20 30 40 50 60
 */

import java.util.Scanner;

public class deleteNode {
    public static void main(String[] args) {
        System.out.println("Insert -1 to quit!");
        node<Integer> head = takeInput();
        print(head);
        System.out.println("After Deletion");
        head = deleteNode(head, 2);
        print(head);
    }

    public static node<Integer> deleteNode(node<Integer> head, int pos) {
        /* Empty list */
        if (head == null)
            return head;

        /* when position is 0 meaning delete from head */
        if (pos == 0)
            return head.next;

        node<Integer> cur = head;
        while (pos > 1) {
            if (cur == null)
                return head;

            cur = cur.next;
            pos--;
        }

        /* /if last node is to be deleted */
        if (cur.next == null) {
            cur = null;
            return head;
        }

        /* normal deletion */
        cur.next = cur.next.next;
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