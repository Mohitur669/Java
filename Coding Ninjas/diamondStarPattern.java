import java.util.Scanner;

public class diamondStarPattern {
    public static void main(String[] args) {
//      diamond pattern always need odd number of lines
        Scanner s = new Scanner(System.in);
        int lines = s.nextInt();
        int mid = (lines + 1) / 2;

        if (lines % 2 != 0) {
            //          upper part
            for (int i = 1; i <= mid; i++) {
//                space
                for (int space = 1; space <= (mid - i); space++) {
                    System.out.print(" ");
                }
//                star
                for (int j = 1; j <= (i * 2 - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
//            lower
            for (int i = 1; i <= (mid - 1); i++) {
//            space
                for (int space = 1; space <= i; space++) {
                    System.out.print(" ");
                }
//            star
                for (int j = 1; j <= 2 * (mid - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}