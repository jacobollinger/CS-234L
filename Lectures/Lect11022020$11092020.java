class Lect11022020$11092020 {
    /** Binary Search Trees
     * -add
     * -remove
     * -search
     * -min/max
     * -sucessor/predecessor
     * -sort
     * 
     * O(h)
     * 
     * Balanced
     *  h = O(log_2(n))
     *  log_2(1000000) ~= 20
     * 
     * 
     * ? How can we add, remove, and search in O(c) where c is a constant
     * Ex: Calendar application
     *      Events:
     *          e1 = March 14, Hiking trip
     *          e2 = March 21, Charity event
     *          e3 = June 2, Concert
     *          e4 = July 19, Hiking trip
     * 
     *      *Direct-adding table (DAT)
     *          convert event to an integer
     *              C(e1) = 314
     *              C(e1) = 321
     *              C(e1) = 602
     *              C(e1) = 719
     *          hash code of event e (key):
     *              k = c(e) = e.month * 100 + e.day
     *              unique integer
     * 
     *      add(e)
     *          k = C(e)
     *          table[k] = e
     *      remove(e)
     *          k = C(e)
     *          table[k] = null
     *      search(e)
     *          k = C(e)
     *          return table[k] // an event or null
     * 
     * set of objects (n) to add
     * DAT (size m)
     * n >> m
     * 
     * Ex: cont. Calendar application
     *      Events:
     *          e1 = March 14, 2016, Hiking trip
     *          e2 = March 21, 2017, Charity event
     *          e3 = June 2, 2017, Concert
     *          e4 = July 19, 2018, Hiking trip
     * 
     *      Hash code
     *          C(e) = e.year * 10000 + e.month * 100 + e.day
     *      C(e1) = 20160314
     *      table size: 20,160,314
     * 
     * *Hash table
     *      event -> hash code -> hash function -> index
     *      e -> C(e) -> h(k) -> index
     * 
     *      hash function
     *          h(k) = k % m
     */

    import java.util.LinkedList;
    class HashTable<T> {
        private int n; // number of elements
        private int m; // size of table, length of array
        private LinkedList<T>[] table;

        public HashTable() {
            table = new LinkedList[m];
            for (int i = 0; i < m; i++) {
                table[i] = new LinkedList<T>();
            }
        }

        private int hashFunction(int key) {
            return key % m;
        }

        public void add(T element) {
            int key = Math.abs(element.hashCode());
            int hashValue = hashFunction(key);
            if (!table[hashValue].contains(element)) {
                table[hashValue].add(element);
                n++;
            }
        }

        public void remove(T element) {
            int key = Math.abs(element.hashCode());
            int hashValue = hashFunction(key);
            if (table[hashValue].contains(element)) {
                table[hashValue].remove(element);
                n--;
            }
        }

        public boolean contains(T element) {
            int key = Math.abs(element.hashCode());
            int hashValue = hashFunction(key);
            return table[hashValue].contains(element);
        }

        //* Average size of a linked list
        // load factor n/m
        //* average running time
        // O(1+n/m)
        // small load factor

        int MAX_LOAD_FACTOR = 2;
        /** m = 3
         * n = 1
         * n/m = 0.33
         * 
         * n = 2
         * n/m = 0.67
         * 
         * n = 3
         * n/m = 1
         * 
         * n = 4
         * n/m = 1.33
         * 
         * n = 5
         * n/m = 1.67
         * 
         * n = 6
         * n/m = 2
         * 
         * n = 6
         ** n/m = 2.33
         * n/m > 2
         * 
         * int[] m = {3, 7, 17, 37, 79, 163, 331}
         * rehash after m changes
         * 
         * 
         * m = 7
         * n = 4
         * 
         * Best case
         * Running time of add, remove, contains
         * (assuming that n <= m) All n elements hash to different slots
         * O(1)
         * 
         * Worst case
         * All n elements hash to same slot
         * O(n)
         * 
         * Average case
         * average size of linked list n/m
         * Any element is equally likely to hash to any of the m slots
         * O(1 + n / m)
         * 
         * for (int i = 0; i < m; i++) { m := table.length
         *      LinkedList<T> list = table[i];
         *      for (int j = 0; j < list.size(); j++) {
         *          list.get(j); //! Do not do this
         *      }
         *      for(T x : list) {
         *          x.value
         *      }
         * }
         */
    }
    class Event {
        int year, month, day;

        public boolean equals(Object obj) {
            return false;
        }

        public int hashCode() {
            return 10000 * year + 100 * month + day;
        }
    }
}
