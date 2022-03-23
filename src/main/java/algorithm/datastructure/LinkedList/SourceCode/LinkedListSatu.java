package algorithm.datastructure.LinkedList.SourceCode;

import java.util.LinkedList;

public class LinkedListSatu {
    public static void main(String[] args) throws Exception {
        try {
            LinkedList<Integer> yt = new LinkedList<Integer>();

            yt.add(123);
            yt.add(456);
            yt.add(789);
            System.out.println("Elemen di dalam Linked List : " + yt);
        } catch(NullPointerException e) {
            System.out.println("Pengecualian : " + e);
        }
    }
}
