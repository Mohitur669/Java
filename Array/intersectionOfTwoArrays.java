//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
// You need to print their intersection; An intersection for this problem can be defined
// when both the arrays/ contain a particular value or to put it in other words,
// when there is a common value that exists in both the arrays/lists.

// Note: Input arrays/lists can contain duplicate elements.
//       The intersection elements printed would be in the order they appear in the first array/list(ARR1)

import java.util.Arrays;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        intersectionArrays(arr1, arr2);
    }

    public static void intersectionArrays(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void intersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break; //once you print the value don't move forward.
                }
            }
        }
    }

    // better time and space complexity
}