import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        long startTime = System.currentTimeMillis();
        selectionSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time by merge sort taken is: " + (endTime - startTime) + "ms");

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            find the max item in the remaining arr and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}