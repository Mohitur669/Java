import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int term, fact = 1;
        term = s.nextInt();
        if (term == 0 || term == 1){
            System.out.println("The factorial is: " + fact);
        }
        else{
            for (int i = 1; i <= term; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial is: " + fact);
        }
    }
}
