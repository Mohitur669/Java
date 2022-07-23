import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printSubstrings(str);
    }

    public static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            //We will be printing all substrings starting from index i
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}