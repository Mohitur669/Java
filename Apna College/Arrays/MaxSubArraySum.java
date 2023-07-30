public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        System.out.println(kadanes(numbers));
    }

    // Kadane's Algorithm
    public static int kadanes(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int element : arr) {
            currSum += element;
            if (currSum < 0) {
                currSum = 0;
            }

            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}