public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(binarySearch(arr, 3));
        populationYearCount();
    }

    public static void populationYearCount() {
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
        System.out.println(year);
    }

    public static int digit(long mobileUsers) {
        int count = 0;
        while (mobileUsers != 0) {
            mobileUsers = mobileUsers / 10;
            count++;
        }
        return count;
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}