class BinaryTree {
    class Node {
        char label;
        Node left, right;

        Node(char label) {
            this.label = label;
        }

        public String toString() {
            return String.valueOf(label);
        }
    }

    Node root;

    // question 1. Return the number of nodes in the subtree rooted at node x.
    int size(Node x) {
        return 0;
    }

    // question 2. Return the rightmost node in the subtree rooted at node x.
    Node rightmost(Node x) {
        return null;
    }

    // question 3. Return the height of the subtree rooted at node x.
    int height(Node x) {
        return 0;
    }

    // question 4. Return the deepest node in the subtree rooted at node x.
    Node deepest(Node x) {
        return null;
    }

    // question 5. Determine if the subtree rooted at node x is balanced.
    // A binary tree T is balanced if and only if, for all nodes x in T,
    // abs(height(x.left) - height(x.right)) <= 1.
    boolean balanced(Node x) {
        return false;
    }
}