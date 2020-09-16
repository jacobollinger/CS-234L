class LinkedList<T> {
    private Node<T> start;
    private Node<T> end;

    public LinkedList() {}

    public void addToEmptyLinkedList(T value) {
        Node<T> x = new Node<T>(value);
        start = x;
        end = x;
    }

    public void appendValue(T value) {
        Node<T> x = new Node<T>(value);
        x.previous = end;
        end.next = x;
        end = x;
    }

    public void prependValue(T value) {
        Node<T> x = new Node<T>(value);
        x.next = start;
        start.previous = x;
        start = x;
    }

    // insert node before node y
    public void insertValue(Node<T> y, T value) {
        Node<T> x = new Node<T>(value);
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

    public void delete(T value) {
        //TODO Friday Lect
        for (Node<T> x = start; x!= null; x = x.next) {
            if (x.value == value) {
                x.previous.next = x.next;
                x.next.previous = x.previous;
                break;
            }
        }
    }

    public void printLinkedList() {
        for(Node<T> x = start; x != null; x = x.next) {
            System.out.println(x.value + " ");
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for(Node<T> x = start; x != null; x = x.next) {
            builder.append(x.value + " ");
        }
        builder.append("]");
        return builder.toString();
    }
}