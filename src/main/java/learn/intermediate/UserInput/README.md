# Java User Input

_User Input_ adalah memasukkan sesuatu yang dilakukan oleh user / manusia baik itu perintah (Command), Click, dll. Untuk mengambil user input pada bahasa pemograman _Java_, kita bisa menggunakan kelas yang bernama ```Scanner```.  

## Cara Penggunaan

Pertama, kita buat sebuah object ```Scanner```, selanjutnya kita bisa gunakan metode-metode yang sudah disediakan oleh kelas ```Scanner``` untuk mengambil input berdasarkan tipe data masukannya. Metode tersebut bisa dilihat pada tabel dibawah.

| Metode        |              Deskripsi              |
|---------------|:-----------------------------------:|
| nextBoolean() | Membaca nilai bertipe ```boolean``` |
| nextByte()    |  Membaca nilai bertipe ```byte```   |
| nextDouble()  | Membaca nilai bertipe ```double```  |
| nextFloat()   |  Membaca nilai bertipe ```float```  |
| nextInt()     |   Membaca nilai bertipe ```int```   |
| nextLine()    | Membaca nilai bertipe ```String```  |
| nextLong()    |  Membaca nilai bertipe ```long```   |
| nextShort()   |  Membaca nilai bertipe ```short```  |
Sumber: [w3school](https://www.w3schools.com/java/java_user_input.asp)

## Contoh Kode
```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String nama;
        int umur;
        double tinggiBadan;
        boolean menikah;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Nama lengkap: ");
        nama = userInput.nextLine();

        System.out.print("Umur: ");
        umur = userInput.nextInt();

        System.out.print("Tinggi badan: ");
        tinggiBadan = userInput.nextDouble();

        System.out.print("Sudah menikah (true/false): ");
        menikah = userInput.nextBoolean();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi badan: " + tinggiBadan);
        System.out.println("Menikah: " + menikah);
    }
}
```

## Kapan Harus Menggunakan Scanner
Tentu saja pada saat kita ingin mengambil standar input dari user dan mengembalikannya ke program kita

## Masalah Pada Scanner
Mari kita lihat pada contoh kasus berikut:

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = userInput.nextInt();

        System.out.println(umur);
    }
}
```

Program diatas meminta user untuk memasukkan nilai umur yang harus bertipe _int_. **_Bagaimana jika user memasukkan nilai bertipe String?_** 

Maka program akan melempar Exception ```InputMismatchException``` seperti berikut:

```shell
Exception in thread "main" java.util.InputMismatchException
```

### Solusi

Kita bisa menggunakan metode ```Exception Handling```, yaitu suatu mekanisme untuk menangani masalah ketika terjadi Exception pada saat runtime.