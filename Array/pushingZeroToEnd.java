import java.util.Arrays;

public class pushingZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 3, 0};
        pushZerosAtEnd(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void pushZerosAtEnd(int[] arr) {
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }
}