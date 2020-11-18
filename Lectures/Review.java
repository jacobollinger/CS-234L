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

        // iterate
        // queue
        for (int i = head; i != top; i = (i + 1) % arr.length) {}
        
        /** Final Topics: 
         * running time analysis, Stacks , Queues, ArrayLists, 
         * LinkedLists, trees, bst, AVL tree (self-balancing BST)
         */ 
    }
}
