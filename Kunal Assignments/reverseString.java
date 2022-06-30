import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
