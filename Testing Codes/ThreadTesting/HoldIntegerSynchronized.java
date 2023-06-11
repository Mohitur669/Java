package ThreadTesting;

// Uses thread synchronization to ensure that only one thread at a time
// Thread access sharedInt at proper times
public class HoldIntegerSynchronized {
    private int sharedInt = -1;
    private boolean writeable = true;

    public synchronized void setSharedInt(int val) {
        /* if writable is true, write to the buffer, toggle writable and notify any waiting threads (so they may read
          from the buffer */
        while (!writeable) { // Not the producer's turn
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " setting sharedInt to " + val);
        sharedInt = val;
        writeable = false;
        notify(); // tell to a waiting thread to wake up
    }

    public synchronized int getSharedInt() {
        while (writeable) { // Not the consumer's turn
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        writeable = true;
        notify(); // tell to a waiting thread to wake up / become ready
        System.out.println(Thread.currentThread().getName() + " retrieving sharedInt value " + sharedInt);
        return sharedInt;
    }
}