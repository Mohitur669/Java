import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int start = 1;
        int divisor = 0;
        while (start <= num) {
            if (num % start == 0) {
                divisor = divisor + 1;
            }
            start++;
        }
        if (divisor == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        s.close();
    }
}