//You have been given an integer array/list(ARR) and a number X.
// Find and return the total number of pairs in the array/list which sum to X.

// Note: Given array/list can contain duplicate elements.
// Explanation: If the array is: {1, 3, 6, 2, 5, 4, 3, 2, 4} then for 12 it will print 0.

// If the array is: {2, 8, 10, 5, -2, 5} then for 10 it will print 2,
// because we will get two pairs for sum = 10 is: (2,8), (5,5)

public class pairSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4};
        int n = 12;
        System.out.println(pairSum(arr, n));
    }

    static int pairSum(int[] input, int x) {
        int pairCount = 0;
        int sum;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                sum = input[i] + input[j];
                if (sum == x) {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}