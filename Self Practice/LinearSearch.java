import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {232, 45, 46, 7, 68, 68, 7, 9, 7, 53, 424};
        int target = 7;
        System.out.println(linear_search(arr, target));
    }

    static boolean linear_search(int[] arr, int target) {
        for (int check : arr) {
            if (target == check) {
                return true;
            }
        }
        return false;
    }
}