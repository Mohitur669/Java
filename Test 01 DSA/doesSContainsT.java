/*
Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.

Groups can be made with any set of elements, i.e. elements need not to be continuous.
And you need to consider each and every element of input array in some group.
Return true, if array can be split according to the above rules, else return false.

Note : You will get marks only if all the test cases are passed.

Input Format :
Line 1 : Integer N (size of array)
Line 2 : Array A elements (separated by space)
Output Format :
true or false

Constraints :
1 <= N <= 50

Sample Input 1 :
2
1 2
Sample Output 1 :
false

Sample Input 2 :
3
1 4 3
Sample Output 2 :
true
 */

import java.util.Scanner;

public class doesSContainsT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String large = s.nextLine();
        String small = s.nextLine();
        System.out.println(checkSequence(large, small));
    }

    public static boolean checkSequence(String a, String b) {
        if (b.length() == 0)
            return true;
        if (a.length() == 0 && b.length() != 0)
            return false;

        if (a.charAt(0) == b.charAt(0))
            return checkSequence(a.substring(1), b.substring(1));
        else
            return checkSequence(a.substring(1), b);
    }
}