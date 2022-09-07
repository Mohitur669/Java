import java.util.Arrays;

// TODO: Understand the code
public class indexAll {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1, 6};
        System.out.println(Arrays.toString(allIndexes(arr, 1)));
    }

    public static int[] allIndexes(int[] input, int x) {
        return helper(input, x, 0);
    }

    public static int[] helper(int[] input, int x, int startIndex) {
        if (startIndex == input.length) {
            int[] output = new int[0];
            return output;
        }

        //recursion call from startIndex+1
        int[] smallAns = helper(input, x, startIndex + 1);
        if (input[startIndex] == x) {
            int[] ans = new int[smallAns.length + 1];
            ans[0] = startIndex; // we find it at startIndex thats why we making 0th position of ans array to startIndex
            for (int i = 0; i < smallAns.length; i++) {
                ans[i + 1] = smallAns[i];
            }
            return ans;
        } else {
            return smallAns;
        }
    }
}