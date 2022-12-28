/*
K largest elements

You are given with an integer k and an array of integers that contain numbers in random order.
Write a program to find k largest numbers from given array. You need to save them in an array and return it.
Time complexity should be O(nlogk) and space complexity should be not more than O(k).
Order of elements in the output is not important.

Input Format :
Line 1 : Size of array (n)
Line 2 : Array elements (separated by space)
Line 3 : Integer k
Output Format :
k largest elements

Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6
4
Sample Output :
12
16
20
25 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 6, 8};
        int k = 3;
        System.out.println(kLargest(arr, k));
    }

    public static ArrayList<Integer> kLargest(int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (; i < k; i++) {
            pq.add(input[i]);
        }
        for (; i < input.length; i++) {
            int min = pq.element();
            if (min < input[i]) {
                pq.remove();
                pq.add(input[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.remove());
        }
        return ans;
    }

    public static ArrayList<Integer> kLargestAlternative(int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //assume first k elements of array are largest, push them inside priorityQueue
        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }
        //System.out.println("The queue is now as "+priorityQueue);
        //The queue is now as [3, 21, 45]
        for (int i = k; i < input.length; i++) {
            if (pq.peek() < input[i]) {
                //peek returns the min, head of the queue, if input[i] > min,
                // remove the min and add input[i] to the end of the priorityQueue
                pq.remove();
                pq.add(input[i]);
                //System.out.println("The queue is now as "+priorityQueue);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.remove());
        }
        return ans;
    }
}