import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fruit = s.next();

            switch (fruit){
                case "apple":
                    System.out.println("Red round fruit");
                    break;
                case "mango":
                    System.out.println("King of fruits");
                    break;
                default: // default statement does not need break keyword
                    System.out.println("No more data available");
            }
//        Enhanced switch statement:
//        switch (fruit) {
//            case "apple" -> System.out.println("Red round fruit");
//            case "mango" -> System.out.println("King of fruits");
//            default -> System.out.println("No more data available");
//        }
    }
}
