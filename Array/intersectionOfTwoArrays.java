//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
// You need to print their intersection; An intersection for this problem can be defined
// when both the arrays/ contain a particular value or to put it in other words,
// when there is a common value that exists in both the arrays/lists.

// Note: Input arrays/lists can contain duplicate elements.
//       The intersection elements printed would be in the order they appear in the first array/list(ARR1)

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break; //once you print the value don't move forward.
                }
            }
        }
    }
}