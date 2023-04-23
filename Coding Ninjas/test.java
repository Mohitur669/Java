// this is a testing code
public class test {
    public static void main(String[] args) {
        long population = 1500000000;
        long mobileUsers;
        int year = 1;
        for (int i = 0; i <= year; i++) {
            population = population + 10000000;
            mobileUsers = (long) (population - (population * 0.5));
            if (digit(mobileUsers) == 11) {
                break;
            }
            year++;
        }
    }

    public static int digit(long mobileUsers) {
        int count = 0;
        while (mobileUsers != 0) {
            mobileUsers = mobileUsers / 10;
            count++;
        }
        return count;
    }
}