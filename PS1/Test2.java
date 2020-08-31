class Test2
{
    public static void main(String[] args)
    {
        ArrayQueue<Integer> q = new ArrayQueue<Integer>(3);
        System.out.println("\n--------------------------------------------");
        System.out.println(String.format("%-20s", "original queue") + " |\tcopy");
        System.out.println("--------------------------------------------");
        q.enqueue(1);
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        q.enqueue(2);
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        q.enqueue(3);
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        q.dequeue();
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        q.dequeue();
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        q.enqueue(4);
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        q.enqueue(5);
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + q.copy().full() + "\t" + q.copy());
        System.out.println("--------------------------------------------");
        ArrayQueue qCopy = q.copy();
        qCopy.dequeue();
        System.out.println(q.full() + "\t" + String.format("%-12s", q) + " |\t" + qCopy.full() + "\t" + qCopy);

        System.out.println();

        System.out.println("testing enhancedEnqueue:");
        ArrayQueue<Integer> q2 = new ArrayQueue<Integer>(3);
        q2.enqueue(1);
        System.out.println(q2);
        q2.enqueue(2);
        System.out.println(q2);
        q2.dequeue();
        System.out.println(q2);
        q2.dequeue();
        System.out.println(q2);
        for(int i = 1; i <= 16; i++)
        {
            q2.enhancedEnqueue(i);
            System.out.println(q2);
        }

        System.out.println();

        System.out.println("testing ReversibleArrayQueue:");
        ReversibleArrayQueue<Integer> r = new ReversibleArrayQueue<Integer>(4);
        System.out.print("enqueue 5\t");
        r.enqueue(5);
        System.out.println();
        System.out.print("enqueue 4\t");
        r.enqueue(4);
        System.out.println();
        System.out.print("reverse  \t");
        r.reverse();
        System.out.println();
        System.out.print("enqueue 8\t");
        r.enqueue(8);
        System.out.println();
        System.out.print("enqueue 2\t");
        r.enqueue(2);
        System.out.println();
        System.out.print("dequeue --> " + r.dequeue() + "\t");
        System.out.println();
        System.out.print("enqueue 7\t");
        r.enqueue(7);
        System.out.println();
        System.out.print("reverse  \t");
        r.reverse();
        System.out.println();
        System.out.print("dequeue --> " + r.dequeue() + "\t");
        System.out.println();
        System.out.print("dequeue --> " + r.dequeue() + "\t");
        System.out.println();
        System.out.print("dequeue --> " + r.dequeue() + "\t");
        System.out.println();
        System.out.print("dequeue --> " + r.dequeue() + "\t");
        System.out.println();
    }
}

// --------------------------------------------
// original queue       |  copy
// --------------------------------------------
// false   [ 1 ]        |  false   [ 1 ]
// false   [ 1 2 ]      |  false   [ 1 2 ]
// true    [ 1 2 3 ]    |  true    [ 1 2 3 ]
// false   [ 2 3 ]      |  false   [ 2 3 ]
// false   [ 3 ]        |  false   [ 3 ]
// false   [ 3 4 ]      |  false   [ 3 4 ]
// true    [ 3 4 5 ]    |  true    [ 3 4 5 ]
// --------------------------------------------
// true    [ 3 4 5 ]    |  false   [ 4 5 ]

// testing enhancedEnqueue:
// [ 1 ]
// [ 1 2 ]
// [ 2 ]
// [ ]
// [ 1 ]
// [ 1 2 ]
// [ 1 2 3 ]
// [ 1 2 3 4 ]
// [ 1 2 3 4 5 ]
// [ 1 2 3 4 5 6 ]
// [ 1 2 3 4 5 6 7 ]
// [ 1 2 3 4 5 6 7 8 ]
// [ 1 2 3 4 5 6 7 8 9 ]
// [ 1 2 3 4 5 6 7 8 9 10 ]
// [ 1 2 3 4 5 6 7 8 9 10 11 ]
// [ 1 2 3 4 5 6 7 8 9 10 11 12 ]
// [ 1 2 3 4 5 6 7 8 9 10 11 12 13 ]
// [ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 ]
// [ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ]
// [ 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 ]

// testing ReversibleArrayQueue:
// enqueue 5
// enqueue 4
// reverse
// enqueue 8
// enqueue 2
// dequeue --> 4
// enqueue 7
// reverse
// dequeue --> 7
// dequeue --> 2
// dequeue --> 8
// dequeue --> 5
