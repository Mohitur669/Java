public class mergeRecursion2 {
    // the startTime and endTime variable was created for Time Complexity video.
    // It calculates the time taken by the algorithm
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 78, 7, 5, 3, 1, 4, 6, 88,};
        long startTime = System.currentTimeMillis();
        mergeSort(arr);
        long endTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Time by merge sort taken is: " + (endTime - startTime)+ "ms");
    }

    public static void mergeSort(int[] input) {
        if (input.length <= 1) {
            return;
        }

        int mid = input.length / 2;
        int[] part1 = new int[mid];
        int[] part2 = new int[input.length - mid];

        for (int i = 0; i < mid; i++) {
            part1[i] = input[i];
        }

        int k = 0;
        for (int i = mid; i < input.length; i++) {
            part2[k] = input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(input, part1, part2);
    }

    private static void merge(int[] input, int[] part1, int[] part2) {
        int i = 0, j = 0, k = 0;
        while (i < part1.length && j < part2.length) {
            if (part1[i] < part2[j]) {
                input[k] = part1[i];
                k++;
                i++;
            } else {
                input[k] = part2[j];
                k++;
                j++;
            }
        }

        while (i < part1.length) {
            input[k] = part1[i];
            k++;
            i++;
        }

        while (j < part2.length) {
            input[k] = part2[j];
            k++;
            j++;
        }
    }
}