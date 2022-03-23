package algorithm.conversions;
 /*
    Perhitungan jika dilakukan secara manual
    Dalam Oktal: 167
    rumus : (a * 8^n-1 )
        dimana: `a` adalah digit angka Okta (urutan dari KANAN ke KIRI)
                `n-1` adalah nilai pangkat (`n` dimulai dari `0` dan bertambah 1 tiap berpindah ke KIRI)
    
    maka konversi ke Desimal: 167 -> (7 * 8^0 ) + (6 * 8^1 ) + (1 * 8^2 ) = 119
    
*/

public class OctalToDecimal {

    /**
     * fungsi yang akan mengubah dari bilangan Octal ke Decimal
     * @param angka {@code int}
     * @return desimal {@code int}
     */
    public static int octalToDecimal(int angka) {
        int modSisa, desimal = 0,power = 0;

        // ulangi hingga hasil dari `bilangan oktal modular 10` tidak lebih dari 0
        while(angka > 0){

            // mendapat angka digit paling belakang (paling KANAN) dari bilangan Oktal
            modSisa = angka % 10;

            // Konversi oktal >> desimal
            // (a * 8^n-1 )
            // power (sebagai nilai pangkat) bertambah 1 setelah `Konversi` dilakukan
            desimal += modSisa * (int) (Math.pow(8,power++));

            // untuk mendapat digit ke 2 dst. paling belakang (Paling KANAN) dari bilangan oktal
            // Bagi bilangan oktal dengan angka 10
            angka /= 10;
        }
        return desimal;
    }
    public static void main(String[] args) {
        System.out.println(octalToDecimal(167)); // Output : 119
    }
}