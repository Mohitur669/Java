public class stringPalindrome {
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("cabac"));
    }

    public static boolean isStringPalindrome(String input) {
        return palindrome(input, 0, input.length() - 1);
    }

    public static boolean palindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return palindrome(input, start + 1, end - 1);
    }
}