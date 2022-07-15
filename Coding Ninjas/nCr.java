import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);
        int ans = num/(den1*den2);
        System.out.println(ans);

    }

    public static int factorial(int a){
        int i = 1, fact = 1;
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}