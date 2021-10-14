// pada java lebih dari 1 method bisa menggunakan nama yang sama
// dengan jumlah atau tipe data parameter yang berbeda


public class MethodOverloading {


    static void kenalan(String namaSaya){
        System.out.println("Hai nama ku "+ namaSaya+", Salam kenal");
    }

    static void kenalan(String namaSaya, String namaTeman){
        System.out.println("Hai salam kenal "+namaTeman+", nama ku "+ namaSaya);
    }

    public static void main(String[] args){

        // 2 baris kode dibawah sama-sama memanggil method `kenalan()` tetapi menghasilkan output yang berbeda
        // karena compiler membaca method sesuai dengan paramter yang di masukan di tiap method `kenalan()`

        // memanggil fungsi `kenalan()` dengan 1 parameter
        kenalan("Sandhika");
        // Output : Hai nama ku Sandhika, Salam kenal

        // memanggil fungsi `kenalan()` dengan 2 parameter
        kenalan("Sandhika","Doddi");
        // Output : Hai salam kenal Doddi, nama ku Sandhika
    }
}
