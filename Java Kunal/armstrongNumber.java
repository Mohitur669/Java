import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        isArmstrong(num);
    }
    static void isArmstrong(int n) {
        int original = n;
        int rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
