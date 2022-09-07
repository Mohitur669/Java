public class sumRecursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        int sum = 0;
//        base case
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}