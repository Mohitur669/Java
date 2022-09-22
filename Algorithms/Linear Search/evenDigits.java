public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, -7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigits = digits2(num);
//        if (numOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;

        return numOfDigits % 2 == 0; // this line is a replacement for previous 4 lines of if statement
    }

    //    count number of digits in number
    static int digits(int num) {
//        if the number is negative make it positive
        if (num < 0) {
            num = num * -1;
        }
//        if the number is zero
        if (num == 0) {
            return 1;
        }
//      counting the digits
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    //    second way to find the digits number
    //    this is more optimized solution to count digits
    //    will be covered in number system
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
