import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rows = 1;
        while(rows<=n) {
            int spaces = 1;
            //1st loop for spaces
            while(spaces<=n-rows) {
                System.out.print(' ');
                spaces++;
            }
            //2nd increasing loop
            int increasing = 1;
            int printValueLeft = rows;
            while(increasing<=rows) {
                System.out.print(printValueLeft);
                printValueLeft++;
                increasing++;
            }
            //3rd decreasing loop
            int decreasing = rows-1;
            int printValueRight = printValueLeft - 2;
            while(decreasing>=1) {
                System.out.print(printValueRight);
                printValueRight--;
                decreasing--;
            }
            System.out.println();
            rows++;
        }
    }
}