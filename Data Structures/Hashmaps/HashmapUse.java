import java.util.HashMap;
import java.util.Set;

public class HashmapUse {
    public static void main(String[] args) {
        // Creating a generic Hashmap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert data into map
        map.put("abc", 1);
        map.put("def", 2);

        System.out.println("Size: " + map.size());

        // Check Presence of a value
        if (map.containsKey("abc")) {
            System.out.println("Has abc");
        }

        // Operations on key is very fast O(1), but very slow in Value O(n)
        if (map.containsKey("abc1")) {
            System.out.println("Has abc1");
        }

        if (map.containsValue(2)) {
            System.out.println("Has 2 as a value");
        }

        // Get Value
        int v = 0;
        if (map.containsKey("abc1")) {
            v = map.get("abc1");
        }
        System.out.println(v);

        // Remove Value
        int s = map.remove("abc"); // remove function returns the value of linked key where it stored
        System.out.println(s);

        // Iterate over HashMap
        Set<String> keys = map.keySet();
        for (String str : keys) {
            System.out.println(str);
        }
    }
}