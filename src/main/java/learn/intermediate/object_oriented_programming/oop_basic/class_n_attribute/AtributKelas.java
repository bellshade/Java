package learn.intermediate.object_oriented_programming.oop_basic.class_n_attribute;

class Rumah {
    // pada line 3 dan 4 terdapat inisiasi atribut dengan nilai integer
    int kamar_tidur = 5;
    int kamar_mandi = 3;
}
public class AtributKelas {
    public static void main(String[] args) {
        // membuat obyek rumah dari kelas Rumah
        // pembuatan obyek dengan keyword new lalu nama kelas dan tanda kurung ()
        Rumah rumah = new Rumah();

        // menampilkan atribut kamar_mandi dari obyek rumah yaitu 5
        System.out.println(rumah.kamar_mandi);
        // menampilkan atribut kaman_tidur dari obyek rumah yaitu 3
        System.out.println(rumah.kamar_tidur);

        // nilai dari sebuah atribut juga dapat diubah
        rumah.kamar_mandi = 12; // atribut kamar_mandi sekarang berubah nilanya menjadi 12
        // menampilkan atribut kamar_mandi dari obyek rumah yaitu 12
        System.out.println(rumah.kamar_mandi);
    }
}
