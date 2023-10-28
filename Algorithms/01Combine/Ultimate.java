import java.util.Arrays;
import java.util.Scanner;

public class Ultimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            scanner = new Scanner(System.in);
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Linear Search");
            System.out.println("6. Binary Search");
            System.out.println("7. Merge Sort");
            System.out.println("8. Cycle Sort");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> bubbleSort(array);
                case 2 -> selectionSort(array);
                case 3 -> insertionSort(array);
                case 4 -> quickSort(array, 0, array.length - 1);
                case 5 -> {
                    System.out.print("Enter the element to search: ");
                    int linearTarget = scanner.nextInt();
                    int linearResult = linearSearch(array, linearTarget);
                    if (linearResult != -1)
                        System.out.println("Element found at index: " + linearResult);
                    else
                        System.out.println("Element not found.");
                }
                case 6 -> {
                    System.out.print("Enter the element to search: ");
                    int binaryTarget = scanner.nextInt();
                    int binaryResult = binarySearch(array, binaryTarget);
                    if (binaryResult != -1)
                        System.out.println("Element found at index: " + binaryResult);
                    else
                        System.out.println("Element not found.");
                }
                case 7 -> {
                    System.out.println("Before Merge Sort: " + Arrays.toString(array));
                    mergeSort(array, 0, array.length - 1);
                    System.out.println("After Merge Sort: " + Arrays.toString(array));
                }
                case 8 -> {
                    System.out.println("Before Cycle Sort: " + Arrays.toString(array));
                    cycleSort(array);
                    System.out.println("After Cycle Sort: " + Arrays.toString(array));
                }
                case 9 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


    public static void cycleSort(int[] arr) {
        int writes = 0;
        int n = arr.length;
        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            if (pos == cycleStart)
                continue;

            while (item == arr[pos])
                pos++;

            int temp = arr[pos];
            arr[pos] = item;
            item = temp;
            writes++;

            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++)
                    if (arr[i] < item)
                        pos++;

                while (item == arr[pos])
                    pos++;

                temp = arr[pos];
                arr[pos] = item;
                item = temp;
                writes++;
            }
        }
    }


    // Sorting Algorithms
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--; // Last element is sorted, reduce the array size for optimization
        } while (swapped);
    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    // Searching Algorithms
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }


    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Return index if found
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if not found
    }

}