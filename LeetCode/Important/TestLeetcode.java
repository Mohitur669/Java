import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestLeetcode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 3};
        System.out.println(Arrays.toString(twoRepeated(arr, 4)));
    }

    public static void removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int element : nums) {
            s.add(element);
        }
        System.out.println(s);
    }

    public static int[] twoRepeated(int[] arr, int N) {
        // Your code here
        Set<Integer> s = new HashSet<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
            } else {
                a.add(arr[i]);
            }
        }
        int[] result = new int[2];
        int i = 0;
        for (int ele : a) {
            result[i] = ele;
            i++;
        }

        return result;
    }
}