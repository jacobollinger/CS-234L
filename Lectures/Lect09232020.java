class Lect09232020 {
    //* List operations: ArrayList vs LinkedList
    /**
     * operations | array list | linked list
     * add/remove last | O(1) - amortized | O(1)
     * add/remove first | O(n) | O(1)
     * add/remove at index i | O(n) worst case i=0 | O(n) worst case i=n/2
     * get/set at index i | O(1) | O(n) worst case i=n/2
     * search | 
     */

    //* Implementing better getNode function
    class LinkedSequence<T>{
        private LinkedList<T> list;
        // add a size integer
        private int size;
    
        public LinkedSequence() {
            list = new LinkedList<T>();
        }
    
        public void add(T value) {
            list.append(value);
            size++;
        }
        
        //! Old getNode function
        // private LinkedList<T>.Node getNode(int index) {
        //     LinkedList<T>.Node x = list.start;
        //     for(int i = 0; i < index; i++) {
        //         x = x.next;
        //     }
        //     return x;
        // }

        //* New getNode function
        private LinkedList<T>.Node getNode(int index) {
            LinkedList<T>.Node x;
            if (index < size / 2) {
                x = list.start;
                for(int i = 0; i < index; i++) {
                    x = x.next;
                }
            } else {
                x = list.end;
                for(int i = size - 1; i > index; i--) {
                    x = x.previous;
                }
            }
            return x;
        }
    
        public void add(T value, int index) {
            list.insert(value, getNode(index));
            size++;
        }
    
        public void remove(int index) {
            list.delete(getNode(index));
            size--;
        }
    
        public void set(T value, int index) {
            getNode(index).value = value;
        }
    
    
    }
}
