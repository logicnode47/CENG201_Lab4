/**
 * Name Surname: Furkan Bozkurt
 * Date: 01.11.2026
 */
package Exercise1;

public class BracketStack {
    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    public BracketStack() {
        top = null;
    }
    // Add a new element to the top
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    // Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char value = top.data;
        top = top.next;

        return value;
    }
    // Return the top element
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
