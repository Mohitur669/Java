public class secondLargestElementInArray {
    public static void main(String[] args) {
        int arr1[] = {2, 6, 4, 1, 6};
        int arr2[] = {2, 3, 3, 2};
        int arr3[] = {2, 2, 2, 2};
        System.out.println(secondLargestElement(arr2));
    }

    public static int secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                if (largest != arr[i]) {
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }
}