import java.util.Scanner;

public class monotonicRightHalfTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int startingNumber = i;
//      we have to reset the starting number every loop, so that it can print in the specific order
            while (j <= i) {
                System.out.print(startingNumber);
                startingNumber++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}