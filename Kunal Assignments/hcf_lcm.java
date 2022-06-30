import java.sql.SQLOutput;
import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int gcd = 1, lcm = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (num1 * num2) / gcd;
        System.out.println("The gcd is: " + gcd);
        System.out.println("The lcm is: " + lcm);
    }
}
