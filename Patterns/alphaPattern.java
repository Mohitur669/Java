//        A
//        BB
//        CCC
//        DDDD
//        EEEEE

public class alphaPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                char ch = (char) ('A' + row - 1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}