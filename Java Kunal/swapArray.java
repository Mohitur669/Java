import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,89,65};
        swap(arr, 3, 5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
