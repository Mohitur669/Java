/*
Given a queue and an integer k, reverse first k elements. Return the updated queue. Do the problem in O(n) complexity.

Input Format :
Line 1 : Integer N, Size of Queue
Line 2 : Queue Elements (separated by space)
Line 3 : Integer k
Output Format:
Updated Queue elements

Contraints :
1<= N <=10000

Sample Input 1:
5
1 2 3 4 5
3
Sample Output 1:
3 2 1 4 5

Sample Input 2:
7
3 4 2 5 6 7 8
7
Sample Output 2:
8 7 6 5 2 4 3 */

import java.util.Stack;
import java.util.Queue;

public class reverseKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        Stack<Integer> stack = new Stack<>();
        while (stack.size() < k) {
            stack.push(input.poll());
        }
        while (!stack.isEmpty()) {
            input.add(stack.pop());
        }
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.poll());
        }
        return input;
    }
}