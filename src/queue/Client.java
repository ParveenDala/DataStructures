package queue;

public class Client {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.traverse();
        queue.deQueue();
        queue.enQueue(5);
        queue.enQueue(10);
        queue.enQueue(15);
        queue.enQueue(20);
        queue.deQueue();
        queue.enQueue(25);
        queue.enQueue(30);
        queue.enQueue(35);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
    }
}
