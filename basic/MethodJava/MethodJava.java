// method atau yang bisa disebut dengan fungsi adalah salah satu
// fungsi dimana suatu statement dapat dipanggil secara berulang
// tanpa harus membuat terlebih dahulu
//
// method harus dikerjakan di dalam class
// dalam method, bisa menggunakan jenis banyak statement
// dan bisa dipanggil secara berkali kali
// 
// PanggilSaya merupakan salah satu nama dari fungsi / method
// void merupakan method yang tidak mengambalikan nilai apapun

public class MethodJava{
  // contoh dari membuat dan memanggil sebuah method atau fungsi
  static void PanggilSaya(){
    // membuat output dari fungsi berupa 'hello teman'
    System.out.println("hello teman!");
  }
  // membuat fungsi lain berupa menyapa
  static void SapaSaya(){
    System.out.println("bagaimana dengan harimu ?");
  }

  // membuat main statement untuk memanggil semua fungsi
  // atau hanya beberapa fungsi
  public static void main(String[] args){
    // contoh memanggil fungsi
    PanggilSaya();
    // conoth memanggil fungsi lainnya
    SapaSaya();

    // kita bisa memanggil secara berulang
    PanggilSaya();
    PanggilSaya();
    PanggilSaya();
    
  }
}

