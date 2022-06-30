import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {232, 45, 46, 7, 68, 68, 7, 9, 7, 53, 424};
        int target = 7;
        System.out.println(linear_search(arr, target));
    }

    static boolean linear_search(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int check = arr[index];
            if (target == check) {
//                int temp = arr[index];
//                arr[index] = arr[0];
//                arr[0] = temp;
                return true;
            }
        }
        return false;
    }
}
