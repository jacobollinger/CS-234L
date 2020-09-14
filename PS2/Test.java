class Test
{
    static void runTest1(String s1, String s2)
    {
        ArrayList<Character> a1 = new ArrayList<Character>();
        for(char x : s1.toCharArray()) a1.add(x);
        System.out.println("a1 = " + a1);
        ArrayList<Character> a2 = new ArrayList<Character>();
        for(char x : s2.toCharArray()) a2.add(x);
        System.out.println("a2 = " + a2);
        System.out.println("add a2 to a1:");
        a1.add(a2);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    static void runTest2(String s1, String s2, int index)
    {
        ArrayList<Character> a1 = new ArrayList<Character>();
        for(char x : s1.toCharArray()) a1.add(x);
        System.out.println("a1 = " + a1);
        ArrayList<Character> a2 = new ArrayList<Character>();
        for(char x : s2.toCharArray()) a2.add(x);
        System.out.println("a2 = " + a2);
        System.out.println("add a2 to a1 at index " + index + ":");
        a1.add(a2, index);
        System.out.println("a1 = " + a1);
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("1................................................");
        runTest1("abcde", "ABC");
        runTest1("abcde", "ABCD");
        runTest1("abcde", "ABCDEFGHIJKLM");

        System.out.println("2................................................");
        runTest2("abcde", "ABC", 1);
        runTest2("abcde", "ABCD", 3);
        runTest2("abcde", "ABCDEFGHIJKL", 4);

        System.out.println("3................................................");
        ArrayList<Character> a1 = new ArrayList<Character>();
        for(char x : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()) a1.add(x);
        System.out.println("a1 = " + a1);
        System.out.println("remove all elements at index i, 22 <= i < 26:");
        a1.remove(22, 26);
        System.out.println("a1 = " + a1);
        System.out.println("remove all elements at index i, 2 <= i < 18:");
        a1.remove(2, 18);
        System.out.println("a1 = " + a1);
        System.out.println("remove all elements at index i, 0 <= i < 6:");
        a1.remove(0, 6);
        System.out.println("a1 = " + a1);
        System.out.println();

        System.out.println("4................................................");
        ArrayList<Character> a2 = new ArrayList<Character>();
        for(char x : "ABBCCBABBADCCCBBAABCBACBBAABBBACCCAB".toCharArray()) a2.add(x);
        System.out.println("a2 = " + a2);
        System.out.println("remove all elements equal to 'A' from a2:");
        a2.removeValue('A');
        System.out.println("a2 = " + a2);
        System.out.println("remove all elements equal to 'B' from a2:");
        a2.removeValue('B');
        System.out.println("a2 = " + a2);
        System.out.println("remove all elements equal to 'C' from a2:");
        a2.removeValue('C');
        System.out.println("a2 = " + a2);
    }
}

/*Expected output:
1................................................
a1 = [ a b c d e _ _ _ ]
a2 = [ A B C _ ]
add a2 to a1:
a1 = [ a b c d e A B C ]

a1 = [ a b c d e _ _ _ ]
a2 = [ A B C D ]
add a2 to a1:
a1 = [ a b c d e A B C D _ _ _ _ _ _ _ ]

a1 = [ a b c d e _ _ _ ]
a2 = [ A B C D E F G H I J K L M _ _ _ ]
add a2 to a1:
a1 = [ a b c d e A B C D E F G H I J K L M ]

2................................................
a1 = [ a b c d e _ _ _ ]
a2 = [ A B C _ ]
add a2 to a1 at index 1:
a1 = [ a A B C b c d e ]

a1 = [ a b c d e _ _ _ ]
a2 = [ A B C D ]
add a2 to a1 at index 3:
a1 = [ a b c A B C D d e _ _ _ _ _ _ _ ]

a1 = [ a b c d e _ _ _ ]
a2 = [ A B C D E F G H I J K L _ _ _ _ ]
add a2 to a1 at index 4:
a1 = [ a b c d A B C D E F G H I J K L e ]

3................................................
a1 = [ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z _ _ _ _ _ _ ]
remove all elements at index i, 22 <= i < 26:
a1 = [ A B C D E F G H I J K L M N O P Q R S T U V _ _ _ _ _ _ _ _ _ _ ]
remove all elements at index i, 2 <= i < 18:
a1 = [ A B S T U V _ _ _ _ _ _ _ _ _ _ ]
remove all elements at index i, 0 <= i < 6:
a1 = [ _ _ _ _ ]

4................................................
a2 = [ A B B C C B A B B A D C C C B B A A B C B A C B B A A B B B A C C C A B _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ]
remove all elements equal to 'A' from a2:
a2 = [ B B C C B B B D C C C B B B C B C B B B B B C C C B _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ]
remove all elements equal to 'B' from a2:
a2 = [ C C D C C C C C C C C _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ]
remove all elements equal to 'C' from a2:
a2 = [ D _ _ _ ]
*/
