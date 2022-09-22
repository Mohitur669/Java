// Quick Sort using Recursion

import java.util.Arrays;

public class quickRecursion {
    public static void main(String[] args) {
        int[] arr = {6, 2, 20, 8, 15, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        //base case
        if (startIndex >= endIndex)
            return;

        int pivotPos = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotPos - 1);
        quickSort(input, pivotPos + 1, endIndex);
    }

    public static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[startIndex];
        int count = 0;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (input[i] <= pivot)
                count++;
        }
        int pivotPos = startIndex + count;
        swap(input, startIndex, pivotPos);
        int i = startIndex;
        int j = endIndex;
        while (i < pivotPos && j > pivotPos) {
            if (input[i] <= input[pivotPos]) {
                i++;
            } else if (input[j] > input[pivotPos]) {
                j--;
            } else {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        return pivotPos;
    }

    static void swap(int[] input, int index1, int index2) {
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}