public class removeDuplicate {
    public static void main(String[] args) {
        String str = "aabbbcc";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        int n = str.length();
        if (n == 0) { //to handle the case of empty string
            return str;
        }
        String answer = ""; //we create answer string to store the output.
        int startIndex = 0;
        while (startIndex < n) {
            char uniqueChar = str.charAt(startIndex);
            int nextUniqueChar = startIndex + 1;
            while (nextUniqueChar < n && str.charAt(nextUniqueChar) == uniqueChar) {
                nextUniqueChar++;
            }
            answer = answer + uniqueChar;
            startIndex = nextUniqueChar;
        }
        return answer;
    }
}