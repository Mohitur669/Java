/*
LCS: Longest Common Subsequence --> Can be used for finding text similarity

Given two strings, S and T with lengths M and N, find the length of the 'Longest Common Subsequence'.
For a string 'str'(per se) of length K, the subsequences are strings containing characters
in the same relative order as they are present in 'str,' but not necessarily contiguous.
Subsequences contain all the strings of length varying from 0 to K.
Example : Subsequences of string "abc" are:  ""(empty string), a, b, c, ab, bc, ac, abc.

Input format :
The first line of input contains the string S of length M.
The second line of the input contains the String T of length N.

Output format :
Print the length of the 'Longest Common Subsequence'.

Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3
Time Limit: 1sec

Sample Input 1 :
adebc
dcadb
Sample Output 1 :
3

Explanation of the Sample Input 1 :
Both the strings contain a common subsequence 'adb', which is the longest common subsequence with length 3.

Sample Input 2 :
ab
defg
Sample Output 2 :
0

Explanation of the Sample Input 2 :
The only subsequence that is common to both the given strings is an empty string("") of length 0.
*/
public class LCS {
    public static void main(String[] args) {
        String s = "dgeigeigeigeigeigeigeigeigei";
        String t = "begigeigeigaaawqgeigeiggeigeigeigei";
        System.out.println(lcsDP(s, t));
        System.out.println(lcsMemoization(s, t));
        System.out.println(lcsRecursive(s, t));
    }

    public static int lcsRecursive(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == t.charAt(0)) {
            return 1 + lcsRecursive(s.substring(1), t.substring(1));
        } else {
            int op1 = lcsRecursive(s, t.substring(1));
            int op2 = lcsRecursive(s.substring(1), t);
            /* op3 is not needed, because it will be covered in op1 & op2 */
//            int op3 = lcsRecursive(s.substring(1), t.substring(1));
            return Math.max(op1, op2);
        }
    }

    public static int lcsMemoization(String s, String t) {
        int[][] storage = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < t.length() + 1; j++) {
                storage[i][j] = -1;
            }
        }
        return lcsMemoizationHelper(s, t, storage);
    }

    public static int lcsMemoizationHelper(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();
        if (storage[m][n] != -1) {
            return storage[m][n];
        }
        if (m == 0 || n == 0) {
            storage[m][n] = 0;
            return storage[m][n];
        }
        if (s.charAt(0) == t.charAt(0)) {
            return 1 + lcsRecursive(s.substring(1), t.substring(1));
        } else {
            int op1 = lcsRecursive(s, t.substring(1));
            int op2 = lcsRecursive(s.substring(1), t);
            storage[m][n] = Math.max(op1, op2);
        }
        return storage[m][n];
    }

    public static int lcsDP(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] storage = new int[m + 1][n + 1];
        // fill the 1st column
        for (int i = 0; i <= m; i++) {
            storage[i][0] = 0;
        }
        // fill the 1st row
        for (int j = 0; j <= n; j++) {
            storage[0][j] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(m - i) == t.charAt(n - j)) {
                    storage[i][j] = 1 + storage[i - 1][j - 1];
                } else {
                    storage[i][j] = Math.max(storage[i][j - 1], storage[i - 1][j]);
                }
            }
        }
        return storage[m][n];
    }
}