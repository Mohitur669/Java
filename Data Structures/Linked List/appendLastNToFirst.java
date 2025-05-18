/*
You have been given a singly linked list of integers along with an integer 'N'.
Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first line of each test case or query contains the elements of the singly linked list separated by a single space.
The second line contains the integer value 'N'.
It denotes the number of nodes to be moved from last to the front of the singly linked list.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
would never be a list element.

Output format :
For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.
Output for every test case will be printed in a seperate line.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
0 <= N < M
Time Limit: 1sec
Where 'M' is the size of the singly linked list.

Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10

Sample Input 2 :
1
10 6 77 90 61 67 100 -1
4
Sample Output 2 :
90 61 67 100 10 6 77

Explanation to Sample Input 2 :
We have been required to move the last 4 nodes to the front of the list.
Here, "90->61->67->100" is the list which represents the last 4 nodes.
When we move this list to the front then the remaining part of the initial list which is, "10->6->77" is attached after 100.
Hence, the new list formed with an updated head pointing to 90.
*/

import java.util.Scanner;

    public static void main(String[] args) {
        node<Integer> head = takeInput();
        print(head);
        System.out.println("After Appending last to the first:");
        head = appendLastNToFirst(head, 2);
        print(head);
    }

    /*
    Time Complexity: O(n)
    Space Complexity: O(1), where n is the size of the Single Linked List
     */
    public static node<Integer> appendLastNToFirst(node<Integer> head, int n) {
        if (n == 0 || head == null) {
            return head;
        }
        node<Integer> fast = head;
        node<Integer> slow = fast;
        node<Integer> initialHead = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = initialHead;
        head = temp;

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