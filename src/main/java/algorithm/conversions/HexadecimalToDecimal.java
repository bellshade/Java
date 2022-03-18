package algorithm.conversions;
/*
    Perhitungan jika dilakukan secara manual
    Dalam Heksa: 198B
    rumus : (a * 16^n-1 )
        dimana: `a` adalah digit angka Heksadesimal (urutan dari KIRI ke KANAN)
                `n-1` adalah nilai pangkat (`n` dimulai dari `panjang digit angka Heksadesimal` dan berkurang 1 tiap berpindah ke KANAN)
                    `panjang digit angka Heksadesimal` = 4 maka 4 - 1 = 3
                    maka pangka dimulai dengan nilai 3
    
    maka konversi ke Desimal: 198B -> (1 * 16^3 ) + (9 * 16^2 ) + (8 * 16^1 ) + (B * 16^0 )  = 6539
    karena B adalah 11 maka
            (1 * 16^3 ) + (9 * 16^2 ) + (8 * 16^1 ) + (11 * 16^0 ) = 6539
 */

public class HexadecimalToDecimal {

    /**
     * fungsi yang akan mengubah dari bilangan Hexadecimal ke Decimal
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

            // Mendapat satu karakter dari digit angka heksadesimal yang akan dikonversi
            char charHexToConvert = hex.charAt(idx);

            // Konversi ke desimal dengan cara mencari index karakter heksa di variabel `hexChar`
            // Untuk mengatasi konversi digit `ABCDEF` ke angka desimal
            int konversiHex = hexChar.indexOf(charHexToConvert);

            // Konversi dengan rumus (a * 16^n-1 )
            // Karena setiap pindah digit ke kanan selalu berkurang 1, maka `Panjang digit angka Heksadesimal` selalu dikurangi nilai index perulangan
            desimal += konversiHex* (int) (Math.pow(16,lenHex-idx-1));
        }

        return desimal;
    }

    public static void main(String[] args) {
        System.out.println(hexToDecimal("198B")); // Output : 6539
    }
}