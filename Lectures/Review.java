class Review {
    public static void main(String[] args) {
        // * Running time

        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println(i + " " + j);
            }
        }
        /** 
         * n = 5
         * 
         * 1 1
         * 2 2
         * 2 1
         * 3 3
         * 3 2
         * 3 1
         * 4 4
         * 4 3
         * 4 2
         * 4 1
         * 
         * instr | const | value | repetitions
         * int i = 1 | c1 | i = 1 | 1
         * i < n | c2 | true | n-1
         * int j = i | c3 | j = 1,2,...,n-1 | n-1
         * j > 0 | c4 | true | n^2/2 - n/2
         * print | c5 | __ | n^2/2 - n/2
         * j-- | c6 | j = 0; 2, 1, 0; 3, 2, 1, 0;...; | n^2/2 - n/2
         * j > 0 | c4 | false | n-1
         * i++ | c7 | i = 2, 3, 4,...,n | n-1
         * i < n | c2 | false | 1
         * 
         * O(n) = n * (n + 1) / 2 - n
         * * O(n) = n * (n - 1) / 2
         * ! Know this sum and n * (n + 1) / 2 (sum of the first n integers)
         */


        { //* Iterating Over Data Structures
            // Stacks
            ArrayStack stack = new ArrayStack();
            for(int i = 0; i < stack.top; i++) {
                System.out.println(stack.arr[i]);
            }

            // Queues
            ArrayQueue queue = new ArrayQueue();
            for (int i = queue.head; i != queue.top; i = (i + 1) % queue.arr.length) {
                System.out.println(queue.arr[i]);
            }

            // ArrayLists
            ArrayList aList = new ArrayList();
            for (int i = 0; i < aList.top; i++) {
                System.out.println(aList.arr[i]);
            }

            // LinkedLists
            LinkedList lList = new LinkedList();
            for (Node x = lList.start; x != null; x = x.next) {
                System.out.println(x.value);
            }

            // BinarySearchTrees
            BST bst = new BST();
            for (Node x = minimum(bst.root); x != null; x = successor(x)) {
                System.out.println(x.value);
            }

            // HashTables
            HashTable ht = new HashTable();
            for (int i = 0; i < ht.table.length; i++) {
                for (T e : ht.table) {
                    System.out.println(e);
                }
            }
        }

        /** Final Topics: 
         * running time analysis, Stacks , Queues, ArrayLists, 
         * LinkedLists, trees, bst, AVL tree (self-balancing BST)
         */ 
    }
}
