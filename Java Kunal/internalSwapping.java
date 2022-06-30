import java.util.Scanner;

public class internalSwapping {
    public static void main(String[] args) {
        String name = "Mohitur Rahaman";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Mohd Mohitur Rahaman"; // here we are not changing the value, just creating a new object
    }
}

// swapping via functions does not work unless you are using pointers
// It works only for pass by value not pass by object

// but in case of array it works