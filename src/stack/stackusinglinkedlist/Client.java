package stack.stackusinglinkedlist;

public class Client {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.traverse();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        System.out.println("Peeked " + stack.peek());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        stack.traverse();
    }
}
