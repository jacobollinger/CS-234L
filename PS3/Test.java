class Test
{
    public static void main(String[] args)
    {
        BinaryTree t = new BinaryTree();
        BinaryTree.Node a = t.new Node('a'),
                        b = t.new Node('b'),
                        c = t.new Node('c'),
                        d = t.new Node('d'),
                        e = t.new Node('e'),
                        f = t.new Node('f'),
                        g = t.new Node('g'),
                        h = t.new Node('h'),
                        i = t.new Node('i'),
                        j = t.new Node('j'),
                        k = t.new Node('k'),
                        l = t.new Node('l');
        BinaryTree.Node[] node = {a, b, c, d, e, f, g, h, i, j, k, l};
        int[][] link = {{0,1,2},{1,3,-1},{2,4,5},{3,6,7},{4,-1,8},{5,9,10},{9,11,-1}};
        t.root = node[0];
        for(int r = 0; r < link.length; r++)
        {
            if(link[r][1] >= 0)
                node[link[r][0]].left = node[link[r][1]];
            if(link[r][2] >= 0)
                node[link[r][0]].right = node[link[r][2]];
        }

        System.out.println("question 1.");
        System.out.println("number of nodes in the subtree rooted at a: " + t.size(a));
        System.out.println("number of nodes in the subtree rooted at b: " + t.size(b));
        System.out.println("number of nodes in the subtree rooted at c: " + t.size(c));
        System.out.println("number of nodes in an empty tree: " + t.size(null));
        System.out.println();
        System.out.println("question 2.");
        System.out.println("rightmost node in the subtree rooted at a: " + t.rightmost(a));
        System.out.println("rightmost node in the subtree rooted at b: " + t.rightmost(b));
        System.out.println("rightmost node in the subtree rooted at e: " + t.rightmost(e));
        System.out.println("rightmost node in an empty tree: " + t.rightmost(null));
        System.out.println();
        System.out.println("question 3.");
        System.out.println("height of the subtree rooted at a: " + t.height(a));
        System.out.println("height of the subtree rooted at b: " + t.height(b));
        System.out.println("height of the subtree rooted at g: " + t.height(g));
        System.out.println("height of an empty tree: " + t.height(null));
        System.out.println();
        System.out.println("question 4.");
        System.out.println("deepest node in the subtree rooted at a: " + t.deepest(a));
        System.out.println("deepest node in the subtree rooted at c: " + t.deepest(c));
        System.out.println("deepest node in the subtree rooted at e: " + t.deepest(e));
        System.out.println("deepest node in an empty tree: " + t.deepest(null));
        System.out.println();
        System.out.println("question 5.");
        System.out.println("the subtree rooted at a is balanced? " + t.balanced(a));
        System.out.println("the subtree rooted at b is balanced? " + t.balanced(b));
        System.out.println("the subtree rooted at c is balanced? " + t.balanced(c));
        System.out.println("an empty tree is balanced? " + t.balanced(null));
    }
}

/*Expected output

question 1.
number of nodes in the subtree rooted at a: 12
number of nodes in the subtree rooted at b: 4
number of nodes in the subtree rooted at c: 7
number of nodes in an empty tree: 0

question 2.
rightmost node in the subtree rooted at a: k
rightmost node in the subtree rooted at b: b
rightmost node in the subtree rooted at e: i
rightmost node in an empty tree: null

question 3.
height of the subtree rooted at a: 4
height of the subtree rooted at b: 2
height of the subtree rooted at g: 0
height of an empty tree: -1

question 4.
deepest node in the subtree rooted at a: l
deepest node in the subtree rooted at c: l
deepest node in the subtree rooted at e: i
deepest node in an empty tree: null

question 5.
the subtree rooted at a is balanced? false
the subtree rooted at b is balanced? false
the subtree rooted at c is balanced? true
an empty tree is balanced? true
*/
