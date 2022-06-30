import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] nums = {
                {234, 5, 45, 78, 32},
                {4355, 657, 67, 6, 87},
                {45657, 8, 798, 234, 67},
        };
        int target = 6;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(nums));
        System.out.println(min(nums));
    }

//    searching for the element
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

//    searching for the maximum element
    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

//    searching for the min element
    static int min(int[][] arr) {
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
