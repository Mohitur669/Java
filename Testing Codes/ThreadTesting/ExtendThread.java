package ThreadTesting;

class NewThread extends Thread {
    NewThread() {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
        start();
    }

    //    This is an override method
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}


/*
Code Explanation:

Sure! Let's go through the code and explain the output step by step:
1. The code defines a class called `NewThread`, which extends the `Thread` class. It overrides the `run()` method to specify the task that the thread will execute.

2. In the constructor of `NewThread`, the `super("Demo Thread")` call invokes the constructor of the `Thread` class with the name "Demo Thread". This sets the name of the thread.

3. `System.out.println("Child Thread: " + this);` prints information about the child thread (`this`), including the thread name, thread ID, and thread group.

4. `start();` starts the child thread. This invokes the `run()` method of the `NewThread` class.

5. The `run()` method of `NewThread` contains a `for` loop that counts down from 5 to 1.

6. Inside the loop, `System.out.println("Child Thread: " + i);` prints the current value of `i` for the child thread.

7. `Thread.sleep(500);` causes the child thread to pause for 500 milliseconds (0.5 seconds) in each iteration of the loop.

8. If the child thread is interrupted during its sleep by an `InterruptedException`, it prints "Child Interrupted".

9. After the loop completes, it prints "Exiting Child Thread".

10. The `ExtendThread` class defines the `main` method, which serves as the entry point for the program.

11. `new NewThread();` creates a new instance of `NewThread`, invoking its constructor. This starts the child thread.

12. The `main` method also contains a `for` loop that counts down from 5 to 1.

13. Inside the loop, `System.out.println("Main Thread: " + i);` prints the current value of `i` for the main thread.

14. `Thread.sleep(1000);` causes the main thread to pause for 1000 milliseconds (1 second) in each iteration of the loop.

15. If the main thread is interrupted during its sleep by an `InterruptedException`, it prints "Main Thread Interrupted".

16. After the loop completes, it prints "Main Thread Exiting".

    Now, let's analyze the output:

    - The first line of the output shows information about the child thread (`Thread[#22,Demo Thread,5,main]`).

    - The subsequent lines show the countdown from 5 to 1 for both the child thread and the main thread. The child thread prints "Child Thread: i" for each iteration, and the main thread prints "Main Thread: i" for each iteration.

    - As the child thread's loop completes, it prints "Exiting Child Thread".

    - Finally, the main thread continues its countdown from 2 to 1 and then prints "Main Thread Exiting".

In summary, the output demonstrates that the child thread and the main thread run concurrently, with the child thread
 performing its own countdown while the main thread performs its own countdown. */