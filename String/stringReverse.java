import java.util.Arrays;
import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverse2(str));
    }

    static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    static String reverse2(String str) {
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }
        return reverseString;
    }
}