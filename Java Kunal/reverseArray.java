import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,23,4,34,455,77};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

//    Function to reverse array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr, start,end);
            start++;
            end--;
        }
    }
}
