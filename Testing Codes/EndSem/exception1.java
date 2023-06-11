package EndSem;

public class exception1 {
    public static void main(String[] args) {
        int a = 0;
        int[] arr = new int[5];
        try {
            a = 10 / 0;
            arr[90] = 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Exception caught2");
        }
    }
}