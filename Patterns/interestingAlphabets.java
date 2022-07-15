//        E
//        DE
//        CDE
//        BCDE
//        ABCDE

public class interestingAlphabets {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char ch = (char) ('A' + n - row);
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}