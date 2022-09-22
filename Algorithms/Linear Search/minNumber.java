public class minNumber {
    public static void main(String[] args) {
        int[] num = {233, 45, 4, -65, 5, 7, 68, 64, 53, 424, 2, 4253};
        System.out.println(min(num));
        System.out.println(max(num));
    }

    //    assume the given array is not of zero length
//    return the min value among the elements of given array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < ans) {
                ans = arr[index];
            }
        }
        return ans;
    }

    static int max(int[] arr) {
        int ans = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > ans) {
                ans = arr[index];
            }
        }
        return ans;
    }
}
