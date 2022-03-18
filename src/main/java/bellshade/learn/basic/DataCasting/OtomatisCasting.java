package bellshade.learn.basic.DataCasting;

// ingat pada tipe casting
// otomatis hanya dari yang terkecil ke terbesar
// contoh disini

// integer => float

public class OtomatisCasting{
    public static void main(String[] args){
        // pada kasus ini kita akan merubah data tipe integer
        // ke bilangan floating atau berkoma

        int angka = 20;
        float angka_dirubah = angka;

        // 20
        System.out.println(angka);
        
        //20.0
        System.out.println(angka_dirubah);

        // contoh lain
        // byte angka = 10;
        // double angka_dirubah = angka;

        // 10
        // System.out.println(angka);
        
        //10.0
        // System.out.println(angka_dirubah);
    }
}