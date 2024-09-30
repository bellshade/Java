package maths;

public class AngkaArmstrong {
  /**
   * Mengecek angka yang dimana angka tersebut angka itu armstrong atau tidak
   *
   * @param angka angka yang di cek
   * @return {@code true} jika nilai yang diberikan adalah angka amstrong
   */
  public boolean adalahArmstrong(int angka) {
    long hasil = 0;
    String temp = Integer.toString(angka);
    int pangkat = temp.length();
    long angkaOriginal = angka;

    // perulangan akan berjalan selama angkaOriginal lebih besar dari 0
    while (angkaOriginal > 0) {
      // mengambil digit terakhir dari angkaOriginal
      long digit = angkaOriginal % 10;
      // menambahkan hasil pangkat dari digit ke variabel 'hasil'
      // Math.pow() digunakan ini untuk menghitung digit pangkat
      hasil += (long) Math.pow(digit, pangkat);
      // menghapus digit terakhir dari angkaOriginal
      angkaOriginal /= 10;
    }

    // membandingkan hasil dengan angka asli
    // jika sama maka angka adalah bilangan armstrong
    return hasil == angka;
  }
}
