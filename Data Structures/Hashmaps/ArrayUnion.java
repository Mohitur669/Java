import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 2, 2, 3, 6, 5, 3, 2};
        int[] arr2 = {2, 3, 2, 6, 6, 5, 1};
        PrintUnion(arr1, arr2);
    }

    public static void PrintUnion(int[] arr1, int[] arr2) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }
        System.out.print(s);
    }
}