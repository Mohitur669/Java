public class reverseEachWord {
    public static void main(String[] args) {
        String str = "Welcome Mohitur";
        System.out.println(reverseEachWordOptimised(str));
    }

    public static String reverseEachWordOptimised(String input) {
        input = input + " ";
        String rev = "";
        int prevPos = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                for (int j = i - 1; j >= prevPos; j--) {
                    rev = rev + input.charAt(j);
                }
                prevPos = i + 1;

                rev = rev + " ";
            }
        }
        //System.out.println(rev);
        return rev;
    }

    private static String reverseWord(String str, int start, int end) {
        String reverseWord = "";
        while (start < end) {
            reverseWord = str.charAt(start) + reverseWord;
            start++;
        }
        return reverseWord;
    }

    public static String reverseEachWord2(String str) {
        //Your code goes here
        int n = str.length();
        if (n == 0) { //code to check for empty string
            return str;
        }
        int currentStart = 0;
        int i;
        String result = "";
        for (i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                int currentEnd = i;
                result = result + reverseWord(str, currentStart, currentEnd) + " ";
                currentStart = i + 1;
            }
        }
        //System.out.println(i);
        //for last word
        int currentEnd = i;
        result = result + reverseWord(str, currentStart, currentEnd);
        return result;
    }
}