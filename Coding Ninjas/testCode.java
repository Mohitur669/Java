
public class testCode {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            int printValue = 2 * row - 1;
            for (int col = 1; col <= n; col++) {
                System.out.print(printValue);
                printValue = printValue + 2;
                if (printValue > 2 * n - 1) {
                    printValue = 1;
                }
            }
            System.out.println();
        }
    }
}