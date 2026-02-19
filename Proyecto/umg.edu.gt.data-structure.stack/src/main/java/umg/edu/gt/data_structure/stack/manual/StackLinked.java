package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

    private Node top;
    private int count;

    public boolean isEmpty() {
        return top == null;
    }

   

    public void push(char value) {
        top = new Node(value, top);
        count++;
    }

    public char pop() {
        if (isEmpty()) return '\0';
        char value = top.value;
        top = top.next;
        count--;
        return value;
    }

    public char peek() {
        if (isEmpty()) return '\0';
        return top.value;
    }

    public int size() { return count; }
    public int getSize() { return count; }
    public int getCount() { return count; }
    public int length() { return count; }

    public Node getNodeInit() {
        if (isEmpty()) return null;
        Node current = top;
        while (current.next != null) current = current.next;
        return current;
    }
}