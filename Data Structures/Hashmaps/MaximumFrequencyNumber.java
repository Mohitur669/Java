/* Maximum Frequency Number
You are given an array of integers that contain numbers in random order.
Write a program to find and return the number which occurs the maximum times in the given input.
If two or more elements contend for the maximum frequency, return the element which occurs in the array first.

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array.
Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.

Output Format :
The first and only line of output contains most frequent element in the given array.

Constraints:
0 <= N <= 10^8
Time Limit: 1 sec

Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6
Sample Output 1 :
2

Sample Input 2 :
3
1 4 5
Sample Output 2 :
1
*/

import java.util.HashMap;

public class MaximumFrequencyNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 2, 2, 2, 10000, 3, 2};
        System.out.println(maximumFrequencyNumber(arr));
    }

    public static int maximumFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int ele : arr) {
            if (countMap.containsKey(ele)) {
                countMap.put(ele, countMap.get(ele) + 1);
            } else {
                countMap.put(ele, 1);
            }

        }
        int maxCount = Integer.MIN_VALUE, maxEle = arr[0];
        for (int ele : arr) {
            if (countMap.get(ele) > maxCount) {
                maxCount = countMap.get(ele);
                maxEle = ele;
            }
        }
        return maxEle;
    }
}