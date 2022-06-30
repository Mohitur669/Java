import java.util.Arrays;
import java.util.Scanner;

//Variable length Arguments
public class variableArguments {
    public static void main(String[] args) {
        fun(4, 5, 6, 7, 78, 45, 342);
        multipleArguments(2,3,"Mohitur", "Rahaman", "Mohd");
    }
    static void multipleArguments(int a, int b, String ...m){
        System.out.println(Arrays.toString(m));
    }
    static void fun(int... v) { // this takes as much as inputs in the form of array
        System.out.println(Arrays.toString(v));
    }
}
