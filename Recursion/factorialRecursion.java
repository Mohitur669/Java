public class factorialRecursion {
    public static int fact(int n) {
//        this if statement is called base statement
//        if we do not add this the function call will run infinitely
        if (n == 0) {
            return 1;
        }
        int smallAns = fact(n - 1);
        return n * smallAns;
    }

    public static void main(String[] args) {
        int n = 5;
        int factAns = fact(n);
        System.out.println(factAns);
    }
}