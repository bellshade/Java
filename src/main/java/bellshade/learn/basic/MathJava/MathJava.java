package bellshade.learn.basic.MathJava;

// java math memiliki beberapa metode yang sangat berguna
// dalam menghitung suatu fungsi matematika.

public class MathJava {
    public static void main(String[] args){
        int angka = 120;
        int angka_kedua = 81;

        // max(angka, angka)
        // mencari nilai tertinggi dari kedua angka
        System.out.println(Math.max(angka, angka_kedua));

        // min(angka, angka)
        // mencari nilai terendah dari kedua angka
        System.out.println(Math.min(angka, angka_kedua));

        // abs(angka)
        // mencari nilai absolut dari angka
        System.out.println(Math.abs(-20.2));

        // sqrt(angka)
        // mencari nilai akar dari angka
        System.out.println(Math.sqrt(angka_kedua));

        // pow(angka1, angka)
        // memangkatkan angka pertama dengan angka kedua
        System.out.println(Math.pow(5, 2));

        // log(angka)
        // mencari nilai logaritma dari angka
        System.out.println(Math.log(angka_kedua));
    }    
}
