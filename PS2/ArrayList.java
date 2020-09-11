class ArrayList<T> {
    private T[] arr;
    private int top;

    private static final int MIN_CAP = 4; // MIN_CAP is intentionally set to a small value for testing.

    @SuppressWarnings("unchecked")
    public ArrayList() {
        arr = (T[]) new Object[MIN_CAP];
        top = 0;
    }

    @SuppressWarnings("unchecked")
    private void changeCapacity(int capacity) {
        T[] newArr = (T[]) new Object[capacity];
        for (int i = 0; i < top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(T value) {
        if (top == arr.length) {
            changeCapacity(arr.length * 2);
        }
        arr[top] = value;
        top = top + 1;
    }

    public void add(T value, int index) {
        if (top == arr.length) {
            changeCapacity(arr.length * 2);
        }
        for (int i = top; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        top = top + 1;
    }

    public void add(ArrayList<T> list0) {
        // Question 1 in the problem set.
        // Append list0 at the end of this list.
        if (this.arr.length < this.top + list0.top) {
            this.changeCapacity(Math.max(this.arr.length * 2, this.top + list0.top));
            // this.changeCapacity((this.top + list.top) * 2);
        }
        for (int i = this.top; i < this.top + list0.top; i++) {
            this.arr[i] = list0.arr[i - top];
        }
        this.top += list0.top;
    }

    public void add(ArrayList<T> list0, int index) {
        // Question 2 in the problem set.
        // Insert list0 in this list at a given index.
        // We assume 0 <= index < top.
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[ ");
        for (int i = 0; i < top - 1; i++) {
            s.append(arr[i] + ", ");
        }
        s.append(arr[top - 1] + " ]");
        return s.toString();
    }
}