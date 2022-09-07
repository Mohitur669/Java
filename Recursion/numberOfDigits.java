public class numberOfDigits {
    public static void main(String[] args) {
        int n = 89760;
        System.out.println(count(n));
    }

    public static int count(int n) {
        //Write your code here
        if (n == 0) {
            return 0;
        }
        int smallAns = count(n / 10);
        return smallAns + 1;
    }
}