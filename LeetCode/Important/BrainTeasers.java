public class BrainTeasers {
    public static void main(String[] args) {
        System.out.println("This is a Brain Teaser code test-runner.");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World!");
//        }
        int[] arr = {2, 3, 4, 5, 1, 6};
        System.out.println(binarySearch(arr, 6));
        System.out.println("Found in index: " + linearSearch(arr, 6));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }
}