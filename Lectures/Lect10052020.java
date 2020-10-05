class Lect10052020 {
    //* Recursion
    // sum all values in array a[0...j]
    // a[0...j] - subarray that starts at index 0 and ends at index j

    //* iterative
    static int sumIterative(int[] a, int j) {
        int s = 0;
        for(int i = 0; i <= j; i++) {
            s += a[i];
        }
        return s;
    }

    // 10 + 15 + 12 + 20
    // sum(a, j - 1) + a[j]
    // sum(a, j) = sum(a, j - 1) + a[j] //! doesn't work for j = 0
    //* sum(a, j) = j == 0 ? a[0] : sum(a, j - 1) + a[j]

    //* Recursive
    static int sumRecursive(int[] a, int j) {
        if(j == 0) {
            return a[0];
        } else {
            return sumRecursive(a, j - 1) + a[j];
        }
    }
    // sum(a, 3) //? stack [sum(a, 3)]
    // sum(a, 2) //? stack [sum(a, 3), sum(a, 2)]
    // sum(a, 1) //? stack [sum(a, 3), sum(a, 2), sum(a, 1)]
    // sum(a, 0) //? stack [sum(a, 3), sum(a, 2), sum(a, 1), sum(a, 0)]
    // return 10 //? stack [sum(a, 3), sum(a, 2), sum(a, 1)]
    // return 10 + a[1] //? stack [sum(a, 3), sum(a, 2)]
    // return 25 + a[2] //? stack [sum(a, 3)]
    // return 37 + a[3] //? stack []
    // return 57

    // a = {10, 15, 12, 20, 18}
    // minimum of a[0...j]
    static int minimum(int[] a, int j) {
        if (j == 0) {
            return a[0];
        } else {
            return Math.min(a[j], minimum(a, j - 1));
        }
        // return j == 0 ? a[0] : Math.min(a[j], minimum(a, j - 1));
    }
    // return true if a[0...j] has 2 adjacent values that are equal
    static boolean equalNeighbors(int[] a, int j) {
        if (j == 0) {
            return false;
        } else if (j == 1) {
            return a[0] == a[1];
        } else {
            return a[j] == a[j - 1] || equalNeighbors(a, j - 1);
        }
    }
    // find if a[0..j] is sorted
    static boolean sorted(int[] a, int j) {
        if (j == 0) {
            return true;
        } else if (j == 1) {
            return a[0] < a[1];
        } else {
            return a[j - 1] < a[j] && sorted(a, j - 1);
        }
    }
}
