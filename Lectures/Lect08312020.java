class Lect08312020 {
    public static void main(String[] args) {
        int[] a = {};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(i + " " + j);
            }
        }
        /**
         * instructions | const | value | repetitions int i = 0 | c1 | i=0 | 1 i <
         * a.length | c2 | true | n int j = 0 | c3 | j=0 | n j <= i | c4 | true |
         * println | c5 | ----- | j++ | c6 | i=n-1 j=1,2,...n | (n^2)/2 + n/2 j <= i |
         * c4 | false | n i++ | c7 | i=1,2,...n | n i < a.length | c2 | false | 1
         * 
         * T(n) = (c4/2 + c5/2 + c6/2)n^2 + (c2 + c3 + 3c4/2 + c5/2 + c6/2 + c7)n + (c1
         * + c2) T(n) = an^2 + bn + c a, b, c constants
         * 
         * order of growth of a function
         */
    }



    static int minimum(int[] a, int low, int high) {
        int minIndex = low;
        for (int i = low + 1; i <= high; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = minimum(a, i, a.length);
            exchange(a, i, minIndex);
        }
    }

    /**
     * instructions | const | value | repetitions 
     * int i = 0    | c1    | i=0   | 1 
     * ------------------------------------------
     * i < a.length - 1 | c2 | true | n-1 
     * int minIndex=minimum(...) | ?? |
     * echange(...) | c3    |       | n-1
     * i++          | c4    | i=1,2,...n-1 | n-1
     * ------------------------------------------
     */
}