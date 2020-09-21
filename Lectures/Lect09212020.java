class LinkedStack<T> {
    private LinkedList<T> list;

    public LinkedStack() {
        list = new LinkedList<T>();
    }

    public void push(T value) {
        list.append(value);
    }

    public T pop() {
        T value = list.end.value;
        list.delete(list.end);
        return value;
    }
}

class LinkedQueue<T> {
    private LinkedList<T> list;
    
    public LinkedQueue() {
        list = new LinkedList<T>();
    }
    
    public void enqueue(T value) {
        list.append(value);
    }
    
    public T dequeue() {
        T value = list.start.value;
        list.delete(list.start);
        return value;
    }
}

class LinkedSequence<T>{
    private LinkedList<T> list;

    public LinkedSequence() {
        list = new LinkedList<T>();
    }

    public void add(T value) {
        list.append(value);
    }

    private LinkedList<T>.Node getNode(int index) {
        LinkedList<T>.Node x = list.start;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(T value, int index) {
        list.insert(value, getNode(index));
    }

    public void remove(int index) {
        list.delete(getNode(index));
    }

    public void set(T value, int index) {
        getNode(index).value = value;
    }


}