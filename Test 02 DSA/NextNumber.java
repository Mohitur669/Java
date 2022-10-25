/*
Given a large number represented in the form of a linked list.
Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.

Input Constraints:
1 <= Length of Linked List <=10^6.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements

Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6

Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0


 * Following is the Node class already written
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
        this.data = data;
        }
    } */

import java.util.Scanner;
import java.util.Stack;

public class NextNumber {
    public static void main(String[] args) {
        nodeStack<Integer> head = takeInput();
        head = nextLargeNumber(head);
        recursivePrintLL(head);
    }

    public static nodeStack<Integer> nextLargeNumber(nodeStack<Integer> head) {
        Stack<Integer> stack = new Stack<>();
        nodeStack<Integer> temp = head;

        while (temp.next != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        if (temp.data + 1 < 10) {
            temp.data = temp.data + 1;
            return head;
        }

        stack.push(temp.data);
        temp = null;

        int carry = 1;
        while (!stack.isEmpty() && carry != 0) {

            int result = stack.pop() + carry;
            nodeStack<Integer> newNode = new nodeStack<>(result % 10);
            newNode.next = temp;
            temp = newNode;
            carry = result / 10;
        }

        if (carry == 0)
            return temp;

        nodeStack<Integer> newNode = new nodeStack<>(1);
        newNode.next = temp;
        return newNode;
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