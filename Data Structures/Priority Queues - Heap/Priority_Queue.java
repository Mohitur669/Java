/* This is Min-Priority Queue */

import java.util.ArrayList;

public class Priority_Queue {
    private ArrayList<Integer> heap;

    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (heap.isEmpty()) {
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    // Inserting element to heap
    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() throws PriorityQueueException {
        // Throw the exception PriorityQueueException if queue is empty
        if (isEmpty()) {
            throw new PriorityQueueException();
        }

        int minElement = getMin();
        //Set the last priority element as the new root
        heap.set(0, heap.get(heap.size() - 1));
        //Remove the last priority element
        heap.remove(heap.size() - 1);
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1, rightChildIndex = 2 * parentIndex + 2;
        while (leftChildIndex < heap.size()) {
            int minIndex = parentIndex;

            if (heap.get(minIndex) > heap.get(leftChildIndex)) {
                minIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size()) {
                if (heap.get(minIndex) > heap.get(rightChildIndex)) {
                    minIndex = rightChildIndex;
                }
            }


            if (minIndex == parentIndex) {
                return minElement;
            }

            int temp = heap.get(parentIndex);
            heap.set(parentIndex, heap.get(minIndex));
            heap.set(minIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
        return minElement;
    }
}