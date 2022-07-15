//        1=1
//        1+2=3
//        1+2+3=6
//        1+2+3+4=10
//        1+2+3+4+5=15

public class sumPattern {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
                if (row != col) {
                    System.out.print("+");
                } else {
                    sum = sum + col;
                    System.out.print("=" + sum);
                }
            }
            System.out.println();
        }
    }
}