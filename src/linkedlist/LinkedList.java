package linkedlist;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}


/******
 * Parveen Dala
 * LinkedList, Data Structure
 */
public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        traverse();
    }

    public void insert(int value, int position) {
        Node node = new Node(value);
        if (position <= 0 || head == null) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            int counter = 0;
            while (current.next != null && counter < position - 1) {
                current = current.next;
                counter++;
            }
            node.next = current.next;
            current.next = node;
        }
        traverse();
    }

    public void delete(int value) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.value == value) {
                if (previous == null)
                    head = current.next;
                else
                    previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }
        traverse();
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Empty List, Unable to delete.");
            return;
        }
        if (position <= 0) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;
            int counter = 0;
            while (current.next != null && counter < position) {
                previous = current;
                current = current.next;
                counter++;
            }
            if (previous == null)
                head = current.next;
            else
                previous.next = current.next;
        }
        traverse();
    }

    public void search(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                System.out.println("Found " + value);
                return;
            }
            current = current.next;
        }
        System.out.println("Not Found " + value);
    }

    public void reverse() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        traverse();
    }
}
