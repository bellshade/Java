package learn.basic.MathJava;

// java math memiliki beberapa metode yang sangat berguna
// dalam menghitung suatu fungsi matematika.

public class MathJava {
    public static void main(String[] args){
        int angka = 120;
        int angka_kedua = 81;
        double angkaBerkoma = 15.5;

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

        // PI
        // Mengoutput nilai PI
        System.out.println(Math.PI);

        // Round(Angka)
        /* Untuk membulatkan angka desimal ke angka integer terdekat.
        Jika angka dibelakang koma >=5 maka akan dibulatkan keatas, angka +1 dan desimal hilang.
        Jika angka dibelakang koma <5 maka akan dibulatkan kebawah, angka dibelakang koma dihilangkan.
         */
        System.out.println(Math.round(angkaBerkoma));

    }
}
