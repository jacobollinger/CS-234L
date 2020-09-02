import jdk.jfr.Frequency;

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
     * instructions               | const      | value        | repetitions
     * int max = 0                | c1
     * int i = 0                  |
     * i < a.length               |
     * int c = frequency(a, a[i]) |
     * if(c > max) max = c        |
     * i++                        |
     * i < a.length               |
     * return max                 |
     */
}
