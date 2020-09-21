class LinkedList<T> {
    class Node {
        T value;
        Node next, previous;
        Node(T value) {
            this.value = value;
        }
    }

    Node start, end;

    boolean empty() {
        return start == null;
    }

    public void append(T value) {
        Node newNode = new Node(value);
        if (empty()) {
            start = newNode;
            end = newNode;
        } else {
            newNode.previous = end;
            end.next = newNode;
            end = newNode;
        }
    }

    public void insert(T value, Node x) { // * insert before x
        Node newNode = new Node(value);
        if (x == start) {
            newNode.next = start;
            start.previous = newNode;
            start = newNode;
        } else {
            newNode.next = x;
            newNode.previous = x.previous;
            x.previous.next = newNode;
            x.previous = newNode;
        }
    }

    public void delete(Node x) {
        if (x == start && x == end) {
            start = null;
            end = null;
        } else if (x == start) {
            start = start.next;
            start.previous = null;
        } else if (x == end) {
            end = end.previous;
            end.next = null;
        } else {
            x.previous.next = x.next;
            x.next.previous = x.previous;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for(Node x = start; x != null; x = x.next) {
            builder.append(x.value + " ");
        }
        builder.append("]");
        return builder.toString();
    }
}

class Lect09162020 {
    // each value is stored separately in its own class node
    // each node contains the value and a reference to the next node
    // last node points to null
}
