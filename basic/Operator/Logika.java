// operator logika adalah operator 
// yang membandingkan dua buah variabel yang akan menghasilkan nilai boolean
// true atau false

// contoh
// a = 5;
// b = 3;
// a > b , maka hasilnya true
// a < b , maka hasilnya false

// a = 5;
// b = 3;
// +----------------+-------------------+------------+
// | jenis operator | contoh penggunaan | penjelasan |
// +----------------+-------------------+------------+
// | >              | a >  b            | true       |
// | >=             | a >= b            | true       |
// | <              | a <  b            | false      | 
// | <=             | a <= b            | false      |
// | ==             | a == b            | false      |
// +----------------+-------------------+------------+


public class Logika{
    public static void main(String[] args){
        int a = 10;
        int b = 10;

        // apakah a lebih dari b
        System.out.println(a > b);
        // apakah a lebih dari sama dengan b
        System.out.println(a >= b);
        // apakah a kurang dari b
        System.out.println(a < b);
        // apakah a kurang dari sama dengan b
        System.out.println(a <= b);
        // apakah a sama dengan b
        System.out.println(a == b);
    }
}