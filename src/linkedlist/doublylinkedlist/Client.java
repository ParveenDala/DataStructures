package linkedlist.doublylinkedlist;

public class Client {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.traverse();
        doublyLinkedList.insert(5, 0);
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(15);
        doublyLinkedList.insert(20);
        doublyLinkedList.delete(5);
        doublyLinkedList.delete(10);
        System.out.println("Doubly Insert At Position");
        doublyLinkedList.insert(5, 0);
        doublyLinkedList.insert(10, 1);
        doublyLinkedList.insert(30, 3);
        doublyLinkedList.reverse();
        doublyLinkedList.reverse();
        doublyLinkedList.search(10);
        doublyLinkedList.search(15);
        doublyLinkedList.search(5);
        doublyLinkedList.search(30);
        doublyLinkedList.search(20);
        doublyLinkedList.search(233);
        doublyLinkedList.deleteAtPosition(1);
        doublyLinkedList.reverse();

    }


}
