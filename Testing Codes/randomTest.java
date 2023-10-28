import java.util.Arrays;
import java.util.Scanner;

public class randomTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        myArray();
    }

    //    Deloitte 2 yrs+ exp Java Developer Interview Question
    public static int firstNonRepeating(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

    public static void myArray() {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Exit");
        System.out.println("Enter the choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the element to be searched: ");
                int target = sc.nextInt();
                System.out.println(linearSearch(arr, target));
                break;

            case 2:
                System.out.println("Enter the element to be searched: ");
                int target2 = sc.nextInt();
                System.out.println(binarySearch(arr, target2));
                break;

            case 3:
                bubbleSort(arr);

            case 4:
                selectionSort(arr);

            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            swap(arr, minPos, i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int element = arr[j];
                if (element > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}