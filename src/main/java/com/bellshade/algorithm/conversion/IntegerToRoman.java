package com.bellshade.algorithm.conversion;
/*
    Logika dari mengubah Integer ke Romawi adalah
    Membandingkan `nilai Integer` dengan `nilai karakter romawi yang lebih kecil terdekat`
 */

public class IntegerToRoman {

    /**
     * fungsi yang akan merubah dari Integer ke romawi
     * @param angka {@code int}
     * @return {@code String}
     */
    public static String integerToRoman(int angka) {
        String romawi[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int nilai[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int idx = romawi.length - 1;
        String romawiHasil = "";
        
        // Ulangi hingga `angak` bernilai 0
        while(angka>0){

            // Membandingkan `angka` dengan `nilai karakter romawi`
            // cari `nilai karakter romawi` yang lebih kecil terdekat
            while(nilai[idx]<=angka){

                // Gabungkan karakter romawi
                romawiHasil += romawi[idx];

                // Kurangi `angka` dengan `nilai karakter romawi` yang ditemuka
                angka -= nilai[idx];
            }
            // Untuk memindah index ke `nilai karakter romawi` selanjutnya
            idx--;
        }
        return romawiHasil;
    }
    public static void main(String[] args) {
        System.out.println(integerToRoman(1998)); // output : MCMXCVIII
    }
}
