/*
You are given a stream of 'N' integers. For every 'i-th' integer added to the running list of integers, print the resulting median.
Print only the integer part of the median.

Input Format :
The first line of input contains an integer 'N', denoting the number of integers in the stream.
The second line of input contains 'N' integers separated by a single space.
Output Format :
Print the running median for every integer added to the running list in one line (space-separated).

Input Constraints
0 <= N <= 10 ^ 5
1 <= ARR[i] <= 10 ^ 5
Time Limit: 1 sec

Sample Input 1 :
6
6 2 1 3 7 5
Sample Output 1 :
6 4 2 2 3 4

Explanation of Sample Output 1 :
S = {6}, median = 6
S = {6, 2} -> {2, 6}, median = 4
S = {6, 2, 1} -> {1, 2, 6}, median = 2
S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4
Sample Input 2 :
5
5 4 3 2 1
Sample Output 2 :
5 4 4 3 3
*/

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
    public static void findMedian(int[] arr) {
        if (arr.length == 0) return;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // maxHeap - maintaining left side, always return max of left side.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // minHeap - maintaining right side, always return min of right side.
        int median = arr[0];
        System.out.print(median + " ");
        maxHeap.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (maxHeap.size() > minHeap.size()) {
                // Left part is greater
                if (median > num) {
                    // num lesser than median should always go on left side
                    minHeap.add(maxHeap.remove());
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }
                median = (minHeap.peek() + maxHeap.peek()) / 2;
            } else if (maxHeap.size() == minHeap.size()) {
                // both part is equals
                if (num < median) {
                    // num lesser than median should always go on left side
                    maxHeap.add(num);
                    median = maxHeap.peek();
                } else {
                    // num greater than median should always go on right side
                    minHeap.add(num);
                    median = minHeap.peek();
                }
            } else {
                // right part is greater
                if (num > median) {
                    // num greater than median should always go on right side
                    maxHeap.add(minHeap.poll());
                    minHeap.add(num);
                } else {
                    maxHeap.add(num);
                }
                median = (maxHeap.peek() + minHeap.peek()) / 2;
            }
            System.out.print(median + " ");
        }
    }
}