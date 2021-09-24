// ingat pada tipe casting
// otomatis hanya dari yang terkecil ke terbesar
// sedangkan yang terbesar yang terkecil harus manua;
// contoh disini

// integer => float  contoh otomatis
// float => integer contoh manual

public class ManualCasting {
    public static void main(String[] args){
        // pada kasus ini kita akan merubah data tipe floating atau berkoma
        // ke bilangan integer
        float angka = 3.78f;
        int angka_dirubah = (int) angka;
        
        System.out.println(angka); // 3.78
        System.out.println(angka_dirubah); // 3

        
        // contoh lain

        // double angka = 3.78f;
        // int angka_dirubah = (int) angka;

        // System.out.println(angka); // 3.78
        // System.out.println(angka_dirubah); // 3
    }    
}
