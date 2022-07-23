import java.util.Scanner;

public class testCode {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("");
        for (int i = 0; i < 5; i++) {
            str1.append((char) ('a' + i));
        }
        System.out.println(str1);
    }

    public static int countWords(String str) {
        //Your code goes here
        int count = 1;
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

}