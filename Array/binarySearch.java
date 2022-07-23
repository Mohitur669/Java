// for personal understanding binary search is like Mean value theorem
// binary search main code
// Note: Binary search is more efficient than the linear search in the case of
// large data sets.
// Binary search only works in a sorted array (ascending or descending)

// binary search formula => max Iteration times (worst case) = k = log(N) {base
// 2}
// return the index
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -4, 0, 1, 2, 3, 4, 67, 87, 98};
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2; // This will not work because (start+end) may exceed the int limit
            int mid = start + (end - start) / 2;
            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}