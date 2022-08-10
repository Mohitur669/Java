/*
Given a 2D integer array with n rows and m columns. Print the 0th row from input n times,
1st row n-1 times…..(n-1)th row will be printed 1 time.

Input format :
Line 1 : No of rows(n) & No of columns(m) (separated by space)
Line 2 : Row 1 elements (separated by space)
Line 3 : Row 2 elements (separated by space)
Line 4 : and so on

Sample Input :
3 3
1    2    3
4    5    6
7    8    9
Sample Output :
1    2    3
1    2    3
1    2    3
4    5    6
4    5    6
7    8    9
*/

public class print2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArray(arr);
    }

    public static void printArray(int input[][]) {
        int n = input.length;
        int m = input[0].length;
        for (int i = 0; i < n; i++) {
            int count = n - i;
            while (count > 0) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                count--;
                System.out.println();
            }
        }
    }
}