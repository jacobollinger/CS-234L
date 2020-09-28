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

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        int i;
        for (i = 0; i < top; i++) {
            builder.append(arr[i] + " ");
        }
        for (i = top; i < arr.length; i++) {
            builder.append("_ ");
        }
        builder.append("]");
        return builder.toString();
    }

    public void add(T value) {
        if (top == arr.length) {
            changeCapacity(arr.length * 2);
        }
        arr[top] = value;
        top++;
    }

    public void add(T value, int index) {
        if (top == arr.length) {
            changeCapacity(arr.length * 2);
        }
        for (int i = top; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        top++;
    }

    // question 1
    // Append list0 to this list.
    public void add(ArrayList<T> list0) {
        if (this.arr.length < this.top + list0.top) {
            this.changeCapacity(Math.max(this.arr.length * 2, this.top + list0.top));
        }
        for (int i = this.top; i < this.top + list0.top; i++) {
            this.arr[i] = list0.arr[i - top];
        }
        this.top += list0.top;
    }

    // question 2
    // Insert list0 in this list at a given index.
    // We assume 0 <= index < top.
    public void add(ArrayList<T> list0, int index) {
        if (this.arr.length < this.top + list0.top) {
            this.changeCapacity(Math.max(this.arr.length * 2, this.top + list0.top));
        }
        for (int i = this.top - 1; i >= index; i--) {
            this.arr[i + list0.top] = this.arr[i];
        }
        for (int i = index; i < list0.top + index; i++) {
            this.arr[i] = list0.arr[i - index];
        }
        this.top += list0.top;
    }

    public void remove(int index) {
        top--;
        for (int i = index; i < top; i++) {
            arr[i] = arr[i + 1];
        }
        if (top < arr.length / 4 && MIN_CAP <= arr.length / 2) {
            changeCapacity(arr.length / 2);
        }
    }

    // question 3
    // Remove all elements arr[i], with i1 <= i < i2.
    // We assume 0 <= i1 < i2 <= top.
    public void remove(int i1, int i2) {
        int temp = 0;
        for (int i = 0; i < top - i2; i++) {
            arr[i1 + i] = arr[i + i2];
        }
        top -= i2 - i1;
        while (top < (arr.length / (temp + 1)) / 4 && MIN_CAP <= (arr.length / (temp + 1)) / 2) {
            temp++;
        }
        if (temp != 0) {
            changeCapacity(arr.length / (temp * 2));
        }
    }

    // question 4
    // Remove all elements with a given value.
    void removeValue(T value) {
        int offset = 0;
        for (int i = 0; i < top; i++) {
            if (arr[i] != value) {
                arr[i - offset] = arr[i];
            } else {
                offset++;
            }
        }
        top -= offset;
    }
}