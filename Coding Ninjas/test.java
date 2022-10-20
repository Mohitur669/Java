import java.util.Scanner;

// this is a testing code
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int gcd = 0;
        if (num1 > num2) {
            for (int i = 1; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.println("The gcd of the two numbers is: " + gcd);
    }
}