package learn.intermediate.object_oriented_programming.oop_intermediate.Abstract;

/**
 * kelas Kucing dan Bebek mempunyai sifat-sifat yang diwariskan oleh kelas Binatang
 */

abstract class Binatang{

    // Membuat kelas abstrak
    // contoh Method abstrak
    //   setiap binatang memiliki kaki dan suara
    public abstract void kakiBinatang();

    // contoh method non-abstrak didalam kelas abstrak
    protected void suaraBinatang(String suara) {
        System.out.println("bersuara "+suara);
    }
}

class Kucing extends Binatang{
    // Contoh kelas Abstrak

    public String nama = "Kucing";

    // Contoh implementasi dari method abstrak
    @Override
    public void kakiBinatang() {

        // Di kelas `Kucing`, method dari kelas abstrak di-LENGKAPI dengan logika
        System.out.println("memiliki 4 kaki");
    }
}

class Bebek extends Binatang{
    // Contoh kelas Abstrak

    public String nama = "Bebek";

    // Contoh implementasi dari method abstrak
    @Override
    public void kakiBinatang() {

        // Di kelas `Kucing`, method dari kelas abstrak di-LENGKAPI dengan logika
        System.out.println("memiliki 2 kaki");
    }
}

class abstrakTutorial{
    // deklarasi semua kelas dan pemanggilan

    public static void main(String[] args){

        Kucing empus = new Kucing();
        System.out.println(empus.nama); // output : Kucing
        empus.kakiBinatang(); // output : memiliki 4 kaki

        // suaraBinatang adalah warisan method dari kelas Binatang
        empus.suaraBinatang("meow meow"); // output : bersuara meow meow

        Bebek mentok = new Bebek();
        System.out.println(mentok.nama); // output : Bebek
        mentok.kakiBinatang(); // output : memiliki 2 kaki

        // suaraBinatang adalah warisan method dari kelas Binatang
        mentok.suaraBinatang("wek wek"); // output : bersuara wek wek
    }
}