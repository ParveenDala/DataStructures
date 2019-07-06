package linkedlist.circularlinkedlist;

public class Client {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.traverse();
        circularLinkedList.reverse();
        circularLinkedList.insert(5, 5);
        circularLinkedList.reverse();
        circularLinkedList.insert(10, 0);
        circularLinkedList.reverse();
        circularLinkedList.deleteAtPosition(0);
        circularLinkedList.insert(15, 50);
        circularLinkedList.insert(20);
        circularLinkedList.insert(25, 12);
        circularLinkedList.insert(30, 12);
        circularLinkedList.deleteAtPosition(2);
        circularLinkedList.reverse();
        circularLinkedList.reverse();

    }
}
