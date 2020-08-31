class ArrayStack<T> {
    private T[] arr;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        arr = (T[]) new Object[capacity];
        top = 0;
    }

    public boolean empty() {
        return top == 0;
    }

    public void push(T value) {
        arr[top] = value;
        top = top + 1;
    }

    public T pop() {
        top = top - 1;
        return arr[top];
    }
}