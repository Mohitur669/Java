import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.close();
        int div = 2;
        while (div <= n / 2) {
            if (n % div == 0) {
                System.out.println("Composite");
                return;
            }
            div = div + 1;
        }
        System.out.println("Prime");
    }
}
