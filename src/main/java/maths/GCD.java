package math;

/*
* program sederhana untuk menghitung faktor
* persekutuan terbesar
*/

public class GCD {
    /*
    * @param angka1 parameter angka pertama
    * @param angka2 parameter angka kedua
    * @return hasil persekutuan terbesar
    */

    public static int gcd(int angka1, int angka2) {
        if (angka1 < 0 || angka2 < 0) {
            // cek jika angk minus
            throw new ArithmeticException();
        }
        
        if (angka1 == 0 || angka2 == 0) {
            return Math.abs(angka1 - angka2);
        }

        while (angka1 % angka2 != 0) {
            int reminder = angka1 % angka2;
            angka1 = angka2;
            angka2 = reminder;
        }
        
        return angka2;
    }

    /*
    * membuat hasil dari fungsi static fungsi perseketuan
    * terbesar
    */
    
    public static int gcd(int[] angka) {
        int hasil = angka[0];
        for (int i = 1; i < angka.length; i++) {
            hasil = gcd(hasil, angka[i]);
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] arraySaya = {4, 16, 32};

        System.out.println(gcd(arraySaya));

         System.out.format("gcd(40,24) = %d\n",gcd(40, 24));
    }
}
