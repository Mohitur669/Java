/* Program to find Unique elements in an array */

//Question: You have been given an integer array of size N. Where N is equal to [2M + 1].
//Now, in the given array, 'M' numbers are present twice and one number is present only once.
//You need to find and return that number which is unique in the array.

public class findUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] input) {
        int ans = 0;
        int n = input.length;
        for (int i = 0; i < n; i++) {
            ans = ans ^ input[i];
        }
        return ans;
    }
}