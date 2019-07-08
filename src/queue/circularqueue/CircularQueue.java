package queue.circularqueue;

/******
 * Parveen Dala
 * Circular Queue using Array, Data Structure
 */
public class CircularQueue {
    int[] queue;
    int start;
    int end;


    public CircularQueue(int size) {
        queue = new int[size];
        start = end = -1;
    }

    public boolean isFull() {
        return ((end == queue.length - 1 && start == 0) || end + 1 == start);
    }

    public boolean isEmpty() {
        return start == -1;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {

            for (int i = 0; i < queue.length; i++) {
                System.out.print(queue[i] + "  ");
            }
            System.out.println();
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow, Unable to enqueue " + value);
            return;
        }
        if (start == -1) {
            start = 0;
        }
        if (end + 1 == queue.length)
            end = 0;
        else
            end++;
        queue[end] = value;
        System.out.println("EnQueued " + value);
        traverse();
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow, Unable to dequeue");
            return -1;
        }

        int value = queue[start];
        queue[start] = -1;

        if (start == end) {
            start = end = -1;
        } else if (start + 1 == queue.length)
            start = 0;
        else
            start++;
        System.out.println("DeQueued " + value);
        traverse();
        return value;
    }
}