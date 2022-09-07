// Binary Search Algorithm using Recursion

public class binaryUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -4, 0, 1, 2, 3, 4, 67, 87, 98};
        int target = 4;
        System.out.println(binary(arr, target, 0, arr.length - 1));
    }

    public static int binary(int[] input, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        // if the target element is not found
        if (start > end) {
            return -1;
        }
        // base condition
        if (input[mid] == target) {
            return mid;
        } else if (input[mid] > target) {
            return binary(input, target, start, mid - 1);
        } else {
            return binary(input, target, mid + 1, end);
        }
    }
}