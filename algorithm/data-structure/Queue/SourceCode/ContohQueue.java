import java.util.LinkedList;
import java.util.Queue;

public class ContohQueue {
    public static void main(String[] args) {
        Queue<Integer> var = new LinkedList<>();

        // menambahkan elemen {0, 1, 2, 3, 4, 5} ke dalam antrian
        for(int i = 0; i <= 5; i++) {
            var.add(i);
        }

        // mengeluarkan output antrian
        System.out.println("Elemen dalam antrian : " + var);

        // menghapus elemen depan [FRONT] dalam antrian
        int hapus = var.remove();
        System.out.println("Elemen depan dalam antrian : " + hapus);
        System.out.println(var);

        // melihat elemen depan dalam antrian
        int depan = var.peek();
        System.out.println("Elemen depan dalam antrian : " + depan);

        /*
         Sisa Antrian saat ini
         Terdapat antarmuka seperti ukuran dan isi antrian
         bisa digunakan pada saat implementasian
         */

         int ukuran = var.size();
         System.out.println("Sisa antrian saat ini : " + ukuran);
    }
}