//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
public class squareNumber {
    public static void main(String[] args) {
        int n = 4;
        int N = 2 * n - 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int minDistance = Math.min(Math.min(i, j), Math.min(N - i - 1, N - j - 1));
                int val = n - minDistance;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}