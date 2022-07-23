import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 8, 8, 9, 15, 16};
        int n1 = arr1.length;
        int[] arr2 = {2, 4, 6, 8, 9, 9, 10};
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2, n1, n2, merged)));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] merged) {
        int i = 0, j = 0, k = 0;
        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Other-wise do same with second array
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        // Store remaining elements of first array
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        // Store remaining elements of second array
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}