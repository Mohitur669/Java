import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // int a, b;
        // System.out.print("Enter the Numbers: ");
        Scanner s = new Scanner(System.in);
        // a = s.nextInt();
        // b = s.nextInt();
        // int c = a + b;
        // System.out.println("Sum is: " + c);
        String str = s.next();
        char c = str.charAt(0);
        System.out.println(c);
        s.close();
    }
}