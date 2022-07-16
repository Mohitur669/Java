/* Program to Arrange Numbers in an Array */
//Arranging of number will be in such a way to populate
// the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

import java.util.Scanner;

public class arrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
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
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}