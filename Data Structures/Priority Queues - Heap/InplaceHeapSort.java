/*
In-place heap sort
Given an integer array of size N. Sort this array (in decreasing order) using heap sort.

Note: Space complexity should be O(1).

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array or N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains array elements after sorting.
The elements of the array in the output are separated by single space.

Constraints :
1 <= n <= 10^6
Time Limit: 1 sec

Sample Input 1:
6
2 6 8 5 4 3
Sample Output 1:
8 6 5 4 3 2
*/

public class InplaceHeapSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 0, 6};
        for (int i = 0; i < arr.length; i++) {
            insertIntoVirtualHeap(arr, i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - 1 - i] = removeMinFromVirtualHeap(arr, arr.length - i);
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    /* Heap-Sort Function (removeMinFromVirtualHeap), This will print the heap in reverse! */
    private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {
        int temp = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        int index = 0;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        while (leftChildIndex < heapSize) {
            int minIndex = index;
            if (arr[leftChildIndex] < arr[minIndex]) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]) {
                minIndex = rightChildIndex;
            }
            if (minIndex != index) {
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;
                index = minIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            } else {
                break;
            }
        }
        return temp;
    }

    private static void insertIntoVirtualHeap(int[] arr, int i) {
        int childIndex = i;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (arr[childIndex] < arr[parentIndex]) {
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }
}