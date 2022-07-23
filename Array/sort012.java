import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 1, 0, 1, 2, 0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        int i = 0;
        int nextZeros = 0;
        int nextTwo = arr.length - 1;
        while (i <= nextTwo) {
            if (arr[i] == 0) {
                int temp = arr[nextZeros];
                arr[nextZeros] = arr[i];
                arr[i] = temp;
                i++;
                nextZeros++;
            } else if (arr[i] == 2) {
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            } else {
                i++;
            }
        }
    }
}