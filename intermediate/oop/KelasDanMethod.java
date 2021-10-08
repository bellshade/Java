class Orang {
    // berikut cara pembuatan method pada class di Java
    void hello() {
        System.out.println("Hello Bellshade!");
    }
    void belajar() {
        System.out.println("Aku sedang belajar Java OOP!");
    }

    // cara pembuatan method dengan return type String
    String bellshade() {
        return "https://github.com/bellshade/Java";
    }
}

public class KelasDanMethod {
    public static void main(String[] args) {
        // inisiasi object orang dari kelas Orang;
        // untuk cara inisiasi object bisa di baca di file README.md
        Orang orang = new Orang();

        // menjalankan method hello dari object orang
        orang.hello();
        // memanggil method belajar dari object orang
        orang.belajar();

        // memanggil method yang memiliki return type
        // untuk bisa memanggil method yang memiliki return type
        // harus di masukkan ke dalam variable

        String bellshade = orang.bellshade();

        // atau bisa di print langsung di console
        System.out.println(orang.bellshade());
    }
}
