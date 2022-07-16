//You have been given a random integer array/list(ARR) and a number X.
// Find and return the number of triplets in the array/list which sum to X.

// Note: Given array/list can contain duplicate elements.
// Explanation: If the array is: {1, 2, 3, 4, 5, 6, 7} then for 19 we print 0.

// If the array is: {2, -5, 8, -6, 0, 5, 10, 11, -3} then for 10 we print 5, because we have
// 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)

public class tripletSum {
    public static void main(String[] args) {
        int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        int n = 10;
        System.out.println(tripletSum(arr, n));
    }

    static int tripletSum(int[] arr, int x) {
        int tripletCount = 0;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == x) {
                        tripletCount++;
                    }
                }
            }
        }
        return tripletCount;
    }
}