// Populating a non initialized array in a increasing and a decreasing format
// Like if input arr.length (n) is 9 then it should print 1 3 5 7 9 8 6 4 2

import java.util.Scanner;

public class arrangeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        arrange(arr, n);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int start = 0;
        int end = n - 1;
        int value = 1;
        while (start <= end) {
            arr[start] = value;
            value++;
            if (end == start) {
                break;
            } else {
                arr[end] = value;
                value++;
            }
            start++;
            end--;
        }
    }
}