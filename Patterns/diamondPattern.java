//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *

public class diamondPattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        int row, col;
//        upper half
        for (row = 1; row <= n ; row++) {
            for (col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        lower half
        for (row = n-1; row >=1; row--) {
            for (col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}