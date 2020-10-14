class BST<T extends Comparable<T>> {
    class Node {
        T value;
        Node left, right, parent;

        Node(T value) {
            this.value = value;
        }

        public String toString() {
            return value.toString();
        }
    }

    Node root;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for (Node x = minimum(root); x != null; x = successor(x))
            builder.append(x + " ");
        builder.append("] ");
        return builder.toString();
    }

    Node search(T value) {
        Node x = root;
        Node y = null;
        while (x != null) {
            y = x;
            if (value.equals(x.value))
                return x;
            else if (value.compareTo(x.value) < 0)
                x = x.left;
            else
                x = x.right;
        }
        return y;
    }

    void insert(T value) {
        if (root == null)
            root = new Node(value);
        else {
            Node y = search(value);
            if (y.value.equals(value))
                return;
            Node x = new Node(value);
            x.parent = y;
            if (value.compareTo(y.value) < 0)
                y.left = x;
            else
                y.right = x;
        }
    }

    Node maximum(Node x) {
        while (x.right != null)
            x = x.right;
        return x;
    }

    Node minimum(Node x) {
        while (x.left != null)
            x = x.left;
        return x;
    }

    Node successor(Node x) {
        if (x.right != null)
            return minimum(x.right);
        else {
            Node y = x.parent;
            while (y != null && x == y.right) {
                x = y;
                y = y.parent;
            }
            return y;
        }
    }

    Node predecessor(Node x) {
        if (x.left != null)
            return maximum(x.left);
        else {
            Node y = x.parent;
            while (y != null && x == y.left) {
                x = y;
                y = y.parent;
            }
            return y;
        }
    }

    // question 1a.
    // Find the smallest node in this tree that has a value strictly larger then the
    // given value.
    // Return null if such node does not exist.
    // The function must run in O(h), where h is the height of this tree.
    Node successor(T value) {
        Node x = search(value);
        if (x.value.compareTo(value) > 0) return x;
        else return successor(x);
    }

    // question 1b.
    // Find the largest node in this tree that has a value strictly smaller then the
    // given value.
    // Return null if such node does not exist.
    // The function must run in O(h), where h is the height of this tree.
    Node predecessor(T value) {
        Node x = search(value);
        if (x.value.compareTo(value) < 0) return x;
        else return predecessor(x);
    }

    // question 2.
    // Let v1 and v2 be two values of type T, with v1 < v2.
    // Find the number of values v in this tree, such that v1 < v < v2.
    // The function must run in O(h + m), where h is the height of this tree, and m
    // is the number of nodes in the interval (v1, v2).
    int intervalSize(T v1, T v2) {
        return 0;
    }

    // question 3.
    // Let t be a binary search tree.
    // Determine if this tree intersects t, i.e. there exists a value in this tree
    // that also appears in t.
    // The function must run in O(n1 + n2), where n1 and n2 are the number of nodes
    // in this tree and t respectively.
    boolean intersect(BST<T> t) {
        return false;
    }

    // question 4.
    // Let t be a binary search tree.
    // Determine if this tree is a subtree of t, i.e. all values in this tree also
    // appear in t.
    // The function must run in O(n1 + n2), where n1 and n2 are the number of nodes
    // in this tree and t respectively.
    boolean subtree(BST<T> t) {
        return false;
    }
}
