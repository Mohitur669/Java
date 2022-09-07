/*Write a recursive function that returns the sum of the digits of a given integer.

Input format :
Integer N
Output format :
Sum of digits of N

Constraints :
0 <= N <= 10^9

Sample Input 1 :
12345
Sample Output 1 :
15

Sample Input 2 :
9
Sample Output 2 :
9
*/

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(123454));
    }

    public static int sum(int input) {
        if (input == 0) {
            return 0;
        }
        int rem = input % 10;
        return rem + sum(input / 10);
    }
}