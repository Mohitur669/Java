import java.util.Scanner;

public class goOut {

    //    Kunal is allowed to go out with his friends only on the even days of a given month.
//     Write a program to count the number of days he can go out in the month of August
    public static void main(String[] args) {
        int aug_day_count = 31;
        int day_count = 0;
        for (int i = 1; i < aug_day_count; i++) {
            if (i % 2 == 0) {
                day_count = day_count + 1;
            }
        }
        System.out.println("Can go out: " + day_count + " days");
    }
}
