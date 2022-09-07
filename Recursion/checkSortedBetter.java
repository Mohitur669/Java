public class checkSortedBetter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 43};
        System.out.println(betterCheckSorted(arr, 0));
    }

    //    this function checks if the array is sorted from startIndex to end
    public static boolean betterCheckSorted(int[] input, int startIndex) {
        if (startIndex >= input.length - 1) {
            return true;
        }
        if (input[startIndex] > input[startIndex + 1]) {
            return false;
        }
        return betterCheckSorted(input, startIndex + 1);
    }
}