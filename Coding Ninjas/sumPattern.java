import java.util.Scanner;

public class sumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int currentRow = 1;
        int sum = 0;

        while (currentRow <= n) {
            sum = sum + currentRow;
            int currentCol = 1;
            while (currentCol <= currentRow) {
                System.out.print(currentCol);
                if (currentCol == currentRow) {
                    System.out.print('=');
                } else {
                    System.out.print('+');
                }
                currentCol++;

            }

            System.out.println(sum);
            currentRow++;
        }
    }
}