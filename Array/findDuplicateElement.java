/* Program to find Duplicate elements in an array */

//You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
// Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging
// from 0 to 3 and among these, there is a single integer value that is present twice.
// You need to find and return that duplicate number present in the array.
// Note: Duplicate number is always present in the given array/list.

import java.util.Arrays;

public class findDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 4, 7, 1, 3, 6};
        System.out.println(duplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        return arr[i];
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    //better time and space complexity
    public static int duplicate(int[] arr) {
        int i = 0;
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1])
                break;
        }
        return arr[i];
    }
}