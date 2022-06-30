import java.util.Scanner;

public class functionParameters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int n2 = s.nextInt();
        int ans = sum(n1, n2);
        System.out.println(ans);
    }

    static int sum(int j, int k) {
        return j + k;
    }
}
