import java.util.LinkedList;

public class LinkedListSatu {
    public static void main(String[] args) throws Exception {
        try {
            LinkedList<Integer> tst = new LinkedList<Integer>();

            tst.add(123);
            tst.add(456);
            tst.add(789);
            System.out.println("Elemen di dalam Linked List : " + tst);
        } catch(NullPointerException e) {
            System.out.println("Pengecualian : " + e);
        }
    }
}
