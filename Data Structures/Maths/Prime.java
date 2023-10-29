public class Prime {
    public static void main(String[] args) {
        sieveOfEratosthenes(40);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }


        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static void allPrimeNumbersToTheLimit(int limit) {
        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // efficient way to find prime numbers
    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}