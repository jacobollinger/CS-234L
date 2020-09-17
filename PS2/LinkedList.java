class LinkedList<T> {
    class Node {
        T value;
        Node previous, next; // previous and next are initialized to null.

        Node(T value) {
            this.value = value;
        }
    }

    Node start, end; // start and end are initialized to null.

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for (Node x = start; x != null; x = x.next) {
            builder.append(x.value + " ");
        }
        builder.append("]");
        return builder.toString();
    }

    // Append a new value to this list.
    void append(T value) {
        Node newNode = new Node(value);
        if (start == null) // This list is empty.
        {
            start = newNode;
            end = newNode;
        } else // This list is nonempty.
        {
            newNode.previous = end;
            end.next = newNode;
            end = newNode;
        }
    }

    // Let x be node in this list.
    // Insert a new value before node x.
    void insert(T value, Node x) {
        Node newNode = new Node(value);
        if (x == start) // Insert at the start.
        {
            newNode.next = start;
            start.previous = newNode;
            start = newNode;
        } else // Insert in the middle.
        {
            newNode.next = x;
            newNode.previous = x.previous;
            x.previous.next = newNode;
            x.previous = newNode;
        }
    }

    // Let x be node in this list.
    // Delete x from this list.
    void delete(Node x) {
        if (x == start && x == end) // x is the only node in this list.
        {
            start = null;
            end = null;
        } else if (x == start) // x is the first node.
        {
            start = start.next;
            start.previous = null;
        } else if (x == end) // x is the last node.
        {
            end = end.previous;
            end.next = null;
        } else // x is a node in the middle.
        {
            x.previous.next = x.next;
            x.next.previous = x.previous;
        }
    }

    // Delete all values from this list.
    void clear() {
        start = null;
        end = null;
    }

    // Determine if this list is empty.
    boolean empty() {
        return start == null;
    }

    // question 1
    // Append list0 to this list.
    // Clear list0.
    void append(LinkedList<T> list0) {
        end.next = list0.start;
        list0.start.previous = end;
    }

    // question 2
    // Let x be node in this list.
    // Insert list0 in this list before node x.
    // Clear list0.
    void insert(LinkedList<T> list0, Node x) {
    }

    // question 3
    // Let x and y be two distinct nodes in this list such that y is subsequent to
    // x.
    // Delete the sublist starting at x and ending at y.
    void delete(Node x, Node y) {
    }

    // question 4
    // Reverse the order of the elements in this list.
    void reverse() {
    }
}
