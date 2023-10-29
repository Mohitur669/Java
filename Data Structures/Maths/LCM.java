public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(0, 6));
    }

    // lcm(a, b) = (a * b) / hcf(a, b)
    public static int lcm(int a, int b) {
        if (euclideanAlgo(a, b) == 1) {
            return a * b;
        }

        return (a * b) / euclideanAlgo(a, b);
    }

    // it's for GCD / HCF
    public static int euclideanAlgo(int a, int b) {
        if (a == 0) {
            return b;
        }
        return euclideanAlgo(b % a, a);
    }
}