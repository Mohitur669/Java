public class FibonacciDP {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(fibonacciModified(n));
        System.out.println(fibonacciDP(n));
        System.out.println(fibonacci(n));
    }

    // Time Complexity - O(n)
    public static int fibonacciModified(int n) {
        int[] storage = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            storage[i] = -1;
        }
        return fibonacciModifiedHelper(n, storage);
    }

    // Top-Down Approach - Memoization Code
    public static int fibonacciModifiedHelper(int n, int[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = n;
            return storage[n];
        }
        if (storage[n] != -1) {
            return storage[n];
        }
        storage[n] = fibonacciModifiedHelper(n - 1, storage) + fibonacciModifiedHelper(n - 2, storage);
        return storage[n];
    }

    // To just compare run-time of both of the methods I just wrote this code!
    // Time Complexity - O(2^n)
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Bottom-Up Approach - Dynamic Programming Code
    /* Actually we use dynamic programming to eliminate the use of recursion! */
    public static int fibonacciDP(int n) {
        int[] storage = new int[n + 1];
        storage[0] = 0;
        storage[1] = 1;

        for (int i = 2; i <= n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2];
        }
        return storage[n];
    }
}