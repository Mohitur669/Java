package ThreadTesting;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        Thread k = Thread.currentThread();
        System.out.println("Current Thread: " + k + t);

        t.setName("My Thread");
        System.out.println("my Thread" + t);
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            k.sleep(500);
        }
    }
}


/* Certainly! Let's break down the code and explain its functionality step by step:

1. The main method is the entry point for the Java program. It takes an array of strings (`args`) as a parameter.

2. `Thread t = new Thread();` creates a new thread object `t` using the default constructor of the `Thread` class. This thread doesn't have any associated tasks yet.

3. `Thread k = Thread.currentThread();` assigns the currently executing thread (main thread) to the variable `k` using the `currentThread()` method of the `Thread` class.

4. `System.out.println("Current Thread: " + k + t);` prints the information about the current thread. The output includes the thread name, thread ID, and thread group.

5. `t.setName("My Thread");` sets the name of the `t` thread to "My Thread" using the `setName()` method.

6. `System.out.println("my Thread" + t);` prints the information about the `t` thread. The output includes the thread name, thread ID, and thread group.

7. The following `for` loop is used to count down from 5 to 1.

8. `System.out.println(i);` prints the current value of `i`.

9. `k.sleep(500);` pauses the execution of the main thread (current thread) for 500 milliseconds (0.5 seconds) using the `sleep()` method. This causes a delay between each iteration of the loop.

10. After the loop completes, the program terminates.

    The output you provided shows the following:

        - The first line shows the information about the current thread (`k`) and the newly created thread (`t`).

        - The second line shows the information about the `t` thread after setting its name to "My Thread".

        - The subsequent lines show the countdown from 5 to 1, with a 0.5-second delay between each iteration.

Overall, this program demonstrates basic thread creation, manipulation, and usage in Java. */