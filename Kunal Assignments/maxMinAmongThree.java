import java.util.Scanner;

public class maxMinAmongThree {

//    Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();

        int large = largest(first, second, third);
        int small = smallest(first, second, third);

        System.out.println("Largest: " + large);
        System.out.println("Smallest: " + small);
    }

    static int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int smallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
