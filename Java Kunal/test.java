import java.util.Scanner;

public class test {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int rem, sum =0, multi = 1;

            while(num>0){
                rem = num%10;
                num = num/10;
                sum = sum + rem;
                multi =  multi *rem;
            }
            int ans = multi -sum;
        System.out.println(ans);
    }
}