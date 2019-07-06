package linkedlist.circularlinkedlist;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

/******
 * Parveen Dala
 * Circular LinkedList, Data Structure
 */
public class CircularLinkedList {

    private Node tail;

    public void traverse() {
        if (tail == null) {
            System.out.println("Empty List");
            return;
        }
        Node current = tail.next;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != tail.next);

        System.out.println();
    }


    public void insert(int value) {
        Node node = new Node(value);
        if (tail == null) {
            tail = node;
            node.next = tail;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
        traverse();
    }

    public void insert(int value, int position) {
        Node node = new Node(value);

        if (tail == null) {
            tail = node;
            node.next = tail;
        } else if (position <= 0) {
            node.next = tail.next;
            tail.next = node;
        } else {
            Node current = tail.next;
            int counter = 0;

            while (current.next != tail.next && counter < position - 1) {
                current = current.next;
                counter++;
            }

            node.next = current.next;
            current.next = node;
            if (current == tail)
                tail = node;

        }
        traverse();
    }


    public void delete(int value) {
        if (tail == null) {
            System.out.println("Unable to delete - Empty list");
            return;
        }

        Node current = tail.next;
        Node previous = tail;
        do {
            if (current.value == value) {
                if (current == previous)
                    tail = null;
                previous.next = current.next;
                if (current == tail)
                    tail = previous;
                break;
            }
            previous = current;
            current = current.next;
        } while (current != tail.next);
        traverse();
    }

    public void deleteAtPosition(int position) {
        if (tail == null) {
            System.out.println("Unable to delete - Empty list");
            return;
        }
        if (tail.next == tail) {
            tail = null;
        } else if (position <= 0) {
            tail.next = tail.next.next;
        } else {
            Node current = tail.next;
            Node previous = tail;
            int counter = 0;
            while (current.next != tail.next && counter < position) {
                previous = current;
                current = current.next;
                counter++;
            }
            previous.next = current.next;
        }
        traverse();
    }

    public void reverse() {
        if (tail == null) {
            System.out.println("Empty List");
            return;
        }
        if (tail.next != tail) {
            Node current = tail.next;
            Node previous = tail;
            Node next = null;
            do {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            } while (previous != tail);
            tail = current;
        }
        traverse();
    }
}
