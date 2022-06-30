import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the term limit");
        int n = s.nextInt();
        int sum = 0, a = 0, b = 1;
        if (n != 0) {
            System.out.print(a + " " + b + " ");
            for (int i = 2; i <= n; i++) {
                int temp = a;
                a = b;
                b = b + temp;
                System.out.print(b + " ");
            }
        }
    }
}
