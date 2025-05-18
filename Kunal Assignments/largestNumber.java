import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all
public class largestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, max = 0;
        while ((num = s.nextInt()) != 0) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest number among the inputs is: " + max);

    }
}