import java.util.Scanner;

public class numberTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = n*i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}
