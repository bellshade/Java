package com.bellshade.learn.basic.Array.BasicArray;

// array digunakan untuk memaskan value yang banyak dalam satu variabel
// array dapat berisi banyak value
// untuk deklarasi array menggunakan [] (kurung kotak)

public class BasicArray {
    public static void main(String[] args) {
        // ==DEKLARASI ARRAY==
        /*
         * Ada dua tipe deklarasi pada array di java, yakni dengan mengisi langsung isi
         * array atau dengan memesan tempat di memori terlebih dahulu dengan isi array
         * kosong. Perlu diingat bahwa panjang array pada java bersifat fixed. Artinya
         * jika pada saat deklarasi kita membuat array dengan panjang 10 maka panjang
         * tersebut tidak dapat ditambah. Jika sekiranya kalian butuh menambah panjang
         * array, yang kalian bisa lakukan adalah membuat array baru yang lebih panjang
         * dan meng-copy isi dari array yang lama.
         **/

        // Deklarasi 1
        // array nama_siswa dibawah memiliki panjang 4.
        String[] nama_siswa = { "buddy", "buzz", "slinki", "rex" };

        // Deklarasi 2
        /*
         * array numbers akan menginisiasi array dengan panjang 10. Secara default, isi
         * array dibawah akan terisi angka 0, namun bisa berbeda sesuai dengan tipe
         * data. Pada tipe data String, nilai default adalah null. Inisialisasi seperti
         * dibawah berarti kita memesan tempat pada memori dengan panjang 10.
         **/
        int[] numbers = new int[10];

        // ==AKSES ELEMEN PADA ARRAY==
        // untuk mengakses nilai pada array kita hanya perlu menuliskan index dalam []
        // index pada array dimulai dari angka 0
        String siswa_pertama = nama_siswa[0]; // mengembalikan nilai buddy
        System.out.println(siswa_pertama);

        // Mengubah nilai pada index tertentu
        nama_siswa[0] = "Dono";
        System.out.println("Nama siswa pertama setelah diubah : " + nama_siswa[0]);

        numbers[9] = 100;
        System.out.println(numbers[9]);

        // ==Menampilkan Array==
        /*
         * jika array menggunakan string maka untuk tipe data dalam looping menggunakan
         * string jika array menggunakan integer maka untuk tipe data dalam looping
         * menggunakan integer
         **/
        for (String tampilkan : nama_siswa) {
            System.out.print(tampilkan + " ");
        }
    }
}