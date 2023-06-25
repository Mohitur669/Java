import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        counting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort - If the element is bigger than the next one, then swap
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Selection Sort - Initialize the min element to 0th index, swap if any smaller value found while traversing
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            swap(arr, minPos, i);
        }
    }

    // Insertion Sort - Get max element in the array and push it via swapping to the last index
    public static void insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            find the max item in the remaining arr and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    // For getting the index in which the max element is present
    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Inbuilt Sort function of Java - O(nlogn)
    // Inbuilt sort functions requires Integer type input/argument
    public static void inbuiltSort(Integer[] arr) {
//        Arrays.sort(arr);
        /* But if we want to sort only a part of an array we can also do that */
//        Arrays.sort(arr, 0, 3);
        // For reverse order
        Arrays.sort(arr, Collections.reverseOrder()); // For this need to Declare an Integer type array
//        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
    }

    // Counting Sort - Count the frequency of the elements in array and stores them in another array
    // the length of the new array will be the max element present in the given array
    public static void counting(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}