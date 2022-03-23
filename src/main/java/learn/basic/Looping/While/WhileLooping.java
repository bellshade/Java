package learn.basic.Looping.While;

// while looping adalah perulangan dimana ia akan menjalankan
//  perintah selama kondisi tertentu terpenuhi.

public class WhileLooping {
    public static void main(String[] args){
        int angka = 0;

        while(angka < 10 ){
            // ketika angka kurang dari 10 maka perulagan akan berjalan
            // sampai kondisi angka sudah terpenuhi
            // ia akan looping dimulai dari angka 0 1 2 3 4 5 6 7 8 9
            System.out.println(angka);
            // menambahkan operator penambahan agar tidak terjadi
            // looping infinite
            // angka akan bertambah 1 setiap looping
            angka++;
        }
    }
    
}
