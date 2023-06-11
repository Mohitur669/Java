package ThreadTesting;

// Show multiple threads modifying shared object
public class SharedCell {
    public static void main(String[] args) {
        HoldIntegerUnsynchronized h = new HoldIntegerUnsynchronized();
        HoldIntegerSynchronized h2 = new HoldIntegerSynchronized();
        ProduceInteger p = new ProduceInteger(h2);
        ConsumeInteger c = new ConsumeInteger(h2);

        p.start();
        c.start();
//      Every time the result will different
    }
}