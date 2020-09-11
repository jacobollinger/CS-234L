/** Array lists
 * |*|*|*|*| | | | |
 *          ^
 *         top
 * 18, 52, 39, 21, 40, 90
 * |18|52|39|21|40|90| | | |
 *                    top=6
 * implement aed/remove methods
 * make size (length) of array dynamic
 */
class ArrayList<T> {
    private T[] arr;
    private int top;
    private static final int MIN_CAP = 12;

    public ArrayList() {
        arr = (T[]) new Object[MIN_CAP];
        top = 0;
    }

    public void add(T value) {
        if(top == arr.length) {
            changeCapacity(arr.length * 2);
        }
        arr[top] = value;
        top++;
    }

    public void add(T value, int index) {
        for(int i = top; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        top++;
    }

    private void changeCapacity(int capacity) {
        T[] arr2 = (T[]) new Object[capacity];
        for(int i = 0; i < top; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public void add(ArrayList<T> list) {
        //TODO
        // double this.arr.length / this.changeCapacity((this.top + list.top) * 2) / this.changeCapacity(Math.max(2 * this.arr.length, this.top + list.top))
    }
    public void add(ArrayList<T> list, int index){}
}