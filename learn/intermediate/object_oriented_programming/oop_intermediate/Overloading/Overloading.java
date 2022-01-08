//Overloading
//sebagai contoh, disini ada sebuah class dengan nama "SegitigaSamaSisi" yang 
//berisi beberapa method dengan nama yang sama

//kita buat class segitiga sama sisi
class SegitigaSamaSisi{

    //kita buat method hitung yang pertama, dengan memasukan 2 variabel.
    //method ini untuk menghitung luas dari segitiga
    void hitung(int alas, int tinggi){
        double luas = alas * 0.5 * tinggi;
        System.out.println("Luas Segitiga : "+luas);
    }

    //kita buat method hitung yang kedua, dengan memasukan 1 variabel.
    //method ini untuk menghitung keliling dari segitiga
    void hitung(int sisi){
        int keliling = sisi * 3;
        System.out.println("Keliling Segitiga : "+keliling);
    }

    //lalu method yang terakhir tidak menerima parameter apa apa
    void hitung(){
        System.out.println("Tidak ada operasi perhitungan karena parameter kosong");
    }
}

//lalu kita buat main class untuk menjalankannya
class Overloading {
    public static void main(String[] asc){
        //deklarasi object dari SegitigaSamaSisi ke dalam variabel s1
        SegitigaSamaSisi s1 = new SegitigaSamaSisi();

        //memanggil method tanpa parameter 
        s1.hitung();
        
        //memanggil method dengan 1 parameter
        s1.hitung(10);

        //memanggil method dengan 2 parameter
        s1.hitung(10, 5);
        
    }
} 