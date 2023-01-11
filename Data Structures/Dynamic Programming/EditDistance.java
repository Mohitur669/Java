/*
Given two strings s and t of lengths m and n respectively, find the edit distance between the strings.
Edit Distance:
Edit Distance of two strings is minimum number of operations required to make one string equal to other.
In order to do so you can perform any of the following three operations only :
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note:
Strings don't contain spaces

Input Format :
The first line of input contains a string, that denotes the value of s. The following line contains a string,
that denotes the value of t.
Output Format :
The first and only line of output contains the edit distance value between the given strings.

Constraints :
1<= m,n <= 10
Time Limit: 1 second

Sample Input 1 :
abc
dc
Sample Output 1 :
2 */

public class EditDistance {
    public static int editDistanceRecursive(String s, String t) {
        if (s.length() == 0) {
            return t.length();
        }
        if (t.length() == 0) {
            return s.length();
        }
        if (s.charAt(0) == t.charAt(0)) {
            return editDistanceRecursive(s.substring(1), t.substring(1));
        } else {
            int op1 = editDistanceRecursive(s, t.substring(1));
            int op2 = editDistanceRecursive(s.substring(1), t);
            int op3 = editDistanceRecursive(s.substring(1), t.substring(1));
            return 1 + Math.min(op1, Math.min(op2, op3));
        }
    }

    public static int editDistanceMemoization(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] storage = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                storage[i][j] = -1;
            }
        }
        return editDistanceMemoizationHelper(s, t, storage);
    }

    public static int editDistanceMemoizationHelper(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();
        if (storage[m][n] != -1) {
            return storage[m][n];
        }
        if (m == 0) {
            storage[m][n] = n;
            return storage[m][n];
        }
        if (n == 0) {
            storage[m][n] = m;
            return storage[m][n];
        }
        if (s.charAt(0) == t.charAt(0)) {
            storage[m][n] = editDistanceMemoizationHelper(s.substring(1), t.substring(1), storage);
        } else {
            // insert
            int op1 = editDistanceMemoizationHelper(s, t.substring(1), storage);
            // delete
            int op2 = editDistanceMemoizationHelper(s.substring(1), t, storage);
            //substitute
            int op3 = editDistanceMemoizationHelper(s.substring(1), t.substring(1), storage);
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
        }
        return storage[m][n];
    }

    public static int editDistanceDP(String s, String t) {
        int m = s.length();
        int n = t.length();
        int storage[][] = new int[m + 1][n + 1];
        for (int j = 0; j <= n; j++) {
            storage[0][j] = j;
        }
        for (int i = 0; i <= m; i++) {
            storage[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(m - i) == t.charAt(n - j)) {
                    storage[i][j] = storage[i - 1][j - 1];
                } else {
                    storage[i][j] = 1 + Math.min(storage[i][j - 1],
                            Math.min(storage[i - 1][j], storage[i - 1][j - 1]));
                }
            }
        }
        return storage[m][n];
    }

    public static void main(String[] args) {
        String s = "adefdfdeadefdf";
        String t = "fdgbdedefdfdgbdfdgbd";
        System.out.println(editDistanceDP(s, t));
        System.out.println(editDistanceMemoization(s, t));
        System.out.println(editDistanceRecursive(s, t));
    }
}