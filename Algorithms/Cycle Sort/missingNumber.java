//  https://leetcode.com/problems/missing-number

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 0};
        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {
//        Sorting the array
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
//        Search for first missing number
//        If the array missing multiple numbers this code just returns the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}