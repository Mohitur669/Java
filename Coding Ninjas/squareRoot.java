import java.util.Scanner;

public class squareRoot {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i*i<=n){
            i++;
        }
        System.out.println(i-1);
    }
}