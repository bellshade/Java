package learn.basic.Recursive;

// Fungsi Rekursi atau Recursive Function adalah fungsi yang melakukan pemanggilan terhadap dirinya sendiri
// Sebuah Fungsi Rekursi memiliki 2 bagian utama
//  1. Base case, dimana pemanggilan rekursi berhenti karena mencapai sebuah keadaan yang mengembalikan nilai tanpa membutuhkan pemanggilan rekursi
//  2. Langkah rekursi atau recursion step, adalah pemanggilan fungsi kembali dengan kompleksitas yang semakin berkurang hingga akhirnya mengarah menuju base case
// Contoh paling populer dari Fungsi Rekursi adalah bilangan Fibonacci (0,1,1,2,3,5,...)

public class Recursive {
    // Fungsi untuk menghasilkan bilangan fibonacci ke n
    // @param n sebuah bilangan bulat yang mewakili index bilangan Fibonacci
    // @return sebuah bilangan bulat dalam deret bilangan Fibonacci
    public static int fib(int n){

        // Base Case: base casenya adalah ketika fib(0) dan fib(1)
        // Karena bilangan fib(0) dan fib(1) adalah bilangan Fibonacci paling sederhana 
        // yang tidak disusun oleh bilangan lainnya
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        // Recursion Step: pemanggilan rekursi dilakukan untuk menyederhankan permasalahan 
        // dan mengarahkan masalah menuju base case
        // Pada baris dibawah dilakukan pemanggilan kembali terhadap fungsi fib(n) disesuaikan dengan algoritme bilangan Fibonacci f(n) = f(n-1) + f(n-2)
        // Sebagai contoh, bilangan Fibonacci ke 4 [f(4)] adalah hasil penjumlahan dari bilangan Fibonacci ke 2 [f(2)] dan ke 3 [f(3)]
        // Maka f(4) = f(2) + f(3). Kemudian f(3) adalah f(1) + f(2) dan seterusnya hingga base case f(0) dan f(1) tercapai.
        return fib(n-1) + fib(n-2);
    }

        public static void main(String []args){
        // Mencetak bilangan fibonacci ke 4
        // Output: 3
        System.out.println(fib(4));

        // Mencetak bilangan fibonacci ke 1
        // Output: 1
        System.out.println(fib(1));

        // Mencetak bilangan fibonacci ke 10
        // Output: 55
        System.out.println(fib(10));
    }

}

