public class ceilingOfNumber {
    //    Note:
    /*
    Ceiling Number: the least integer number greater than or equal to the given number
    */
    public static void main(String[] args) {
        int[] arr = {-12, -10, -4, 0, 1, 2, 3, 4, 67, 87, 98};
        int target = 99;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    }

    //    printing the least big element
    static int ceilingNumber(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}