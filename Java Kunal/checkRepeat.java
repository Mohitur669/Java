import java.util.Scanner;

public class checkRepeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int check_repeat = s.nextInt();
        int rem, count = 0;
        while (n > 0) {
            rem = n%10;
            n = n/10;
            if (check_repeat == rem){
                count++;
            }
        }
        System.out.println("Repeated times of the number " + check_repeat +" is: " + count);
    }
}
