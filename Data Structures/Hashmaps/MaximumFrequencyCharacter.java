/* Maximum Frequency Character in a String */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getMaxOccurringChar(str));
    }

    public static char getMaxOccurringChar(String line) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Calculate the count of each character in the string
        for (char c : line.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum occurrence
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount || (currentCount == maxCount && currentChar < maxChar)) {
                maxChar = currentChar;
                maxCount = currentCount;
            }
        }
        return maxChar;
    }
}