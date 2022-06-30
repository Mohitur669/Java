import java.util.Scanner;

public class passFail {
    public static void main(String[] args) {
        int mark = 0;
        passfail(mark);
    }

    static void passfail(int a) {
        int marks;
        Scanner s = new Scanner(System.in);
        marks = s.nextInt();
        if (marks >= 91 && marks <= 100) {
            System.out.println("Your grade: AA");;
        }
        if (marks >= 81 && marks <= 90) {
            System.out.println("Your grade: AB");;
        }
        if (marks >= 71 && marks <= 80) {
            System.out.println("Your grade: BB");;
        }
        if (marks >= 61 && marks <= 70) {
            System.out.println("Your grade: BC");;
        }
        if (marks >= 51 && marks <= 60) {
            System.out.println("Your grade: CD");;
        }
        if (marks >= 41 && marks <= 50) {
            System.out.println("Your grade: DD");;
        }
        if (marks <= 40){
            System.out.println("Your grade: Fail");;
        }
    }
}
