//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//        Input format :
//        Integer x
//        Output format :
//        Terms of series (separated by space)
//        Sample Input 1 :
//        10
//        Sample Output 1 :
//        5 11 14 17 23 26 29 35 38 41

import java.util.Scanner;

public class termsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = 3 * i + 2;
            if (sum % 4 != 0) {
                System.out.print(sum + " ");
            } else {
                ++x;
            }
        }
    }
}