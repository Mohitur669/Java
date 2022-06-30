import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter an operator(or 'x' or 'X' to exit):");
            char ch = in.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter two numbers:");
                int a = in.nextInt();
                int b = in.nextInt();

                if (ch == '+') {
                    ans = a + b;
                } else if (ch == '-') {
                    ans = a - b;
                } else if (ch == '*') {
                    ans = a * b;
                } else if (ch == '/'){
                    if (b != 0){
                        ans = a / b;
                    }
                    else {
                        System.out.println("Invalid mathematical expression.");
                    }
                }
                else{
                    if ( b != 0){
                        ans = a%b;
                    }
                    else {
                        System.out.println("Invalid mathematical expression.");
                    }
                }
            } else if (ch == 'X' || ch == 'x') {
                break;
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println(ans);
        }
    }
}
