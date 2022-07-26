/* Calculate the sum of all columns individually and prints the largest among them */

import java.util.Scanner;

public class largestColumnSum {
    public static void main(String[] args) {
        int[][] input = takeInput();
        printMatrix(input);
        System.out.println("The largest column sum is: " + largestColumnSumValue(input));
    }

    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Number of columns: ");
        int cols = s.nextInt();
        int[][] input = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at " + i + " row " + j + " column");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static int largestColumnSumValue(int[][] input) {
        int largestSum = Integer.MIN_VALUE;
        int row = input.length;
        int col = input[0].length;
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum = sum + input[i][j];
            }
            if (sum > largestSum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }

    public static void printMatrix(int[][] input) {
        int row = input.length;
        int col = input[0].length;
        System.out.println("The matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}