import java.util.Comparator;
import java.util.PriorityQueue;

class MaxPQComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        }
        return 0;
    }
}

/* Min PQ Comparator is default for inbuilt, but we have to override the comparator to use Inbuilt Max-Heap PQ */
class MinPQComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        if (o1 < o2) {
            return -1;
        } else if (o1 > o2) {
            return 1;
        }
        return 0;
    }
}

/* Comparator for comparing string length */
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        } else if (o1.length() > o2.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class InbuiltMaxPriorityQueue {
    public static void main(String[] args) {
        String[] arr = {"this", "at", "a", "their", "queues"};
        StringLengthComparator stringComparator = new StringLengthComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
//        MaxPQComparator maxPQComparator = new MaxPQComparator();
//        PriorityQueue<Integer> pq = new PriorityQueue<>(maxPQComparator);
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // Collections.reverseOrder() does similar work as maxPQComparator
//        int[] arr = {9, 1, 0, 4, 7, 3};
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
}