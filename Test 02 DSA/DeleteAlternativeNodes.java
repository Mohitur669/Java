/*
Given a Singly Linked List of integers, delete all the alternate nodes in the list.
Example: List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
         Alternate nodes will be:  20, 40, and 60.

Hence after deleting, the list will be:
Output: 10 -> 30 -> 50 -> null

Note :
The head of the list will remain the same. Don't need to print or return anything.

Input format :
The first and the only line of input will contain the elements of the Singly Linked List
separated by a single space and terminated by -1.
Output Format :
The only line of output will contain the updated list elements.

Input Constraints:
1 <= N <= 10^6.
Where N is the size of the Singly Linked List
Time Limit: 1sec

Sample Input 1:
1 2 3 4 5 -1
Sample Output 1:
1 3 5

Sample Input 2:
10 20 30 40 50 60 70 -1
Sample Output 2:
10 30 50 70 */

import java.util.Scanner;

public class DeleteAlternativeNodes {
    public static void main(String[] args) {
        nodeStack<Integer> list = takeInput();
        deleteAlternateNodes(list);
        recursivePrintLL(list);
    }

    public static void deleteAlternateNodes(nodeStack<Integer> head) {
        nodeStack<Integer> temp = head;
        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

    public static nodeStack<Integer> takeInput() {
        nodeStack<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            nodeStack<Integer> newNode = new nodeStack<Integer>(data);
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

    public static void recursivePrintLL(nodeStack<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        recursivePrintLL(head.next);
    }
}