import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("This is a vowel");
        } else {
            System.out.println("This is a consonant");
        }
    }
}
