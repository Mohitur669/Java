/* This sorting is part of a recursion video */

public class mergeRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 78, 7, 5, 3, 1, 4, 6, 88,};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        // Part 1
        mergeSort(input, startIndex, mid);
        // Part 2
        mergeSort(input, mid + 1, endIndex);
        merge(input, startIndex, endIndex);
    }

    public static void merge(int[] input, int startIndex, int endIndex) {
        int mid = startIndex + (endIndex - startIndex) / 2;

        int[] ans = new int[endIndex - startIndex + 1];
        int i = startIndex;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= endIndex) {
            if (input[i] < input[j]) {
                ans[k] = input[i];
                i++;
                k++;
            } else {
                ans[k] = input[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            ans[k] = input[i];
            i++;
            k++;
        }
        while (j <= endIndex) {
            ans[k] = input[j];
            k++;
            j++;
        }
        for (int index = 0; index < ans.length; index++) {
            input[startIndex + index] = ans[index];
        }
    }
}