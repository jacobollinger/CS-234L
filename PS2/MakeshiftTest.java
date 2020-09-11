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

        System.out.print(arrList1 + " + " + arrList2 + " = ");

        arrList1.add(arrList2);

        System.out.println(arrList1);
    }
}
