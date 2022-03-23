package learn.basic.JavaScope;

// dalam java variabel hanya bisa diakses dalam region tertentu
// itu yang disebut dengan scope
//
// variabel di deklarasi harus terlebih dahulu sebelum memanggilanya
// sebagai contoh dibawah ini


public class JavaScope{
  public static void main(String[] args){
    // di daaerah ini dimana variable AngkaSaya
    // tidak bisa di output sebelum di buat terlebih dahulu
    // jika dipanggil maka akan terjadi error
    

    int AngkaSaya = 120;
    
    // variabel AngkaSaya bisa dipanggil karena sudah dibuat berupa tipe data
    // dan valuenya
    System.out.println(AngkaSaya);
  } 
}

