import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        factorsOptimized2(20);
    }

    // O(n)
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Optimized -> O(sqrt(n))
    static void factorsOptimized(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n % i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i + " " + n / i);
                }
            }
        }
    }

    // TC & SC -> O(sqrt(n))
    static void factorsOptimized2(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}