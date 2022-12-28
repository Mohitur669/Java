public class highestOccuringCharacter {
    public static void main(String[] args) {
        String str = "abcdeapapqarrrrr";
        System.out.println(highestOccurringChar(str));
    }

    public static char highestOccurringChar(String str) {
        if (str.length() == 0) {
            return ' ';
        }
        int[] frequency = new int[256]; // Automatically all elements initialized to 0, don't need to re-initialize
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }
        char output = str.charAt(0);
        int max = frequency[output];
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > max) {
                max = frequency[ch];
                output = ch;
            }
        }
        return output;
    }
}