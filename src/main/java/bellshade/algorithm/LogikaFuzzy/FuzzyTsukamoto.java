package bellshade.algorithm.LogikaFuzzy;
public class FuzzyTsukamoto {

    //Variable untuk inputan permintaan dan persediaan yg diinginkan
    //Silahkan inputkan nilai disini
    static int permintaan = 800;
    static int persediaan = 1700;
    
//Inisialisasi Fungsi Keanggotaan Permintaan
    int permintaan_satu = 250;
    int permintaan_dua = 500;
    int permintaan_tiga = 1000;
    int permintaa_empat = 1250;
    
//Inisialisasi Fungsi Keanggotaann Persediaan
    int persediaan_satu = 600;
    int persediaan_dua = 1000;
    int persediaan_tiga = 1800;
    int persediaan_empat = 2400;

//Inisialisasi Fungsi Keanggotaan Produksi
    int produksi_satu = 400;
    int produksi_dua = 600;
    int produksi_tiga = 1100;
    int produksi_empat = 1500;

    static double  [] alpha = new double [4] ;
    static double  [] z = new double [4] ; 
    static double  [] az = new double [4] ; 
    static double total_alpha;
    static double total_az;
    static double rekomendasi_produksi;
    
//Pembuatan Method untuk perhitungan nilai keanggotaan (Miu)
//Pertama method method untuk nilai keanggota Permintaan
    
    public double permintaanSedikit(double x){       
        double miu = 0;
        int selisih_permintaan = permintaan_tiga - permintaan_dua;
        if( x <= permintaan_dua){
            miu = 1 ;
        } else if (x > permintaan_dua && x < permintaan_tiga) {
            miu = (permintaan_tiga - x) / selisih_permintaan ;
        } else miu = 0; 
      return miu;
    }

    public double permintaanBanyak(double x){       
        double miu = 0;
        int selisih_permintaan = permintaan_tiga - permintaan_dua;
        if( x >= permintaan_tiga){
            miu = 1 ;
        } else if (x > permintaan_dua && x < permintaan_tiga) {
            miu = (x - permintaan_dua) / selisih_permintaan ;
        } else miu = 0; 
      return miu;
    }

    public double persediaanSedikit(double x){       
        double miu = 0;
        int selisih_persediaan = persediaan_tiga - persediaan_dua;
        if( x <= persediaan_dua){
            miu = 1 ;
        } else if (x > persediaan_dua && x < persediaan_tiga) {
            miu = (persediaan_tiga - x) / selisih_persediaan ;
        
        } else miu = 0; 
      return miu;
    }

    public double persediaanBanyak(double x){       
        double miu = 0;
        int selisih_persediaan = persediaan_tiga - persediaan_dua;
        if( x >= persediaan_tiga){
            miu = 1 ;
        } else if (x > persediaan_dua && x < persediaan_tiga) {
            miu = (x - persediaan_dua) / selisih_persediaan ;
        } else miu = 0; 
      return miu;
    }

    //Pembuatan Method 
    //1. penentuan nilai alpha predikat
    //2. Perhitungan Defuzzy
    public void alphaPredikat (){
        
        FuzzyTsukamoto run = new FuzzyTsukamoto();

        //Alpha Perdikat didapatkan dari nilai Minimum dari perbandingan nilai keanggotaan (miu) 
        //
        alpha [0] = Math.min(run.permintaanSedikit(permintaan), run.persediaanSedikit(persediaan));
        alpha [1] = Math.min(run.permintaanSedikit(permintaan), run.persediaanBanyak(persediaan));
        alpha [2] = Math.min(run.permintaanBanyak(permintaan), run.persediaanSedikit(persediaan));
        alpha [3] = Math.min(run.permintaanBanyak(permintaan), run.persediaanBanyak(persediaan));        

        //Perulangan untuk mendapatkan nilai total dari alpha predikat
        for (int i = 0; i < alpha.length; i++) {
            total_alpha += alpha[i];
        }
    }
    
    //Method untuk menghitung Deffuzifikasi (z) pada grafik Produksi
    public void defuzzyfikasiProduksi () {
        int selisih_produksi = produksi_tiga - produksi_dua;

        //Produksi Sedikit
        z[0] = produksi_tiga - (alpha[0] * selisih_produksi);
        z[1] = produksi_tiga - (alpha[1] * selisih_produksi);

        //Produksi Banyak
        z[2] = produksi_dua + (alpha[2] * selisih_produksi);
        z[3] = produksi_dua + (alpha[3] * selisih_produksi);
    }

    //Method untuk menghitung alphaPredikat x Defuzzyfikasi (Z)
    //Dan menghitung total dari alphaPredikat x Defuzzyfikasi (Z)

    public void hitungAlphaz () {

        //Melakukan Perhitungan perkaalian alpha x z disetiap rulesnya
        for (int i = 0; i < alpha.length; i++) {
            az[i] = alpha[i] * z[i];
        }

        //Menghitung Total alpha x z
        for (int i = 0; i < az.length; i++){
            total_az += az[i];
        }
    }

    //Method penentuan rekomendasi produksi sesuai Metode Fuzzy Tsukamoto
    public void penentuanProduksi (){
        rekomendasi_produksi = total_az / total_alpha;
    }

    //Mthod memanggil step-step terurut perhitungan metode Fuzzy Tsukamoto
    public void jalankanPerhitungan () {
        FuzzyTsukamoto run = new FuzzyTsukamoto();

        //1. Perhitungan Nilai keanggotaan (miu)
        //Baris Data Pertaman
        System.out.print("Sedikit : ");
        System.out.print(run.permintaanSedikit(permintaan));
        System.out.print("\t Sedikit : ");
        System.out.print(run.persediaanSedikit(persediaan));
        System.out.println("\t \t Sedikit");

        //Baris Data ke dua
        System.out.print("Sedikit : ");
        System.out.print(run.permintaanSedikit(permintaan));
        System.out.print("\t Banyak : ");
        System.out.print(run.persediaanBanyak(persediaan));
        System.out.println("\t \t Sedikit");

        //Baris Data ke tiga
        System.out.print("Banyak : ");
        System.out.print(run.permintaanBanyak(permintaan));
        System.out.print("\t Sedikit : ");
        System.out.print(run.persediaanSedikit(persediaan));
        System.out.println("\t \t Banyak");

        //Baris Data ke empat
        System.out.print("Banyak : ");
        System.out.print(run.permintaanBanyak(permintaan));
        System.out.print("\t Banyak : ");
        System.out.print(run.persediaanBanyak(persediaan));
        System.out.println("\t \t Banyak");

        //2. Penentuan Alpha Predikat dari setiap baris rules
        run.alphaPredikat();
        //3. Perhitungan Defuzzyfikasi Produksi
        run.defuzzyfikasiProduksi();
        //4. Perhitungan nilai Alpha Predikat x Defuzzyfikasi Produksi
        run.hitungAlphaz();
        //5. Hasil Akhir rekomendasi produksi
        run.penentuanProduksi();

        
    }
    
    
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        FuzzyTsukamoto runing = new FuzzyTsukamoto();     
        
        System.out.println("Implementasi Sederhana Fuzzy Tsukamoto");
        System.out.println("Case - Penentuan Jumlah Produksi Barang");
        
        System.out.print("Jumlah Permintaan : " + permintaan);
        System.out.print("Jumlah Persediaan : " + persediaan);
        System.out.println("\n \t ----------- Penerapan Rules ---------------- ");

        //Baris Judul Rules Fuzzy Tsukamoto
        System.out.print("Permintaan");
        System.out.print("\t Persediaan");
        System.out.println("\t \t Produksi");

        runing.jalankanPerhitungan();
        System.out.println();
        System.out.print("a predikat");
            System.out.print("\t Defuzzyfikasi (z)");
            System.out.println("\t a x z");
        for (int i = 0; i <alpha.length; i++){
            System.out.print(alpha[i]);
            System.out.print("\t \t " + z[i]);
            System.out.println("\t \t \t " + az[i]);
        }
        System.out.println();
        System.out.println("Total Alpha x Z : " + total_az);
        System.out.println("Total Alpha Predikat : " + total_alpha);
        System.out.println("Rekomendasi Produksi : " + rekomendasi_produksi);
        
    }
}
