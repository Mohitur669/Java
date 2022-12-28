import java.util.ArrayList;

public class MapImplementation<K, V> {
    ArrayList<HashmapNode<K, V>> buckets;
    int size;
    int numBuckets;

    // Constructor
    public MapImplementation() {
        numBuckets = 5;
        buckets = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            buckets.add(null);
        }
    }

    // to get the bucket index which is required in insert function
    private int getBucketIndex(K key) {
        int hashcode = key.hashCode();
        return hashcode % numBuckets;
    }

    // Search
    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        HashmapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // Remove a key
    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        HashmapNode<K, V> head = buckets.get(bucketIndex);
        HashmapNode<K, V> prevHead = null;
        while (head != null) {
            if (head.key.equals(key)) {
                size--; // Rehashing
                if (prevHead == null) {
                    buckets.set(bucketIndex, head.next);
                } else {
                    prevHead.next = head.next;
                }
                return head.value;
            }
            prevHead = head;
            head = head.next;
        }
        return null;
    }

    // Size of the bucket
    public int size() {
        return size;
    }

    // Insert into Bucket List (Hashmap)
    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        HashmapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        HashmapNode<K, V> newElementNode = new HashmapNode<>(key, value);
        size++; // Rehashing
        newElementNode.next = head;
        buckets.set(bucketIndex, newElementNode);
        // Applying Rehashing
        double loadFactor = 1.0 * size / numBuckets;
        if (loadFactor > 0.7) {
            reHash();
        }
    }

    public double loadFactor() {
        return (1.0 * size) / numBuckets;
    }

    private void reHash() {
        System.out.println("Rehashing: buckets " + numBuckets + " size " + size); // line for better understanding
        ArrayList<HashmapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2 * numBuckets; i++) {
            buckets.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for (int i = 0; i < temp.size(); i++) {
            HashmapNode<K, V> head = temp.get(i);
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }
}