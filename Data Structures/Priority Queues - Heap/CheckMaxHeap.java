/*
Given an array of integers, check whether it represents max-heap or not.
Return true if the given array represents max-heap, else return false.

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains true if it represents max-heap and false if it is not a max-heap.

Constraints:
1 <= N <= 10^5
1 <= Ai <= 10^5
Time Limit: 1 sec

Sample Input 1:
8
42 20 18 6 14 11 9 4
Sample Output 1:
true
*/

import java.util.PriorityQueue;

public class CheckMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {42, 20, 18, 6, 14, 11, 9, 4};
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        System.out.println(checkMaxHeap(arr));
    }

    public static boolean checkMaxHeap(int[] arr) {
        return checkMaxHeapHelper(arr, 0);
    }

    private static boolean checkMaxHeapHelper(int[] arr, int startIndex) {
        if (startIndex == arr.length) {
            return true;
        }
        int parentIndex = startIndex;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        boolean leftAns = true, rightAns = true;

        if (leftChildIndex < arr.length) {
            if (arr[parentIndex] < arr[leftChildIndex]) {
                return false;
            } else {
                leftAns = checkMaxHeapHelper(arr, leftChildIndex);
            }
        }

        if (rightChildIndex < arr.length) {
            if (arr[parentIndex] < arr[rightChildIndex]) {
                return false;
            } else {
                rightAns = checkMaxHeapHelper(arr, rightChildIndex);
            }
        }
        return (leftAns && rightAns);
    }
}