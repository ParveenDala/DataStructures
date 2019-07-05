package linkedlist;

/******
 * Parveen Dala
 * LinkedList, Data Structure
 */
public class Client {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.traverse();
        linkedList.delete(5);
        linkedList.deleteAtPosition(0);
        linkedList.deleteAtPosition(5);
        linkedList.deleteAtPosition(20);
        linkedList.insert(5, 0);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(20);
        linkedList.insert(25);
        linkedList.insert(8, 4);
        linkedList.search(5);
        linkedList.search(10);
        linkedList.search(8);
        linkedList.search(80);
        linkedList.traverse();
        linkedList.reverse();
        linkedList.reverse();
        linkedList.deleteAtPosition(10);
    }
}
