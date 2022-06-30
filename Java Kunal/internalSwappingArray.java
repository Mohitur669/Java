import java.util.Arrays;
import java.util.Scanner;

public class internalSwappingArray {
    public static void main(String[] args) {
        int[] arr = {2, 30, 45, 56, 32, 89};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 23; // if you make change to the object via this ref variable, same object will be changed
    }
}
