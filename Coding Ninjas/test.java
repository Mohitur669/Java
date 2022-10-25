import java.util.Scanner;
import java.util.Stack;

// this is a testing code
public class test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.print(stack.pop() + stack.size());
    }
}