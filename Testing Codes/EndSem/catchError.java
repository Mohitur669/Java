package EndSem;

public class catchError {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println("Catch Block");
        }
//        This will give compile error due to super class exception already caught
//        catch (ArithmeticException e) {
//            System.out.println("Catch Block2");
//        }
    }
}