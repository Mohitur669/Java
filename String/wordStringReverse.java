import java.util.Scanner;

public class wordStringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseWordWise(str));
    }

    public static String reverseWordWise(String input) {
        if (input.isEmpty()) {
            return "";
        }
        int n = input.length();
        int currentWordStart;
        int currentWordEnd = n;
        String reversedString = "";
        int i;
        for (i = n - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ') {
                currentWordStart = i + 1;
                reversedString += input.substring(currentWordStart, currentWordEnd) + " ";
                currentWordEnd = i;
            }
        }
        //System.out.println(currentWordEnd);
        //thi swe are doing for the first word.
        currentWordStart = i + 1;
        reversedString += input.substring(currentWordStart, currentWordEnd);
        return reversedString;
    }

    //  Coding Ninjas Solution
    public static String reverseWordWise2(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                //Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }
                //Add it final String(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;
        return ans;
    }
}