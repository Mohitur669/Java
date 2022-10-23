import java.util.LinkedList;

public class linkedListJavaCollections {
    public static void main(String[] args) {
        // Using Java Collection Framework
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(30);
        list.set(2,100);

        System.out.println(list);
    }
}