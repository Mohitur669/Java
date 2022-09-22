public class orderAgnosticBinarySearch {
    //    order agnostic = when we don't know the given array is in ascending order or descending order
    public static void main(String[] args) {
        int[] arr = {-12, -10, -4, 0, 1, 2, 3, 4, 67, 87, 98};
        int target = 0;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        find the array is descending or ascending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}