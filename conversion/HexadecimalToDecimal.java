
/*
    Perhitungan jika dilakukan secara manual
    Dalam Heksa: 198B
    Dalam Desimal: (1 * 16^3 ) + (9 * 16^2 ) + (8 * 16^1 ) + (B * 16^0 ) = 65391
    karena B adalah 11 maka
            (1 * 16^3 ) + (9 * 16^2 ) + (8 * 16^1 ) + (11 * 16^0 ) = 653910
 */

public class HexadecimalToDecimal {

    /**
     * fungsi yang akan merubah dari bilangan Hexadecimal ke Decimal
     * @param hex String
     * @return int
     */
    public static int hexToDecimal(String hex) {

        // Ubah menjadi kapital
        hex = hex.toUpperCase();

        String hexChar = "0123456789ABCDEF";
        int desimal = 0, lenHex = hex.length();

        // Ulangi hingga semua digit heksadesimal selesai dikonversi
        for (int idx = 0; idx < lenHex; idx++ ){

            // Mendapat satu karakter heksadesimal yang akan dikonversi (secara berurutan)
            char charHexToConvert = hex.charAt(idx);

            // Konversi ke desimal dengan cara mencari index karakter heksa di variabel `hexChar`
            int konversiHex = hexChar.indexOf(charHexToConvert);

            // Konversi dengan rumus
            desimal += konversiHex* (int) (Math.pow(16,lenHex-idx-1));
        }

        return desimal;
    }

    public static void main(String[] args) {
        System.out.println(hexToDecimal("198B"));
    }
}
