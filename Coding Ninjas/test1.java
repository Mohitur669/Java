public class test1 {
    public static void main(String[] args) {
        int[][] arr = {{12, 13, 14}, {23, 14, 24}, {10, 21, 31}};
        System.out.println(countOne(arr));
    }

    public static int countOne(int[][] arr) {
        int count = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                int n = ints[j];
                while (n != 0) {
                    int rem = n % 10;
                    if (rem == 1) {
                        count++;
                    }
                    n = n / 10;
                }
            }
        }
        return count;
    }
}