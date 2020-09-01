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
        //TODO
        // int temp = head;
        // head = tail;
        // tail = temp;
    }

    public void enqueue(T value) {
        //TODO
        // arr[tail] = value;
        // tail = (tail + 1) % arr.length;
    }

    public T dequeue() {
        return null;
    }
}
