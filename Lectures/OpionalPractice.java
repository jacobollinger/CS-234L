class OpionalPractice {
    static int frequency(int[] a, int x) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                count++;
            }
        }
        return count;
    }
    /**
     *  instructions         | const | value        | repetitions
     * int count = 0         | c1    | ------------ | 1
     * int i = 0             | c2    | i=0          | 1
     * ----------------------------------------------------------
     * i < a.length          | c3    | true         |
     * if(x == a[i]) count++ | c4    |              | n
     * i++                   | c5    |  i=1,2,...,n |
     * ----------------------------------------------------------
     * i < a.length          | c3    | false        | 1
     * return count          | c6    |              | 1
     * 
     * T(n) = (c3 + c4 + c5)n + (c1 + c2 + c3 + c6)
     */


    // What is the running time of maxFrequency
    static int maxFrequency(int[] a) {
        // 13, 48, 9, 48, 15, 70
        //  2   3  1       1
        // returns 3
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            int c = frequency(a, a[i]);
            if (c > max) {
                max = c;
            }
        }
        return max;
    }
    /**
     * instructions           | const    | value       | repetitions
     * int max = 0            | c1       | ----------- | 1
     * int i = 0              | c2       | i=0         | 1
     * --------------------------------------------------------------
     * i < a.length           | c3       | true        |
     * int c = frequency(...) | c4n + c5 | ----------- | n
     * if(...) max = c        | c6       | ----------- |
     * i++                    | c7       | i=1,2,...,n |
     * --------------------------------------------------------------
     * i < a.length           | c3       | false       | 1
     * return max             | c8       |             | 1
     * 
     * T(n) = c4n^2 + (c3 + c5 + c6 + c7)n + (c1 + c2 + c3 + c8)
     */
}
