import java.util.Arrays;
import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        String name = "Mohitur";
        char target = 't';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
    }

    //    checking a character is present in string or not
    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    //    using for each loop
    static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}