//        *
//        *1*
//        *121*
//        *12321*
//        *1234321*
//        *123454321*
//        *1234321*
//        *12321*
//        *121*
//        *1*
//        *

public class halfDiamondWithNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("*"); //for 1st star
        //first half
        int currRow = 1;
        while (currRow <= n) {
            System.out.print("*"); //first star
            int currCol = 1;
            //for increasing numbers
            while (currCol <= currRow) {
                System.out.print(currCol);
                currCol += 1;
            }
            //for decreasing numbers
            currCol = currCol - 2;
            while (currCol >= 1) {
                System.out.print(currCol);
                currCol -= 1;
            }
            System.out.println("*");
            currRow += 1;
        }
        //for 2nd Half
        currRow = 1;
        while (currRow <= n - 1) {
            System.out.print("*");
            int currCol = 1;
            //for increasing numbers
            while (currCol <= n - currRow) {
                System.out.print(currCol);
                currCol++;
            }
            //for decreasing numbers
            currCol = currCol - 2;
            while (currCol >= 1) {
                System.out.print(currCol);
                currCol -= 1;
            }
            System.out.println("*");
            currRow += 1;
        }
        System.out.print("*");
    }
}