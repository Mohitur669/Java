/*
You need to implement a Stack class using two queues as its data members.
Only 2 data members should be there inside the class - two queues,
which should be created dynamically and both should be public. Use the inbuilt queue.

Implement the following public functions :
1. Constructor -
Initialises both the data members.

2. push :
This function should take one argument of type T and has return type void.
This function should insert an element in the stack. Time complexity should be O(1).

3. pop :
This function takes no input arguments and has return type T.
This should remove the last element which is entered and return that element as an answer.

4. top :
This function takes no input arguments and has return type T.
This should return the last element which is entered and return that element as an answer.

5. getSize :
Return the size of stack i.e. count of elements which are present ins stack right now. Time complexity should be O(1).
*/

import java.util.*;

public class QueueUsing2StacksUse {
    public static void main(String[] args) {
        QueueUsing2Stacks<Integer> s = new QueueUsing2Stacks<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        int input;

        while (true) {

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input = sc.nextInt();
                    s.push(input);
                    break;
                case 2:

                    Integer ele = s.pop();

                    if (ele != null) {
                        System.out.println(ele);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    Integer elem = s.top();
                    if (elem != null) {
                        System.out.println(elem);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 4:
                    System.out.println(s.getSize());
                    break;
                case 5: // Test
                    Queue<Integer> q = s.getQueue();
                    while (!q.isEmpty()) {
                        Integer e = q.peek();
                        q.remove();
                        System.out.print(e + " ");
                    }
                    System.out.println();
                    return;
                default:
                    return;
            }
        }
    }
}