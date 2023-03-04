import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 5, 5, 6};
        int[] arr2 = {3, 44, 35, 465, 67, 3, 5, 5};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        Set<Integer> finalSet = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var)) {
                finalSet.add(var);
            }
        }
        int[] arr = new int[finalSet.size()];
        int idx = 0;
        for (Integer value : finalSet) {
            arr[idx] = value;
            idx++;
        }
        return arr;
    }
}