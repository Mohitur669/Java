// Check the array if it is sorted in ascending order

package kunal.array;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] input, int index) {
        // base condition
        if (index == input.length - 1) {
            return true;
        }
        return input[index] < input[index + 1] && sorted(input, index + 1);
    }
}