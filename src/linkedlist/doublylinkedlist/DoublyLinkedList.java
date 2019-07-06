package linkedlist.doublylinkedlist;

class Node {
    int value;
    Node previous;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

/******
 * Parveen Dala
 * Doubly LinkedList, Data Structure
 */
public class DoublyLinkedList {
    private Node head;

    public void traverse() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
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
            node.previous = current;
        }
        traverse();
    }

    public void insert(int value, int position) {
        Node node = new Node(value);
        //Insert if position is 0 or less than 0
        if (position <= 0 || head == null) {
            node.next = head;
            if (head != null)
                head.previous = node;
            head = node;
        } else {
            Node current = head;
            int counter = 0;
            while (current.next != null && counter < position - 1) {
                current = current.next;
                counter++;
            }

            node.next = current.next;
            node.previous = current;
            current.next = node;
            if (node.next != null)
                node.next.previous = node;
        }
        traverse();
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    if (current.previous == null) {
                        head = head.next;
                    } else {
                        current.previous.next = current.next;
                    }

                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                    break;
                }
                current = current.next;
            }
            traverse();
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Unable To Delete, Empty List");
            return;
        }
        if (position == 0) {
            head = head.next;
            if (head != null)
                head.previous = null;
        } else {
            Node current = head;
            int counter = 0;

            while (current.next != null && counter < position) {
                current = current.next;
                counter++;
            }

            current.previous.next = current.next;
            if (current.next != null)
                current.next.previous = current.previous;


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
            System.out.println("Reverse - Empty List");
        } else {
            Node current = head;
            Node temp = current.next;
            while (temp != null) {
                temp = current.next;
                current.next = current.previous;
                current.previous = temp;
                head = current;
                current = temp;
            }
            traverse();
        }
    }
}