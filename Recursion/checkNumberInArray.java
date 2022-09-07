public class checkNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 40;
        System.out.println(checkNumber(arr, target));
    }

    public static boolean checkNumber(int[] input, int x) {
        return find(input, input.length, x);
    }

    public static boolean find(int[] input, int n, int x) {
        if (n <= 0)
            return false;
        if (input[n - 1] == x)
            return true;
        else
            return find(input, n - 1, x);
    }
}