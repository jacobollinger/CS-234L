class ReversibleArrayQueue<T> {
    private T[] arr;
    private int head;
    private int tail;

    @SuppressWarnings("unchecked")
    public ReversibleArrayQueue(int capacity) {
        arr = (T[]) new Object[capacity + 1];
        head = 0;
        tail = 0;
    }

    public void reverse() {
    }

    public void enqueue(T value) {
    }

    public T dequeue() {
        return null;
    }
}
