import java.util.HashSet;
import java.util.Set;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaabbccdsaa";
        System.out.println(getString(str));
    }

    public static String getString(String str) {
        if (str.length() == 0) {
            return str;
        }

        char[] ch = str.toCharArray();
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            if (!s.contains(ch[i])) {
                s.add(ch[i]);
            } else {
                count++;
            }
        }
        return str;
    }
}