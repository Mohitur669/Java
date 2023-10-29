public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f", squareRoot(40, 3));
    }

    public static double squareRoot(int n, int precision) {
        int start = 1;
        int end = n;

        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid > n) {
                end = mid - 1;
            }
            if (mid * mid < n) {
                start = mid + 1;
            }
            if (mid * mid == n) {
                return mid;
            }
        }

        double incr = 0.1;

        for (int i = 0; i < precision; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
}