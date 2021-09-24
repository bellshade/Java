// operator pada java adalah
// + = tambah
// - = kurang
// * = kali
// / = bagi
// % = modulus
// ++ = increment
// -- = decrement

public class Aritmatika {
    public static void main(String[] args){
        int tambah = 2 + 2;
        int kurang = 5 - 2;
        int kali = 5 * 2;
        int bagi = 10 / 5;
        int modulus = 10 % 5;
        int angka = 2;
        

        // pertambahan
        System.out.println(tambah);

        // pengurangan
        System.out.println(kurang);
        
        // perkalian
        System.out.println(kali);
        
        // pembagian
        System.out.println(bagi);
        
        // sisa bagi
        // misalnya 10 / 5
        // karena
        // 10 - 5 = 5
        // 5 - 5 = 0
        // maka akan menampilkan hasil bagi yaitu 0
        System.out.println(modulus);

        // operator penambahan, ++2 yang berarti 1 + 2, jika +++2 maka error
        System.out.println(++angka);
        
        // operator pengurangan --2 yang berarti 1 -2, jika ---2 maka error
        System.out.println(--angka);

    }
}
