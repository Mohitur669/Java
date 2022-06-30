import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class sumNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, sum =0;
        while ((num = s.nextInt()) !=0) {
            sum = sum + num;
        }
        System.out.println("The total sum of the inputs is: "+sum);
    }
}
