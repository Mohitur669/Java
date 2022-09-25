package generics;

/*
With printArray generic function I can easily change it input type and get the work done.
If we didn't use the generic function then we had to create two function one printing for int array and one printing String array
 */


public class genericMethods {
    // for generic bound, for interface or for class we write "extends" only
    public static <T extends printInterface> void printArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }
        String[] s = new String[10];
        for (int i = 0; i < 10; i++) {
            s[i] = "abc";
        }
//        printArray(a);
//        printArray(s);

//        Vehicle v[] = new Vehicle[10];
//        for (int i = 0; i < 10; i++) {
//            v[i] =
//        }
        student[] s1 = new student[10];
        for (int i = 0; i < 10; i++) {
            s1[i] = new student();
        }
        printArray(s1);
    }
}