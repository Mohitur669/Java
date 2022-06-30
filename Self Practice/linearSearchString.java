import java.util.Arrays;
import java.util.Scanner;

public class linearSearchString {
    public static void main(String[] args) {
        String name = "Mohitur";
        char target = 'u';
        System.out.println(search3(name, target));
    }

    static boolean search(String str, char ch) {
        if (str.length() == 0) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (ch == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    static char search2(String str, char ch){
        if (str.length()==0){
            return 'i';
        }
        for (int index = 0; index < str.length(); index++) {
            char target = str.charAt(index);
            if (ch == str.charAt(index)){
                return target;
            }
        }
        return 'i';
    }
    static int search3(String str, char ch){
        if (str.length()==0){
            return -1;
        }
        for (int index = 0; index < str.length(); index++) {
            char target = str.charAt(index);
            if (ch == str.charAt(index)){
                return index;
            }
        }
        return -1;
    }
}
