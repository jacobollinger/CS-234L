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
        // 5 8 2 7       7 2 8 5
        // h       t     h       t
        reversed = !reversed;
        int temp = reversed ? head - 1 : head + 1;
        head = reversed ? tail - 1 : tail + 1;
        tail = temp < 0 ? arr.length - 1 : temp;
    }

    public void enqueue(T value) {
        arr[tail] = value;
        if (reversed) {
            tail = tail != 0 ? tail - 1 : arr.length - 1;
        } else {
            tail = (tail + 1) % arr.length;
        }
    }

    public T dequeue() {
        T value = arr[head];
        if (reversed) {
            head = head != 0 ? head - 1 : arr.length - 1;
        } else {
            head = (head + 1) % arr.length;
        }
        return value;
    }
}
