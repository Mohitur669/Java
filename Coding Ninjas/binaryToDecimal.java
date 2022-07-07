import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem = 0;
        double sum = 0;
        double i = 0;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + (rem * Math.pow(2, i));
            ++i;
        }
        System.out.println((int) sum);
    }
}