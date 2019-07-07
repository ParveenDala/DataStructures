package queue;

/******
 * Parveen Dala
 * Queue using Array, Data Structure
 */
public class QueueUsingArray {
    int[] queue;
    int start, end;

    public QueueUsingArray(int size) {
        queue = new int[size];
        start = end = -1;
    }

    public boolean isEmpty() {
        return start == -1 || start == queue.length;
    }

    public boolean isFull() {
        return end == queue.length - 1;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow, Unable to enqueue " + value);
            return;
        }
        if (isEmpty())
            start = 0;
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
        start++;
        if (start > end) {
            start = end = -1;
        }
        System.out.println("DeQueued " + value);
        traverse();
        return value;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.print(queue[i] + "  ");
            }
            System.out.println();
        }
    }
}
