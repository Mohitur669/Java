//     For the given number 'N'(0<N<=100), little johnny wants to find out the minimum positive integer
//     'X' divisible by 'N'. where the sum of digits of 'X' is equal to 'N' and 'X' is not equal to 'N'
//     If such 'X' does not exist, then output should be -1
//
//        Ex:
//        Input: 9
//        Output: 18
//
//        Input: 10
//        Output: 190
//

import java.util.Scanner;

public class johnyProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n; i < 1000000; i++) {
            if (i % n == 0 && i != n && sumOfDigits(i) == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}