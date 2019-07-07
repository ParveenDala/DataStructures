package stack.stackusinglinkedlist;

/******
 * Parveen Dala
 * Stack using Array, Data Structure
 */
public class StackUsingLinkedList {
    Node head;

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
        System.out.println();
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        traverse();
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow, Unable to pop item");
            return -1;
        } else {
            int value = head.value;
            head = head.next;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow, Unable to peek item");
            return -1;
        } else {
            return head.value;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}
