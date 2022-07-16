//You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
// Write a function to sort this array/list. Think of a solution which scans the array/list only once
// and don't require use of an extra array/list.

// Note: You need to change in the given array/list itself. Hence, no need to return or print anything.
// If the input array is: {0, 1, 1, 0, 1, 0, 1} then the output will be 0 0 0 1 1 1 1

public class sort_0_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1};
        sortZeroesAndOne(arr);
    }

    static void sortZeroesAndOne(int[] arr) {
        int nextZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZeroes];
                arr[nextZeroes] = arr[i];
                arr[i] = temp;
                nextZeroes++;
            }
        }
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
    }
}