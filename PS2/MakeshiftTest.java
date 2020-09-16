class MakeshiftTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrList1.add(i);
        }
        for (int i = 7; i < 12; i++) {
            arrList2.add(i);
        }

        // System.out.print(arrList1 + " + " + arrList2 + " = ");
        // arrList1.add(arrList2);
        // System.out.println(arrList1);

        // arrList1.add(arrList2, 3);

        System.out.println(arrList1);

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.addToEmptyLinkedList(1);
        for(int i = 2; i < 10; i++) {
            linkedList1.appendValue(i);
        }
        linkedList1.delete(5);
        System.out.println(linkedList1.toString());
    }
}
