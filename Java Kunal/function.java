import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        String messege = greet();
        System.out.println(messege);
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }

    static void sum() {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = num1 + num2;
        System.out.println(num3);
    }
}
