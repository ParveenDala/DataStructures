package stack;

/******
 * Parveen Dala
 * Stack using Array, Data Structure
 */
public class StackUsingArray {
    int[] stack;
    int top;

    public StackUsingArray(int size) {
        stack = new int[size];
        top = -1;
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow, Unable to push " + value);
            return false;
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value);
            return true;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow, Unable to pop item");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow, Unable to peek item");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}