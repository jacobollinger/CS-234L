class Test2
{
    public static void main(String[] args)
    {
        BST<Integer> t1 = new BST<Integer>();
        for(int v : new int[]{41, 20, 65, 11, 29, 50, 91, 32, 45, 72, 99, 33})
            t1.insert(v);
        System.out.println("t1: " + t1);
        BST<Integer> t2 = new BST<Integer>();
        for(int v : new int[]{41, 20, 65, 29, 50, 91, 32, 72, 99, 33})
            t2.insert(v);
        System.out.println("t2: " + t2);
        BST<Integer> t3 = new BST<Integer>();
        for(int v : new int[]{44, 77, 81, 38, 59, 58, 60, 34, 99, 33})
            t3.insert(v);
        System.out.println("t3: " + t3);
        BST<Integer> t4 = new BST<Integer>();
        for(int v : new int[]{44, 77, 21, 38, 59, 58, 60, 34, 12, 15})
            t4.insert(v);
        System.out.println("t4: " + t4);
        BST<Integer> t5 = new BST<Integer>();
        for(int v : new int[]{41, 20, 100, 65, 11, 29})
            t5.insert(v);
        System.out.println("t5: " + t5);
        System.out.println();

        System.out.println("1..........................................");
        System.out.println("successor of  65 in t1: " + t1.successor(65));
        System.out.println("successor of  68 in t1: " + t1.successor(68));
        System.out.println("successor of  35 in t1: " + t1.successor(35));
        System.out.println("successor of   0 in t1: " + t1.successor(0));
        System.out.println("successor of  99 in t1: " + t1.successor(99));
        System.out.println("successor of 102 in t1: " + t1.successor(102));
        System.out.println();

        System.out.println("predecessor of 102 in t1: " + t1.predecessor(102));
        System.out.println("predecessor of  72 in t1: " + t1.predecessor(72));
        System.out.println("predecessor of  45 in t1: " + t1.predecessor(45));
        System.out.println("predecessor of  41 in t1: " + t1.predecessor(41));
        System.out.println("predecessor of  40 in t1: " + t1.predecessor(40));
        System.out.println("predecessor of   5 in t1: " + t1.predecessor(5));
        System.out.println();

        System.out.println("2..........................................");
        System.out.println("size of interval ( 0, 100) in t1: " + t1.intervalSize(0, 100));
        System.out.println("size of interval ( 0,  51) in t1: " + t1.intervalSize(0, 51));
        System.out.println("size of interval (25,  75) in t1: " + t1.intervalSize(25, 75));
        System.out.println("size of interval (50, 100) in t1: " + t1.intervalSize(50, 100));
        System.out.println("size of interval (26,  29) in t1: " + t1.intervalSize(25, 26));
        System.out.println();

        System.out.println("3..........................................");
        System.out.println("t1 intersects t1? " + t1.intersect(t1));
        System.out.println("t2 intersects t1? " + t2.intersect(t1));
        System.out.println("t1 intersects t2? " + t1.intersect(t2));
        System.out.println("t3 intersects t1? " + t3.intersect(t1));
        System.out.println("t1 intersects t3? " + t1.intersect(t3));
        System.out.println("t4 intersects t1? " + t4.intersect(t1));
        System.out.println("t1 intersects t4? " + t1.intersect(t4));
        System.out.println("t5 intersects t1? " + t5.intersect(t1));
        System.out.println("t1 intersects t5? " + t1.intersect(t5));
        System.out.println();

        System.out.println("4..........................................");
        System.out.println("t1 subtree of t1? " + t1.subtree(t1));
        System.out.println("t2 subtree of t1? " + t2.subtree(t1));
        System.out.println("t1 subtree of t2? " + t1.subtree(t2));
        System.out.println("t3 subtree of t1? " + t3.subtree(t1));
        System.out.println("t1 subtree of t3? " + t1.subtree(t3));
        System.out.println("t4 subtree of t1? " + t4.subtree(t1));
        System.out.println("t1 subtree of t4? " + t1.subtree(t4));
        System.out.println("t5 subtree of t1? " + t5.subtree(t1));
        System.out.println("t1 subtree of t5? " + t1.subtree(t5));
    }
}

/* Expected output:
t1: [ 11 20 29 32 33 41 45 50 65 72 91 99 ]
t2: [ 20 29 32 33 41 50 65 72 91 99 ]
t3: [ 33 34 38 44 58 59 60 77 81 99 ]
t4: [ 12 15 21 34 38 44 58 59 60 77 ]
t5: [ 11 20 29 41 65 100 ]

1..........................................
successor of  65 in t1: 72
successor of  68 in t1: 72
successor of  35 in t1: 41
successor of   0 in t1: 11
successor of  99 in t1: null
successor of 102 in t1: null

predecessor of 102 in t1: 99
predecessor of  72 in t1: 65
predecessor of  45 in t1: 41
predecessor of  41 in t1: 33
predecessor of  40 in t1: 33
predecessor of   5 in t1: null

2..........................................
size of interval ( 0, 100) in t1: 12
size of interval ( 0,  51) in t1: 8
size of interval (25,  75) in t1: 8
size of interval (50, 100) in t1: 4
size of interval (26,  29) in t1: 0

3..........................................
t1 intersects t1? true
t2 intersects t1? true
t1 intersects t2? true
t3 intersects t1? true
t1 intersects t3? true
t4 intersects t1? false
t1 intersects t4? false
t5 intersects t1? true
t1 intersects t5? true

4..........................................
t1 subtree of t1? true
t2 subtree of t1? true
t1 subtree of t2? false
t3 subtree of t1? false
t1 subtree of t3? false
t4 subtree of t1? false
t1 subtree of t4? false
t5 subtree of t1? false
t1 subtree of t5? false
*/
