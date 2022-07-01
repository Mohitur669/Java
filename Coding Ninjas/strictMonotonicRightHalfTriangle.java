import java.util.Scanner;

public class strictMonotonicRightHalfTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int startingNumber = 1;
//      in this case we just put the starting number in the main scope so that it can't be reset by every time
        while (i <= n) {
            int j = 1;
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