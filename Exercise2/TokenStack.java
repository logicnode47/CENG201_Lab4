/**
 * Name Surname: Furkan Bozkurt
 * Date: 01.11.2026
 */
package Exercise2;

public class TokenStack {
    private class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    public TokenStack() {
        top = null;
    }

    // Add a new item to the top
    public void push(String value) {

        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    // Remove and return the top item
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next;
        return value;
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
