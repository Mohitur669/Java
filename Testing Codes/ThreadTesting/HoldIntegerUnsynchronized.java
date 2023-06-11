package ThreadTesting;

public class HoldIntegerUnsynchronized {
    private int sharedInt = -1;

    //    This is the unsynchronized
    public void setSharedInt(int val) {
        System.out.println(Thread.currentThread().getName() + " setting sharedInt to " + val);
        sharedInt = val;
    }

    //    This is also unsynchronized
    public int getSharedInt() {
        System.out.println(Thread.currentThread().getName() + " retrieving sharedInt value " + sharedInt);
        return sharedInt;
    }
}