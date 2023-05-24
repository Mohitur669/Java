import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyWithoutHashmap(2));
        // 19 true
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    public static int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }

    // Without hashmap
    public static boolean isHappyWithoutHashmap(int n) {
        if (n == 1 || n == 7) {
            return true;
        }
        if (n < 10) {
            return false;
        }
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return isHappy(sum);
    }
}