import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // everytime the j-loop completes, the largest element is sorted to the last
            // so, we do not need to sort last elements next time, so we are using input.length - i - 1 as a limit
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }
}