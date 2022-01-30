import java.util.*;

public class LinkedListSatu {
    public static void main(String[] args) {
        LinkedList<Integer> cth = new LinkedList<Integer>();

        cth.add(123);
        cth.add(456);
        cth.add(789);

        Iterator j = cth.descendingIterator();
        while(j.hasNext()) {
            System.out.println(j.next());
        }
    }
}
