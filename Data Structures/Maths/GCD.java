public class GCD {
    // It is used to find gcd in efficient way
    public static void main(String[] args) {
        System.out.println(euclideanAlgo(0, 9));
    }

    // gcd(a,b) = gcd(rem(b,a), a)
    public static int euclideanAlgo(int a, int b) {
        if (a == 0) {
            return b;
        }
        return euclideanAlgo(b % a, a);
    }
}