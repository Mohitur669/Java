//You have been given a random integer array/list(ARR) and a number X.
// Find and return the number of triplets in the array/list which sum to X.

// Note: Given array/list can contain duplicate elements.
// Explanation: If the array is: {1, 2, 3, 4, 5, 6, 7} then for 19 we print 0.

// If the array is: {2, -5, 8, -6, 0, 5, 10, 11, -3} then for 10 we print 5, because we have
// 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)

import java.util.Arrays;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        int n = 10;
        System.out.println(triplet(arr, n));
    }

    static int tripletSum(int[] arr, int num) {
        int tripletCount = 0;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == num) {
                        tripletCount++;
                    }
                }
            }
        }
        return tripletCount;
    }

    // better time and space complexity
    public static int triplet(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;
        int numTriplets = 0;
        for (int i = 0; i < n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            int start = i + 1;
            int stop = n - 1;
            while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                    if (arr[start] == arr[stop]) {
                        int totalCount = (stop - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }
                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                    numPairs += (totalElementFromStart * totalElementFromEnd);
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }
}