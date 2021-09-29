// array digunakan untuk memaskan value yang banyak dalam satu variabel
// array dapat berisi banyak value
// untuk deklarasi array menggunakan [] (kurung kotak)

public class BasicArray{
    public static void main(String[] args){
        // deklarasi array
        String[] nama_siswa = {
            "buddy",
            "buzz",
            "slinki",
            "rex"
        };

        // menampilkan array
        // jika array menggunakan string maka untuk tipe data dalam
        // looping menggunakan string
        // jika array menggunakan integer maka untuk tipe data dalam
        // looping menggunakan integer
        for(String tampilkan: nama_siswa){
            System.out.println(tampilkan);
        }
    }
}