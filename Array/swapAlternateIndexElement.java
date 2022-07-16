/* Program to Alternate Values in an Array */

// Given array is: 1, 2, 3, 4, 5, 6, 7, 8, 9
// Output array:   2, 1, 4, 3, 6, 5, 8, 7, 9

public class swapAlternateIndexElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length - 1;
        for (int i = 0; i < n; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}