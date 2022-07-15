//        *
//        * *
//        * * *
//        * * * *

import java.util.Scanner;

public class upperHalfRightPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
//            for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
//            when one row is printed we need to print a new line
            System.out.println();
        }
    }
}