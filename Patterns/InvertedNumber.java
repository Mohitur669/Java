//        4444
//        333
//        22
//        1

public class InvertedNumber {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(n-row+1);
            }
            System.out.println();
        }
    }
}