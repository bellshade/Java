package bellshade.learn.basic.Operator.Logika;

// operator logika digunakan untuk membandingkan logika
// antara kedua value


// +----------+-------------+---------------------------------------------------------------+--------------------+
// | operator |    nama     |                          penjelasan                           |     penggunaan     |
// +----------+-------------+---------------------------------------------------------------+--------------------+
// | &&       | Logical and | Mengembalikan nilai true jika kedua pernyataan benar          | x < 5 &&  x < 10   |
// | ||       | Logical or  | Mengembalikan nilai true jika salah satu pernyataan benar     | x < 5 || x < 4     |
// | !        | Logical not | Membalikkan hasilnya, mengembalikan false jika hasilnya benar | !(x < 5 && x < 10) |
// +----------+-------------+---------------------------------------------------------------+--------------------+



public class Logical {
    public static void main(String[] args){
        int angka = 10;

        // operator &&
        // true krna angka lebih kecil dari 20 dan lebih besar dari 9
        System.out.println(angka > 9 && angka < 20);

        // operator ||
        // true krna angka lebih kecil dari 20 atau lebih besar dari 9
        System.out.println(angka > 9 || angka < 20);

        // operator !
        // false krna angka lebih besar dari 9
        System.out.println(!(angka > 9));
    }
}
