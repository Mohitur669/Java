public class LastOccurenceInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 56762, 24, 4, 231, 557, 8, 78, 8, 89, 543225, 8, 566};
        int target = 8;
        System.out.println(lastIndex(arr, target, arr.length - 1));
    }

    public static int lastIndex(int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if (target == arr[i]) {
            return i;
        }
        return lastIndex(arr, target, i - 1);
    }
}