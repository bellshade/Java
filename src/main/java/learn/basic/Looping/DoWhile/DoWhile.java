package learn.basic.Looping.DoWhile;

// Perulangan while akan melakukan perulangan kalau kondisi (syarat) terpenuhi.
// Sedangkan do/while melakukan perulangan dulu, kemudian memeriksa kondisinya atau sayaratnya.

public class DoWhile {
    public static void main(String[] args){
        int angka = 0;
        do{
            // eksekusi code dibawah ini terlebih dahulu, sebelum memerika kondisinya
            angka++;
            System.out.println(angka); // ekpetasi output: 1 2 3 4 5 6 7 8 9 10
        }
        while(angka < 10 ); // selama angka masih kurang dari 10, ulanglah code diatas
    }                       // jika angka lebih atau sama dengan 10, hentikan perulangan
    
}

// Kapankah Waktu yang Tepat Menggunakan while dan do/while?
// Tergantung dari kasusnya.
// Bila syarat perulangannya tidak berkaitan dengan hasil hitung pada blok kode yang diulang,
// maka pakailah while. Tetapi, bila syarat perulangannya berkaitan dengan hasil perhitungan di blok kode yang diulang, 
// maka pakailah do/while.