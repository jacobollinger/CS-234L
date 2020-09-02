class ReversibleArrayQueue<T> {
    private T[] arr;
    private int head;
    private int tail;
    private boolean reversed;

    @SuppressWarnings("unchecked")
    public ReversibleArrayQueue(int capacity) {
        arr = (T[]) new Object[capacity + 1];
        head = 0;
        tail = 0;
        reversed = false;
    }

    public void reverse() {
        //TODO
        reversed = reversed ? false : true;
        int temp = head;
        head = tail;
        tail = temp;
    }

    public void enqueue(T value) {
        //TODO
        arr[tail] = value;
        if (reversed) {
            // tail = (tail - 1);
        } else {
            tail = (tail + 1) % arr.length;
        }
    }

    public T dequeue() {
        //TODO
        T value = arr[head];
        if (reversed) {
            // head = (head - 1);
        } else {
            head = (head + 1) % arr.length;
        }
        return value;
    }
}
