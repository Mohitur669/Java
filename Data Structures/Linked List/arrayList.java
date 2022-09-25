import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // default capacity of arrayList is 10
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        // setting a arraylist with capacity of 5 (by default is 10)
        ArrayList<Integer> list2 = new ArrayList<>(5);

        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(2, 50);
//        System.out.println(list1.size());
//        System.out.println(list1.get(2));
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        // for each loop does not move through indices, it moves through directly to the elements
        for (int element : list1) {
            System.out.print(element + " ");
        }
//        System.out.println();
//        list1.remove(1);
//        list1.set(1,100);
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "apple" );
        list.add( "banana" );
        list.add( "carrot" );
        list.add( 0, "mango" );
        System.out.println(list.get(2));
    }
}