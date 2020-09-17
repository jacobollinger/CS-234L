class Test2
{
    static void runTest1(String s1, String s2)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        LinkedList<Character> a2 = new LinkedList<Character>();
        for(char x : s2.toCharArray()) a2.append(x);
        System.out.println("a2 = " + a2);
        System.out.println("append a2 to a1:");
        a1.append(a2);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest2_1(String s1, String s2)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        LinkedList<Character> a2 = new LinkedList<Character>();
        for(char x : s2.toCharArray()) a2.append(x);
        System.out.println("a2 = " + a2);
        System.out.println("insert a2 at the start of a1:");
        a1.insert(a2, a1.start);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest2_2(String s1, String s2)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        LinkedList<Character> a2 = new LinkedList<Character>();
        for(char x : s2.toCharArray()) a2.append(x);
        System.out.println("a2 = " + a2);
        System.out.println("insert a2 in the middle of a1:");
        LinkedList<Character>.Node x = a1.start;
        for(int i = 0; i < s1.length() / 2; i++) x = x.next;
        a1.insert(a2, x);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest3_1(String s1)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        System.out.println("delete first half of a1:");
        LinkedList<Character>.Node x = a1.start;
        for(int i = 0; i < s1.length() / 2; i++) x = x.next;
        a1.delete(a1.start, x.previous);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest3_2(String s1)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        System.out.println("delete second half of a1:");
        LinkedList<Character>.Node x = a1.end;
        for(int i = 0; i < s1.length() / 2; i++) x = x.previous;
        a1.delete(x.next, a1.end);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest3_3(String s1)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        System.out.println("delete middle of a1:");
        LinkedList<Character>.Node x = a1.start;
        for(int i = 0; i < s1.length() / 4; i++) x = x.next;
        LinkedList<Character>.Node y = a1.end;
        for(int i = 0; i < s1.length() / 4; i++) y = y.previous;
        a1.delete(x, y);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest4(String s1)
    {
        LinkedList<Character> a1 = new LinkedList<Character>();
        for(char x : s1.toCharArray()) a1.append(x);
        System.out.println("a1 = " + a1);
        System.out.println("reverse a1:");
        a1.reverse();
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("1................................................");
        runTest1("abcde", "ABCD");
        runTest1("abcde", "");
        runTest1("", "ABCD");

        System.out.println("2................................................");
        runTest2_1("abcdef", "ABCDEFGHIJKL");
        runTest2_2("abcdef", "ABCDEFGHIJKL");

        System.out.println("3................................................");
        runTest3_1("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        runTest3_2("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        runTest3_3("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.println("4................................................");
        runTest4("abcdefg");
        runTest4("abcdefgh");
        runTest4("");
        runTest4("a");
    }
}

/* Expected output:
1................................................
a1 = [ a b c d e ]
a2 = [ A B C D ]
append a2 to a1:
a1 = [ a b c d e A B C D ]

a1 = [ a b c d e ]
a2 = [ ]
append a2 to a1:
a1 = [ a b c d e ]

a1 = [ ]
a2 = [ A B C D ]
append a2 to a1:
a1 = [ A B C D ]

2................................................
a1 = [ a b c d e f ]
a2 = [ A B C D E F G H I J K L ]
insert a2 at the start of a1:
a1 = [ A B C D E F G H I J K L a b c d e f ]

a1 = [ a b c d e f ]
a2 = [ A B C D E F G H I J K L ]
insert a2 in the middle of a1:
a1 = [ a b c A B C D E F G H I J K L d e f ]

3................................................
a1 = [ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ]
delete first half of a1:
a1 = [ N O P Q R S T U V W X Y Z ]

a1 = [ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ]
delete second half of a1:
a1 = [ A B C D E F G H I J K L M ]

a1 = [ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ]
delete middle of a1:
a1 = [ A B C D E F U V W X Y Z ]

4................................................
a1 = [ a b c d e f g ]
reverse a1:
a1 = [ g f e d c b a ]

a1 = [ a b c d e f g h ]
reverse a1:
a1 = [ h g f e d c b a ]

a1 = [ ]
reverse a1:
a1 = [ ]

a1 = [ a ]
reverse a1:
a1 = [ a ]
*/
