import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 1, 5, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min = input[i];
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                input[minIndex] = input[i];
                input[i] = min;
            }
        }
    }
}