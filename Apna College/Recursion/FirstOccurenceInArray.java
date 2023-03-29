public class FirstOccurenceInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 56762, 24, 4, 231, 557, 8, 78, 8, 89, 543225, 566};
        int target = 8;
        System.out.println(index(arr, target, 0));
    }

    public static int index(int[] arr, int target, int i) {
        if (arr.length == i) {
            return -1;
        }
        if (target == arr[i]) {
            return i;
        }
        return index(arr, target, i + 1);
    }
}