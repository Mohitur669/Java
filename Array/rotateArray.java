import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 1, 5};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        int temp[] = new int[d];
        for (int j = 0; j < d; j++) {
            temp[j] = arr[j];
        }
        int i;
        for (i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int j = 0; j < d; j++) {
            arr[i] = temp[j];
            i++;
        }
    }
}