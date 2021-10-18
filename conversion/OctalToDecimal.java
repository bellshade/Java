
/*
    Perhitungan jika dilakukan secara manual
    Dalam Oktal: 167
    Dalam Desimal: (7 * 8^0 ) + (6 * 8^1 ) + (1 * 8^2 ) = 119

    ### Logika yang saya pakai
    1. Untuk mendapat angka belakang dari bil. oktal saya menggunakan Modular 10
        `167 % 10 = 7`
    2. Setalah itu masukan ke rumus konsversi
        `(7 * 8^0 )`
    3. Untuk mendapat `digit angka ke 2 dari belakang`, bari dengan 10
    4. ulangi hingga nilai modular 10 tidak lebih dari 0
 */

public class OctalToDecimal {

    /**
     * fungsi yang akan merubah dari bilangan Octal ke Decimal
     * @param angka {@code Integer}
     * @return desimal {@code Integer}
     */
    public static Integer octalToDecimal(int angka) {
        int modSisa, desimal = 0,power = 0;

        // ulangi hingga nilai modular 10 tidak lebih dari 0
        while(angka > 0){

            // mendapat angka digit paling belakang dari bil. oktal
            modSisa = angka % 10;

            // Konversi oktal >> desimal
            desimal += modSisa * (int) (Math.pow(8,power++));

            // untuk mendapat digit paling belakang ke 2 dst. dari bil. oktal
            // stelah Konversi oktal >> desimal selesai
            angka /= 10;
        }
        return desimal;
    }
    public static void main(String[] args) {
        System.out.println(octalToDecimal(167)); // Output : 119
    }
}
