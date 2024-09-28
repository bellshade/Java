package algorithm.conversions;

public class BinaryToDecimal{
  private static final int BASE_BINER = 2;
  
  private BinaryToDecimal() {

  }

  /**
   * fungsi mengubah angka biner ke angka desimal
   * 
   * @param angkaBiner angka biner yang akan dikonversikan
   * @return hasil dari konversi angka biner ke angka desimal
   * @throws IllegalArgumentException ini terjadi jika angka biner tidak terdapat angka 0 atau 1
   */

   public static long binerKeDesimal(long angkaBiner) {
    long valueDesimal = 0;
    long pangkat = 0;
    
    while (angkaBiner != 0) {
      long digit = angkaBiner % 10;
      if (digit > 1) {
        throw new IllegalArgumentException("angka biner tidak benar: " + digit);
      }
      valueDesimal += (long) (digit * Math.pow(BASE_BINER, pangkat++));
      angkaBiner /= 10;
    }
    return valueDesimal;
   }
}
