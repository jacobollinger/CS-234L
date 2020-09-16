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

    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
    private void changeCapacity(int capacity) {
        T[] arr2 = (T[]) new Object[capacity];
        for(int i = 0; i < top; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public void add(ArrayList<T> list) { /*PS2*/
        // double this.arr.length / this.changeCapacity((this.top + list.top) * 2) / this.changeCapacity(Math.max(2 * this.arr.length, this.top + list.top))
    }
    public void add(ArrayList<T> list, int index) { /*PS2*/ }

    /**
     * 8 [********]
     * 16 [****************]
     * 32 [********xxxxxxxxx               ] (17 elements)
     * 32 [*******x                        ] (8 elements)
     * 16 [*******         ] (7 elements)
     * 
     * n < arr.length / 4
     */
    public void remove() {
        top--;
        if(top < arr.length / 4 && arr.length / 2 >= MIN_CAP) {
            changeCapacity(arr.length / 2);
        }
    }

    public void remove(int index) {
        top--;
        for(int i = index; i < top; i++) {
            arr[i] = arr[i + 1];
        }
        if(top < arr.length / 4 && arr.length / 2 >= MIN_CAP) {
            changeCapacity(arr.length / 2);
        }
    }
}
class Lect09142020 {
    public static void main(String[] args) {
        // n > 0
        int n = 10;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            a.add(i);
        }
        /** 
         * list size | capacity(length) | copy operations | total copy operations
         * 0         | 1                | 0               | 0
         * 1         | 1                | 0               | 0
         * 2         | 2                | 1               | 1
         * 3         | 4                | 2               | 3
         * 4         | 4                | 0               | 3
         * 5         | 8                | 4               | 7
         * 6         | 8                | 0               | 7
         * 7         | 8                | 0               | 7
         * 8         | 8                | 0               | 7
         * 9         | 16               | 1               | 15
         * 10        | 16               | 0               | 15
         * 11        | 16               | 0               | 15
         * 12        | 16               | 0               | 15
         * 13        | 16               | 0               | 15
         * 14        | 16               | 0               | 15
         * 15        | 16               | 0               | 15
         * 16        | 16               | 0               | 15
         * 
         * When n is a power of 2, the total copy operations is i - 1
         * 
         * n * O(1) + (n - 1) * O(1) = O(n)
         * 
         * adding n elements requires O(n) time 
         * when the length of arr is doubled
         * 
         * list size | capacity(length) | copy operations | total copy operations
         * 0         | 1                | 0               | 0
         * 1         | 1                | 0               | 0
         * 2         | 4                | 1               | 1
         * 3         | 4                | 0               | 1
         * 4         | 4                | 0               | 1
         * 5         | 7                | 0               | 5
         * 6         | 7                | 0               | 5
         * 7         | 7                | 0               | 5
         * 8         | 10               | 7               | 12
         * 9         | 10               | 0               | 12
         * 10        | 10               | 0               | 12
         * 11        | 13               | 10              | 22
         * 12        | 13               | 0               | 22
         * 13        | 13               | 0               | 22
         * 14        | 16               | 13              | 35
         * 15        | 16               | 0               | 35
         * 16        | 16               | 0               | 35
         * 
         * 
         * linear
         * T(n) = c1n + c2
         *      = O(n)
         * 
         * constant
         * T(n) = c1
         *      = O(1)
        */
    }
}
