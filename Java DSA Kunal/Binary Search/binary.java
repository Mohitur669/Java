public class binary {
    // for personal understanding binary search is like Mean value theorem
    // binary search main code
    // Note: Binary search is more efficient than the linear search in the case of
    // large data sets.
    // Binary search only works in a sorted array (ascending or descending)
    public static void main(String[] args) {
        // sorted array
        int[] arr = { -12, -10, -4, 0, 1, 2, 3, 4, 67, 87, 98 };
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // binary search formula => max Iteration times (worst case) = k = log(N) {base
    // 2}
    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2; // This will not work because (start+end) may exceed
            // the int limit
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return Integer.MIN_VALUE;
    }
}