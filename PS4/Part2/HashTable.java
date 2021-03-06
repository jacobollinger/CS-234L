import java.util.LinkedList;

class HashTable<T> {
    private final double MAX_LOAD_FACTOR = 2; // maximum load factor.
    private final double MIN_LOAD_FACTOR = 0.5; // minimum load factor.

    private int n; // number of elements.
    private int[] m = { 3, 7, 17, 37, 79, 163, 331 }; // size of the table
    private int j; // index for the array m.
    private LinkedList<T>[] table;

    @SuppressWarnings("unchecked")
    public HashTable() {
        j = 0;
        table = new LinkedList[m[j]];
        for (int i = 0; i < table.length; i++)
            table[i] = new LinkedList<T>();
    }

    private int hashFunction(int key) {
        return key % m[j];
    }

    private double loadFactor() {
        return (double) n / m[j];
    }

    public boolean contains(T element) {
        int key = Math.abs(element.hashCode());
        int hashValue = hashFunction(key);
        return table[hashValue].contains(element);
    }

    public void add(T element) {
        simpleAdd(element, table);
        n++;
        if (loadFactor() > MAX_LOAD_FACTOR && j < m.length) {
            j++;
            LinkedList<T>[] newTable = new LinkedList[m[j]];
            for (int i = 0; i < m[j]; i++) {
                newTable[i] = new LinkedList<T>();
            }

            for (int i = 0; i < m[j - 1]; i++) {
                LinkedList<T> list = table[i];
                for (T x : list) {
                    simpleAdd(x, newTable);
                }
            }
            table = newTable;
        }
    }

    private void simpleAdd(T element, LinkedList<T>[] t) {
        int key = Math.abs(element.hashCode());
        int hashValue = hashFunction(key);
        if (!t[hashValue].contains(element)) {
            t[hashValue].add(element);
        }
    }

    public void remove(T element) {
        simpleRemove(element, table);
        n--;
        if (loadFactor() < MIN_LOAD_FACTOR && j > 0) {
            j--;
            LinkedList<T>[] newTable = new LinkedList[m[j]];
            for (int i = 0; i < m[j]; i++) {
                newTable[i] = new LinkedList<T>();
            }

            for (int i = 0; i < m[j + 1]; i++) {
                LinkedList<T> list = table[i];
                for (T x : list) {
                    simpleAdd(x, newTable);
                }
            }
            table = newTable;
        }
    }

    private void simpleRemove(T element, LinkedList<T>[] t) {
        int key = Math.abs(element.hashCode());
        int hashValue = hashFunction(key);
        if (t[hashValue].contains(element)) {
            t[hashValue].remove(element);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("n=" + n + ", m=" + m[j] + ", n/m=" + String.format("%.2f", loadFactor()) + "\n");
        builder.append("{\n");
        for (int i = 0; i < table.length; i++)
            builder.append((i < 10 ? "0" : "") + i + ": " + table[i] + "\n");
        builder.append("}\n");
        return builder.toString();
    }
}
