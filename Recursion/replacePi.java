/*
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".

Constraints :
1 <= |S| <= 50
where |S| represents the length of string S.

Sample Input 1 :
xpix
Sample Output :
x3.14x

Sample Input 2 :
pipi
Sample Output :
3.143.14

Sample Input 3 :
pip
Sample Output :
3.14p
 */

public class replacePi {
    public static void main(String[] args) {
        System.out.println(replace("xpipixxpii"));
    }

    public static String replace(String input) {
        String output;
        if (input.length() <= 1) {
            return input;
        }
        String temp = replace(input.substring(1));
        if (input.charAt(0) == 'p' && temp.charAt(0) == 'i') {
            output = "3.14" + temp.substring(1);
        } else {
            output = input.charAt(0) + temp;
        }
        return output;
    }
}