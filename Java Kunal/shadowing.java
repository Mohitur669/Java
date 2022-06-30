import java.util.Scanner;

public class shadowing {
    static int x = 30; // x will be available in every block of shadowing class
//    but we have to put static before declaring/initializing it

    public static void main(String[] args) {
        System.out.println(x); // 30
        int x = 40;
        System.out.println(x); // 40, actually variable with the higher level scope is hidden
//        so the line 4 will be shadowed in line 10, this is called shadowing
//        lower level is overriding the upper level
        fun();
    }
    static void fun(){
        System.out.println(x); // 30, because present in the shadowing class block
    }
}

// Note: scope will begin when value is initialized