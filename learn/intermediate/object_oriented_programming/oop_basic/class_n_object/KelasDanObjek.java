/**
 * Untuk membuat kelas, bisa menggunakan keyword class lalu diikuti nama kelas nya
 * biasanya penamaan nama kelas di java menggunakan UpperCamelCase
 */
class Orang {}

public class KelasDanObjek {
    public static void main(String[] args) {
        // Objek adalah instance dari suatu kelas
        // Untuk membuat objek bisa menggunakan keyword new lalu diikuti nama class nya dan tanda kurung ()
        // Kita bisa membuat banyak objek dengan satu kelas
        Orang orang1 = new Orang();
        Orang orang2 = new Orang();

        System.out.println(orang1);
        System.out.println(orang2);
    }
}

