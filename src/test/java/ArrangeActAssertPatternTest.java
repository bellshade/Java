import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/*
 * Arrange/Act/Assert (AAA) adalah sebuah design pattern untuk menulis sebuah unit tests dengan rapi.
 * Tujuannya agar unit tests lebih mudah dibaca dan dimantain.

 * <p>Cara penulisannya yaitu test dipisah menjadi 3 step :
 * <p>1. Arrange: Lakukan setup seperti inisialisasi variabel, service, dll.
 * <p>2. Act: Aksi untuk menjalankan test tersebut.
 * <p>3. Assert: Verifikasi hasil dari test yang dijalankan.
 * <p>MASING-MASING BAGIAN DIPISAHKAN DENGAN SPASI
 */

/*
 * Selain itu penulisan nama method unit tests juga bisa dibuat lebih rapi.
 * Cara penulisannya dibagi menjadi 3, yang dibatasi dengan underscore(_) :
 * 1. Kalimat pertama adalah nama method yang dipanggil
 * 2. Kalimat kedua adalah apa hasil yang diharapkan saat method tersebut dipanggil (diawali dengan kata SHOULD)
 * 3. Kalimat ketiga adalah kondisi ketika method tersebut dipanggil (diawali dengan kata WHEN)
 */

class ArrangeActAssertPatternTest {
  @Nested
  @DisplayName("Unit test dengan pattern AAA")
  class AAATest {
    @Test
    void addition_shouldReturn5_whenFirstNumberIs2AndSecondNumberIs3() {
//    ARRANGE
      int firstNumber = 2;
      int secondNumber = 3;
      int expectedResult = 5;

//    ACT
      int actualResult = addition(firstNumber, secondNumber);

//    ASSERT (catatan: assertions bisa lebih dari 1, tergantung dari kondisi yang mau diverifikasi)
      Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reduction_shouldReturn0_whenFirstNumberIs5AndSecondNumberIs5() {
//    ARRANGE
      int firstNumber = 5;
      int secondNumber = 5;
      int expectedResult = 0;

//    ACT
      int actualResult = reduction(firstNumber, secondNumber);

//    ASSERT (catatan: assertions bisa lebih dari 1, tergantung dari kondisi yang mau diverifikasi)
      Assertions.assertEquals(expectedResult, actualResult);
    }
  }

  @Nested
  @DisplayName("Unit test tidak menerapkan pattern AAA dan penamaan kurang baik")
  class NotAAATest {
    /*
    Ini merupakan contoh unit test yang kurang baik. Dari nama test kita tidak bisa langsung tahu ekspektasi hasil yang diharapkan.
    Tidak ada spasi seperti di pattern AAA, yang dapat membuat agak bingung jika sudah sangat kompleks untuk membedakan mana inisialisasi,
    mana pemanggilan method, dan mana assertions.
    Untuk unit tests juga sebaiknya jangan digabung ada 2 method seperti dibawah ini, sebaiknya dibuatkan test case terpisah.
     */
    @Test
    void testAritmatika() {
//    Inisialisasi
      int angka1 = 8;
      int angka2 = 4;
//    Test pertambahan
      int hasil1 = addition(angka1, angka2);
      Assertions.assertEquals(12, hasil1);
//    Test pengurangan
      int hasil2 = reduction(angka1, angka2);
      Assertions.assertEquals(4, hasil2);
    }
  }

  /* Ini adalah method untuk melakukan pertambahan.
  menerima 2 parameter dengan tipe data integer.
  Kemudian angka dari parameter tersebut dijumlahkan dan hasilnya dikembalikan.
   */
  public int addition(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  /* Ini adalah method untuk melakukan pengurangan.
  menerima 2 parameter dengan tipe data integer.
  Kemudian angka dari parameter tersebut dikurangkan dan hasilnya dikembalikan.
  */
  public int reduction(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }
}
