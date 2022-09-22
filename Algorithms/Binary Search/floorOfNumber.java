public class floorOfNumber {
    /*
    Floor Number: Greatest smaller number or equal to the target number
    */
    public static void main(String[] args) {
        int[] arr = {-12, -10, -4, 0, 1, 2, 4, 67, 87, 98};
        int target = 3;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}