/**
 * contoh dari implementasi pada math.floor pada java
 * jika nilai koma diatas .5 maka tambah satu bilangan bulatnya +1
 * jika dibawah .5 atau sama maka angka bulatnya tetap
 * seperti contoh
 * 5.6 = 6
 * 5.4 = 5
 */

package bellshade.maths;

import java.util.Random;

public class Floor {
    public static void main(String[] args){
        Random random = new Random();
        double angka = 30.5;
        for (int i = 1; i <= 1000; ++i) {
            double angkaAcak = random.nextDouble();
            assert floor(angkaAcak) == Math.floor(angkaAcak);
        }
        System.out.println(floor(angka));
    }

    /**
     * 
     * @param angka angka koma
     * @return mengembelaikan angka double yang tedekat
     * {@code angka}
     */
    public static double floor(double angka) {
        if (angka - (int) angka == 0) {
            return angka;
        } else if (angka - (int) angka > 0) {
            return (int) angka;
        } else {
            return (int) angka - 1;
        }
    }
}