class ArrayList<T>
{
    private T[] arr;
    private int top;

    private static final int MIN_CAP = 4; // MIN_CAP is intentionally set to a small value for testing.

    @SuppressWarnings("unchecked")
    public ArrayList()
    {
        arr = (T[]) new Object[MIN_CAP];
        top = 0;
    }

    @SuppressWarnings("unchecked")
    private void changeCapacity(int capacity)
    {
        T[] newArr = (T[]) new Object[capacity];
        for(int i = 0; i < top; i++)
        {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(T value)
    {
        if(top == arr.length)
        {
            changeCapacity(arr.length * 2);
        }
        arr[top] = value;
        top = top + 1;
    }

    public void add(T value, int index)
    {
        if(top == arr.length)
        {
            changeCapacity(arr.length * 2);
        }
        for(int i = top; i > index; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        top = top + 1;
    }

    public void add(ArrayList<T> list0)
    {
        // Question 1 in the problem set.
        // Append list0 at the end of this list.
    }

    public void add(ArrayList<T> list0, int index)
    {
        // Question 2 in the problem set.
        // Insert list0 in this list at a given index.
        // We assume 0 <= index < top.
    }
}
