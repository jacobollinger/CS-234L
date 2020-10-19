import LinkedList.Node;

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
        } else {
            return a[j] >= a[j - 1] && sorted(a, j - 1);
        }
    }
    // count number of occurences of key value in a[0...j]
    static int count(int[] a, int j, int key) {
        if (j == 0) {
            return a[0] == key ? 1 : 0;
        } else {
            return count(a, j - 1, key) + a[j] == key ? 1 : 0;
        }
    }
    // count number of occurences of key in LinkedList starting from Node x to the end
    static int countLinkedList(Node x, int key) {
        if (x == null) {
            return 0;
        } else if (x == end) {
            return x.value == key ? 1 : 0;
        } else {
            return countLinkedList(x.next, key) + x.value == key ? 1 : 0;
        }
    }
    
    //* binary tree
    // LinkedList but each node can have at most 2 next nodes (0, 1, 2)
    // first node is called root
    // root connects to a left and right
    // last nodes of each branch are called leaf nodes
    // right is a subtree of root
    int countTree(Node x, int key) {
        if (x == null) {
            return 0;
        } else {
            return countTree(x.left, key) + countTree(x.right, key) + x.value == key ? 1 : 0;
        }
    }
    // Count number of leaves in a subtree rooted at x
    // leaf: node that has 0 children
    // x = a --> 5, x = i --> 1, x = null --> 0
    int leafCount(Node x) {
        if (x == null) {
            return 0;
        } else if (x.left == null && x.right == null) {
            return 1;
        } else {
            return leafCount(x.left) + leafCount(x.right);
        }
    }

    /** Binary search tree (BST)
     * 
     * Let x be a node in a binary search tree
     * If y is a node in the left subtree of x, thenthe value at y is less than the value at x.
     * If y is a node in the right subtree of x, then the value at y is larger than the value at x.
     * 
     */
    Node search(T value) {
        Node x = root;
        Node y = null;
        while(x != null) {
            y = x;
            if (value.equals(x.value)) {
                return x;
            } else if (value.compareTo(x.value) < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return y;
    }
    boolean bSearch(T value) {
        Node y = search(value);
        return y != null && y.value.equals(value);
    }
    void insert(T value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node y = search(value);
            if (y.value.equals(value)) return;
            else Node x = new Node(value);
            if (value.compareTo(y.value) < 0) y.left = x;
            else y.right = x;
            x.parent = y;
        }
    }
    Node maximum(Node x) {
        while(x.right != null) x = x.right;
        return x;
    }
    Node minimum(Node x) {
        while(x.left != null) x = x.left;
        return x;
    }
    Node successor(Node x) {
        if (x.right != null) return minimum(x.right);
        else {
            Node y = x.parent;
            while(y != null && x == y.right) {
                x = y;
                y = y.parent;
            }
            return y;
        }
    }
    // Traverse tree in order
    for (Node x = minimum(root; x != null; x = successor(x))) {...}
}