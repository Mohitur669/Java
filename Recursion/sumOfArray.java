public class sumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(sum(array));
    }

    public static int sum(int[] input) {
        return calcSum(input, input.length);
    }

    public static int calcSum(int[] input, int n) {
        if (n <= 0) {
            return 0;
        }
        int smallSum = calcSum(input, n - 1);
        int output = input[n - 1] + smallSum;
        return output;
    }
}