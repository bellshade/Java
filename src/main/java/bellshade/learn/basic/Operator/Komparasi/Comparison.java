package bellshade.learn.basic.Operator.Komparasi;

// operator comparsion atau operator perbandingan
// digunakan untuk membandingkan antara kedua value

// contoh penggunaan

// 200 > 2

// +----------+-----------------------------+------------+
// | operator |         penjelasan          | penggunaan |
// +----------+-----------------------------+------------+
// | ==       | sama dengan                 | x == y     |
// | !=       | tidak sama dengan           | x != y     |
// | >        | lebih besar dari            | x > y      |
// | <        | lebih kecil dari            | x < y      |
// | >=       | lebih besar atau sama dari  | x >= y     |
// | <=       | lebih kecil atau sama dari  | x <= y     |
// +----------+-----------------------------+------------+

public class Comparison {
    public static void main(String[] args){
        int angka = 10;
        int angka_kedua = 12;


        // angka == angka_kedua
        // false karena 10 tidak sama dengan 12
        System.out.println(angka == angka_kedua); // false

        // angka != angka_kedua
        // true karena 10 tidak sama dengan 12
        System.out.println(angka != angka_kedua); // true

        // angka > angka_kedua
        // false karena 10 tidak lebih besar dari 12
        System.out.println(angka > angka_kedua); // false

        // angka < angka_kedua
        // true karena 10 lebih kecil dari 12
        System.out.println(angka < angka_kedua); // true

        // angka >= angka_kedua
        // false karena 10 tidak lebih besar atau sama dengan 12
        System.out.println(angka >= angka_kedua); // false

        // angka <= angka_kedua
        // true karena 10 lebih kecil atau sama dari 12
        System.out.println(angka <= angka_kedua); // true
    }
}
