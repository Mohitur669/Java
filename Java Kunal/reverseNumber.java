import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner s  =new Scanner(System.in);
        int n = s.nextInt();
        int rem;
        System.out.println("The reverse number is: ");
        while(n>0){
            rem = n%10;
            n = n/10;
            System.out.print(rem);
        }
    }
}
