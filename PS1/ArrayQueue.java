class ArrayQueue<T> {
    private T[] arr;
    private int head;
    private int tail;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        arr = (T[]) new Object[capacity + 1];
        head = 0;
        tail = 0;
    }

    public boolean empty() {
        return head == tail;
    }

    public boolean full() {
        return head == (tail + 1) % arr.length;
    }

    public void enqueue(T value) {
        arr[tail] = value;
        tail = (tail + 1) % arr.length;
    }

    public T dequeue() {
        T value = arr[head];
        head = (head + 1) % arr.length;
        return value;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for (int i = head; i != tail; i = (i + 1) % arr.length) {
            builder.append(arr[i] + " ");
        }
        builder.append("]");
        return builder.toString();
    }

    public ArrayQueue<T> copy() {
        ArrayQueue<T> q = new ArrayQueue<T>(0);
        q.arr = this.arr;
        q.head = this.head;
        q.tail = this.tail;
        return q;
    }

    @SuppressWarnings("unchecked")
    public void enhancedEnqueue(T value) {
        if(this.full()) {
            // ArrayQueue<T> q = new ArrayQueue<T>(this.arr.length * 2);
            // q = this.copy();
            ArrayQueue<T> q = this.copy();
            arr = (T[]) new Object[this.arr.length];
        }
        enqueue(value);

        
    }
}