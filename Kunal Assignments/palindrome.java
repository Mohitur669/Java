import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rem, reversed = 0;
        int num = s.nextInt();
        int original = num;
        int[] arr = {};
        while (num > 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }
        if (original == reversed) {
            System.out.println("This is a Palindrome Number");
        }
        else{
            System.out.println("Not an Palindrome Number");
        }
    }
}
