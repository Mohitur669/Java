import java.util.Scanner;

public class fucntionOverloading {
    public static void main(String[] args) {
        fun(23);
        fun("Mohitur");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}

// Functions/Method Overloading
// It will automatically detect which time to use which type of functions
// at the same time, it can also be executed when the name and datatype is same but the argument number is not
// like--> sum(int a, int b);
//            sum (int a, int b, int c)