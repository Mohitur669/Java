import java.util.StringTokenizer;

// This program will not compile.
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner {
        static int y = 10; // y is local to Inner

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }

    }

    void showy() {
        System.out.println(Inner.y);
    }
}

public class test3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is khan", "e");
//        while (st.hasMoreTokens()) {
        System.out.print(st.nextToken());
//        }
    }
}