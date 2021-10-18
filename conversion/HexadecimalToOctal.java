/*
    Untuk mengubah Hexadecimal ke Octal ada 2 langakah
    1. Ubah hexadecimal ke Decimal
    2. Ubah Decimal hasil step 1 ke Octal
 */

public class HexadecimalToOctal {

    /**
     * fungsi yang akan merubah dari bilangan desimal ke oktal
     * @param desimal int
     * @return int
     */
    public static int desimalToOctal(int desimal) {

        int oktal = 0, modSisa = 0, power = 0;

        // ulangi hingga nilai desimal tidak tersisa
        while(desimal > 0){

            // Ambil sisa dari pembagian nilai desimal dibagi 8
            modSisa = desimal % 8;

            // hasil nilai desimal dibagi 8
            desimal /= 8;

            // Conversi ke oktal
            oktal += modSisa * (int) (Math.pow(10,power++));
        }

        return oktal;
    }

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
        int desimal = hexToDecimal("1BC");
        System.out.println(desimalToOctal(desimal)); // Output : 674
    }
}
