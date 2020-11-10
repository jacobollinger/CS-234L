class Lecture10282020 {
    //* balancing BST
    // BST operations run in O(h) for h := height of tree
    // minimize h
    void rotation() {

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
            while (y != null) {
                if (!balanced(y)) {
                    
                }
                y = y.parent;
            }
        }
    }
}
