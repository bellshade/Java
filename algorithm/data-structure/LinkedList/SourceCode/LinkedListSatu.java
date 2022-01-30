import java.util.*;

public class LinkedListSatu {
    public static void main(String[] args) {
        try {
            LinkedList<Integer> tst = new LinkedList<Integer>();

            tst.add(123);
            tst.add(456);
            tst.add(789);
            System.out.println("Elemen di dalam Linked List : " + tst);

            int nilai = tst.element();
            System.out.println("Awal list dalam Linked List : " + lst);
        } catch(NullPointerException e) {
            System.out.println("Pengecualian : " + e);
        }
    }
}
