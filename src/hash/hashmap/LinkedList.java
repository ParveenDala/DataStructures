package hash.hashmap;

public class LinkedList {
    private Node head;

    public LinkedList() {
    }

    public void insert(int key, int value) {
        System.out.println("\nInsert " + key + " : " + value);
        Node node = new Node(key, value);
        if (head == null)
            head = node;
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        traverse();
    }

    public void delete(int key) {
        System.out.println("\nDelete " + key);
        if (head == null)
            return;
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.key == key) {
                if (previous == null)
                    head = null;
                else
                    previous.next = current.next;
                System.out.println("Deleted " + key);
                traverse();
                return;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Not Found " + key);
        traverse();
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print("(" + current.key + " : " + current.value + ") > ");
            current = current.next;
        }
        System.out.println();
    }

}

class Node {
    int key;
    int value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
