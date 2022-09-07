import java.util.Scanner;

public class powerRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = s.nextInt();
        System.out.print("Enter the power: ");
        int n = s.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int smallAns = power(x, n - 1);
        return x * smallAns;
    }
}