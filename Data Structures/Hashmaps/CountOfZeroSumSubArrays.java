/* Pair Sum to 0:
Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
Note: Array A can contain duplicate elements as well.

Input format:
The first line of input contains an integer, that denotes the value of the size of the array.
Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.

Output format :
The first and only line of output contains the count of pair of elements in the array which sum up to 0.

Constraints :
0 <= N <= 10^4
Time Limit: 1 sec

Sample Input 1:
5
2 1 -2 2 3
Sample Output 1:
2 */

import java.util.HashMap;

public class CountOfZeroSumSubArrays {
    public static void main(String[] args) {
        int[] arr = {2, 1, -2, 2, 3};
        System.out.println(zeroSumSubarray(arr, arr.length));
    }

    public static int zeroSumSubarray(int[] arr, int size) {
        if (size == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int countPairs = 0;
        for (Integer i : map.keySet()) {
            if (map.containsKey(-i) && i != 0) {
                countPairs = countPairs + (map.get(i) * map.get(-i));
            }
        }
        countPairs = countPairs / 2;
        if (map.containsKey(0)) {
            int val = map.get(0);
            countPairs = countPairs + (val * (val - 1)) / 2;
        }
        return countPairs;
    }
}