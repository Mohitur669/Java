public class checkArrayRotation {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 1};
        System.out.println(arrayRotateCheck(arr));
        //output 4, index of the smallest element is equal to number of rotations in sorted array.
    }

    public static int arrayRotateCheck(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}