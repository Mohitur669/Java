import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
