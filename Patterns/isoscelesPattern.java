//      1
//     121
//    12321
//   1234321

public class isoscelesPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            int num;
            for (num = 1; num <= row; num++) {
                System.out.print(num);
            }
            for (num = row - 1; num >= 1; num--) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}