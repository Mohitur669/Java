/*
You have been given a head to a singly linked list of integers. 
Write a function check to whether the list given is a 'Palindrome' or not.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
Then the test cases follow.
First and the only line of each test case or query 
contains the the elements of the singly linked list separated by a single space.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
would never be a list element.

Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec
Where 'M' is the size of the singly linked list.

Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true

Sample Input 2 :
2
0 2 3 2 5 -1
-1
Sample Output 2 :
false
true

Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.
For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.
 */

import java.util.Scanner;

public class palindromeLL {
    public static void main(String[] args) {
        node<Integer> head = takeInput();
        print(head);
        System.out.print("Palindrome Status: ");
        System.out.println(isPalindrome(head));
    }

    /*
    Time Complexity: O(n)
    Space Complexity: O(1), where n is the size of the Single Linked List
     */
    public static boolean isPalindrome(node<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }
        // find list center
        node<Integer> fast = head;
        node<Integer> slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        node<Integer> secondHead = slow.next;
        slow.next = null;
        secondHead = reverseLinkedList(secondHead);

        // compare two sublists now
        node<Integer> firstSubList = secondHead;
        node<Integer> secondSubList = head;
        while (firstSubList != null) {
            if (firstSubList.data != secondSubList.data) {
                return false;
            }
            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
        }

        //Rejoin the two sublists to restore the input list to its original form
        firstSubList = head;
        secondSubList = reverseLinkedList(secondHead);

        while (firstSubList.next != null) {
            firstSubList = firstSubList.next;
        }

        firstSubList.next = secondSubList;
        return true;
    }

    private static node<Integer> reverseLinkedList(node<Integer> head) {
        node<Integer> curr = head;
        node<Integer> prev = null;
        node<Integer> fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
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