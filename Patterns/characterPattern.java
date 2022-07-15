//        A
//        BC
//        CDE
//        DEFG
//        EFGHI

public class characterPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char ch = (char) ('A' + row - 1);
            for (int col = row; col >= 1; col--) {
                System.out.print(ch);
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}