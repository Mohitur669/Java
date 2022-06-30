import java.util.Scanner;

public class sumMultiple {

    //    Write a program to print the sum of negative numbers, sum of positive even numbers
//      and the sum of positive odd numbers from a list of numbers (N) entered by the user.
//    The list terminates when the user enters a zero.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int neg_sum = 0, pos_even_sum = 0, pos_odd_sum = 0;
        while((num = s.nextInt()) != 0){
            if(num<0){
                neg_sum = neg_sum + num;
            }
            else {
                if(num%2 == 0){
                    pos_even_sum = pos_even_sum + num;
                }
                else{
                    pos_odd_sum = pos_odd_sum + num;
                }
            }
        }
        System.out.println("The sum of the neg numbers is: " + neg_sum);
        System.out.println("The sun of the pos even numbers is: " + pos_even_sum);
        System.out.println("The sun of the pos odd numbers is: " + pos_odd_sum);
    }
}
