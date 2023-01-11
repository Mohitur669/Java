/*
Given an NxM matrix that contains only 0s and 1s, find out the size of the maximum square sub-matrix with all 0s.
You need to return the size of the square matrix with all 0s.

Input format :
The first line of the test case contains two integer values, 'N' and 'M', separated by a single space.
They represent the 'rows' and 'columns' respectively.
Second-line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith rows constitutes column values separated by a single space (Either 0 or 1).
Output Format:
Print the size of maximum square sub-matrix.

Constraints :
0 <= N <= 10^4
0 <= M <= 10^4
Time Limit: 1 sec

Sample Input 1:
3 3
1 1 1
1 1 1
1 1 0
Sample Output 1:
1

Sample Input 2:
4 4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
Sample Output 2:
4 */

public class MaximumSquareMatrixWithAllZeroes {
    public static int findMaxSquareWithAllZeros(int[][] input) {
        int max = 0;
        if (input.length == 0) {
            return 0;
        }
        int[][] array = new int[input.length][input[0].length];
        for (int i = 0; i < input.length; i++) {
            if (input[i][0] == 0) {
                array[i][0] = 1;
                max = 1;
            } else
                array[i][0] = 0;
        }
        for (int j = 0; j < input[0].length; j++) {
            if (input[0][j] == 0) {
                array[0][j] = 1;
                max = 1;
            } else
                array[0][j] = 0;
        }
        for (int i = 1; i < input.length; i++) {
            for (int j = 1; j < input[0].length; j++) {
                if (input[i][j] == 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1 + Math.min(array[i - 1][j - 1],
                            Math.min(array[i][j - 1], array[i - 1][j]));
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0},
                {1, 1, 1},
                {1, 1, 1}};
        System.out.println(findMaxSquareWithAllZeros(arr));
    }
}