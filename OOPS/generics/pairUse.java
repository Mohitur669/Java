package generics;

public class pairUse {
    public static void main(String[] args) {
//        pair<Integer> p = new pair<>(1, 2);
//        pair<String> str = new pair<>("Mohitur", "Rahaman");
//        p.setFirst(10);
//        System.out.println(p.getFirst());
        pair<Integer, String> p1 = new pair<>(124, "Mohitur");
        pair<String, String> p2 = new pair<>("My", "Name");
        p1.setFirst(23);
        p1.setSecond("Rahaman");
        System.out.println(p1.getSecond());

        // storing a generic class inside a generic class (Chained Generic Pairs)
        pair<Integer, Integer> internalPair = new pair<>(10, 20);
        pair<pair<Integer, Integer>, String> p3 = new pair<>(internalPair, "Generic Class");
        System.out.println(p3.getSecond());
        System.out.println(p3.getFirst().getFirst());
        System.out.println(p3.getFirst().getSecond());
    }
}