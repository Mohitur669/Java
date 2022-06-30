import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
//        array of primitives
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
//        System.out.println("The output is: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);

//        array of objects
        String[] str =  new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = s.next();
        }
        System.out.print(Arrays.toString(str));

//        for (int j : arr) {
//            System.out.print(j);
//        }
    }
}
