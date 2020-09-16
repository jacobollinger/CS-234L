class Node<T> {
    T value;
    Node next;
    Node previous;

    public Node(T value) {
        this.value = value;
    }
}

class LinkedList<T> {
    private Node start;
    private Node end;

    public LinkedList() {
        // set start and end to null
    }

    public void addToEmpty(T value) {
        Node x = new Node(value);
        start = x;
        end = x;
    }

    public void appendValue(T value) {
        Node x = new Node(value);
        x.previous = end;
        end.next = x;
        end = x;
    }

    public void prependValue(T value) {
        Node x = new Node(value);
        x.next = start;
        start.previous = x;
        start = x;
    }

    // insert node before node y
    public void insert(Node y, T value) {
        Node x = new Node(value);
        // x.previous = y.previous;
        // x.previous.next = x;
        // y.previous = x;
        // x.next = y;

        // or
        y.previous.next = x;
        x.previous = y.previous;
        x.next = y;
        y.previous = x;
    }

    public void delete() {
        //TODO Friday Lect
    }

    public void printLinkedList() {
        for(Node x = start; x != null; x = x.next) {
            System.out.println(x.value + " ");
        }
    }
}

class Lect09162020 {
    // each value is stored seperately in its own class node
    // each node contains the value and a reference to the next node
    // last node points to null
}
