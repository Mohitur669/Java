import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] mohitur = new int[3][3];

//        input
        for (int i = 0; i < mohitur.length; i++) {
            for (int j = 0; j < mohitur[i].length; j++) {
                mohitur[i][j]= s.nextInt();
            }
        }

//        output
//        for (int i = 0; i < mohitur.length; i++) {
//            for (int j = 0; j < mohitur[i].length; j++) {
//                System.out.print(mohitur[i][j]+ " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < mohitur.length; i++) {
            System.out.println(Arrays.toString(mohitur[i]));
        }
    }
}
