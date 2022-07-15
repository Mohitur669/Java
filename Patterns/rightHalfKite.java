//        *
//        * *
//        * * *
//        * * * *
//        * * * * * --> upper half end
//        * * * *   --> lower half start
//        * * *
//        * *
//        *

public class rightHalfKite {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int row, col;
//        upper half
        for (row = 1; row <= n ; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        lower half
        for (row = n-1; row >=1; row--) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//      This single for loop can do the same thing
//    static void pattern(int n) {
//        for (int row = 0; row < 2 * n; row++) {
//            int totalColsInRow = row > n ? 2 * n - row: row;
// explanation of previous line: if --> row>n then do(?) (2*n-row) else-do(:) row
//            for (int col = 0; col < totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
}