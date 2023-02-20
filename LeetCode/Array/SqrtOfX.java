public class SqrtOfX {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            ;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid > mid) {
                start = mid + 1;
            } else if (x / mid < mid) {
                end = mid - 1;
            }
        }
        return end;
    }
}