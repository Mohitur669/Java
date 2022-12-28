import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 2, 2, 3, 6, 5, 3, 2};
        int[] arr2 = {2, 3, 2, 6, 6, 5, 1};
        PrintIntersection(arr1, arr2);
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                int value = map.get(arr1[i]);
                map.put(arr1[i], value + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int freq = map.get(arr2[i]);
                if (freq > 0) {
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i], freq - 1);
                }
            }
        }
    }

    public static void PrintIntersection(int[] arr1, int[] arr2) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (s.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}