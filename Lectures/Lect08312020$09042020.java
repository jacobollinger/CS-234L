class Lect08312020$09042020 {
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
            if (a[i] < a[minIndex]) minIndex = i;
        }
        return minIndex;
    }
    /**
     * instructions | const | value | repetitions
     * int minIndex = low | d1 |    | 1
     * int i = low + 1 | d2 | i = low + 1 | 1
     * i <= high    | d3    |       |
     * if (a[i] < a[minIndex]) minIndex = i; | d4 | h - l
     * i++          | d5    | i = l+2,l+3,...,h+l
     * i <= high    | d3    | false | 1
     * return minIndex |    |       | 1
     * 
     * T_m(l, h) = (h - l)(d3 + d4 + d5) + (d1 + d2 + d3 + d6)
     */

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
     * instructions                       | const      | value        | repetitions 
     * int i = 0                          | c1         | i=0          | 1 
     * ----------------------------------------------------------------------------
     * i < a.length - 1                   | c2         | true         | n-1 
     * int minIndex=minimum(a,i,a.length) | (n-1)c3+c4 | ------------ | 
     * echange(a,i,minIndex)              | c5         | ------------ | n-1 |
     * i++                                | c6         | i=1,2,...n-1 | n-1
     * ----------------------------------------------------------------------------
     * i < a.length - 1                   | c2         | false        | 1
     * 
     * T(n) = (c3/2)n^2 + (c2+c3/2+c4+c5+c6)n + (c1 - c3 - c4 - c5 - c6)
     * 
     * 
     * Know for exams: 1+2+...+n = n(n+1) / 2
     */


    // regular expression
    // if(elem.matches("-?\\d+(\\.\\d+)?")) {}
    // -? means the negative sign is optional
    // \d means digit
    // + means one or more
    // . means any character
    // \. means period
}