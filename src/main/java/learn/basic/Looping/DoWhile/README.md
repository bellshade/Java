# Do While

## Apa itu Do While?
Do-while adalah salah satu pernyataan pengulangan yang memungkinkan kita untuk membuat program berjalan secara fleksibel berdasarkan keinginan pengguna.

Do-while berfungsi untuk mengulangi pengeksekusian beberapa substatement berdasarkan conditional expression yang ada.

Do-while berbeda dengan pernyataan while. Do-while pertama kali akan mengeksekusi pernyataannya terlebih dahulu, setelah itu baru akan memeriksa conditional expression.

format penulisan
```java
do{
 sesuatu();
 
}while(kondisi);
```
## Kapankah Waktu yang Tepat Menggunakan while dan do/while?
Tergantung dari kasusnya. syarat perulangannya tidak berkaitan dengan hasil hitung pada blok kode yang diulang, maka pakailah while. Tetapi, bila syarat perulangannya berkaitan dengan hasil perhitungan di blok kode yang diulang, maka pakailah do/while.

Selain itu juga, jika kita menggunakan elemen semantik, dokumen HTML kita akan mudah dibaca, baik itu oleh mesin maupun oleh kita sebagai manusia.

Contoh kode java menggunakan perulangan Do While:
```java
public class DoWhile {
    public static void main(String[] args){
        int angka = 0;
        do{
            angka++;
            System.out.println(angka); // ekpetasi output: 1 2 3 4 5 6 7 8 9 10
        }
        while(angka < 10 );  
    }                   
}
```

Untuk lebih jelas program Looping `Do While` pada Java, kamu bisa langsung memperhatikan `source_code` nya [disini](https://github.com/bellshade/Java/blob/main/src/main/java/learn/basic/Looping/DoWhile/DoWhile.java)