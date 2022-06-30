import java.util.Scanner;

public class charcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase");
        } else {
            System.out.println(ch + " is Uppercase");
        }
    }
}
