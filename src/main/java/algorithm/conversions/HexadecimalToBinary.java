package algorithm.conversions;

/**
 * program sederhana cara mengubah angka heksadesimal
 * menjadi angka biner sebagai contoh
 * 7F menjadi 1111111
 */
class HexadecimalToBinary {
  private final int LONG_BIT = 8;

  public String konversi(String angkaHex) {
    int conHex = Integer.parseInt(angkaHex, 16);
    String binary = Integer.toBinaryString(conHex);
    return completeDigits(binary);
  }

  public String completeDigits(String angkaBiner) {
    for (int i = angkaBiner.length(); i  < LONG_BIT; i++) {
      angkaBiner = "0" + angkaBiner;
    }
    return angkaBiner;
  }

  public static void main(String[] args) {
    String[] angkaHeksadesimal = {
      "1",
      "A1",
      "ef",
      "BA",
      "AA",
      "BB",
      "19",
      "01",
      "02",
      "03",
      "04",
    };
    HexadecimalToBinary objectKonversi = new HexadecimalToBinary();
    for (String angka : angkaHeksadesimal) {
      System.out.println(angka + " = " + objectKonversi.konversi(angka));
    }
  }
}


