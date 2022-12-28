/* Maximum Frequency Character in a String */

import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        HashMap<Character, Integer> hm = new HashMap<>(); //1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) //2
            {
                int old = hm.get(ch);
                int now = old + 1;
                hm.put(ch, now);
            } else {
                hm.put(ch, 1);
            }
        }

        char max = str.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(max))
                max = key;
        }
        System.out.println(max);
    }
}