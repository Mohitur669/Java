package kunal;

public class numbersRecursion {
    public static void main(String[] args) {
        print(1, 10);
    }

    static void print(int n, int limit) {
        if (n == limit) {
            System.out.println(limit);
            return;
        }
        System.out.print(n + " ");
        print(n + 1, limit);
    }
}