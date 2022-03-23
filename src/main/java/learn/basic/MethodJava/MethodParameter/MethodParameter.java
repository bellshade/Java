package learn.basic.MethodJava.MethodParameter;

// method pada java bisa menggunakan parameter atau value untuk
// melakukan beberapa operasi atau menampilkan value
// bisa menggunakan tipe data jenis apapun


public class MethodParameter{
  // menggunakan parameter tanpa ada nilai kembali
  static void NamaSiswa(String nama, int umur){
    System.out.println(nama + " berumur " + umur);
  }

  // menggunakan parameter dengan operasi dan mengembalikan hasil poerasi
  static int Pertambahan(int Angka1, int Angka2){
    return Angka1 + Angka2;
  }

  // memanggil kedua fungsi parameter

  public static void main(String[] args){
    // memanggil fungsi tanpa nilai kembali
    NamaSiswa("joes", 21);

    // memanggil fungsi yang menggunakan nilai kembali
    System.out.println(
      "hasil pertambahan adalah " +
      Pertambahan(3, 5)
    );

    // memanggil fungsi untuk digunakan kembalia
    System.out.println(
      "hasil pertambahan lain " +
      Pertambahan(3, 20)
    );
  }
}
