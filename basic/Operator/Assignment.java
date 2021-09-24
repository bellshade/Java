// operator assignment adalah operator 
// yang mereferensi variabel yang akan di operasikan
// dengan nilai yang diberikan.

// contoh
// x = 2
// x += 5 
// maka sama dengan 2 + 5 maka hasilnya adalah 7


// +----------------+-------------------+------------+
// | jenis operator | contoh penggunaan | penjelasan |
// +----------------+-------------------+------------+
// | =              | x = 5             | x = 5      |
// | +=             | x += 3            | x = x + 3  |
// | -=             | x -= 3            | x = x - 3  |
// | *=             | x *= 3            | x = x * 3  |
// | /=             | x /= 3            | x = x / 3  |
// | %=             | x %= 3            | x = x % 3  |
// | &=             | x &= 3            | x = x & 3  |
// | |=             | x |= 3            | x = x | 3  |
// | ^=             | x ^= 3            | x = x ^ 3  |
// | >>=            | x >>= 3           | x = x >> 3 |
// | <<=            | x <<= 3           | x = x << 3 |
// +----------------+-------------------+------------+


public class Assignment {
    public static void main(String[] args){
        int angka = 5;
        
        // penambahan 
        System.out.println(angka += 3);
        
        // pengurangan
        System.out.println(angka -= 3);

        // perkalian
        System.out.println(angka *= 3);

        // pembagian
        System.out.println(angka /= 3);

        // sisa bagi
        System.out.println(angka %= 3);

        // bitwise AND
        System.out.println(angka &= 3);

        // bitwise OR
        System.out.println(angka |= 3);

        // bitwise XOR
        System.out.println(angka ^= 3);

        // bitwise right shift
        System.out.println(angka >>= 3);

        // bitwise left shift
        System.out.println(angka <<= 3);
    }
}
