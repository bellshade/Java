# Game : Guess The Number

Guess The Number adalah game sederhana dimana kita harus menebak angka yang sudah digenerate random oleh code.  
Jika kita berhasil menebak akan keluar berapa kali percobaan hingga kita menebak dengan benar.

## Alur Code
Berikut akan dijelaskan fungsi masing-masing code yagn ada didalam program ini


1. Pertama kita inisialisasi batas bawah dan batas atas angka untuk generate angka random
```java
private static final int MINIMUM_NUMBER = 1;
private static final int MAXIMUM_NUMBER = 100;
```

2. Lakukan inisialisasi variable yang dibutuhkan. Jangan lupa karena kita menggunakan utility `Scanner` dan `Random` maka dibagian atas perlu di import terlebih dahulu.
```java
import java.util.Random;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
Random generateRandomNumber = new Random();
int userAttempt = 1;
int userInput; 
```

3. Generate random number dengan angka yang sudah kita tentukan. Disini perlu `+1` agar batas paling atas yang diambil sesuai dengan nilai yang kita insialisasi.
Jika tidak menggunakan `+1` nanti hasilnya akan tidak sesuai.
```java
int randomNumber = generateRandomNumber.nextInt(MINIMUM_NUMBER ,MAXIMUM_NUMBER + 1);
```

4. Ini adalah method untuk validasi pengecekan jika inputan bukan angka dan harus berada dalam range yang ditentukan. `Scanner` mempunyai method `hasNextInt()` yang dapat kita gunakan untuk mengetahui apakah inputan tersebut berupa angka atau bukan. 
Disini kita looping menggunakan `while` sampai inputan yang diterima sudah benar. `scanner.next()` berfungsi agar tidak terjadi `infinite loop`  
Kita juga perlu mengembalikan inputan angka yang diterima.
```java
 private static int validateInput(Scanner scanner) {
  boolean isInputInvalid = true;
  int input = 0;

  while (isInputInvalid) {
    if (scanner.hasNextInt()) {
      input = scanner.nextInt();

      if (input < MINIMUM_NUMBER || input > MAXIMUM_NUMBER) {
        System.out.printf("Input number must be between %s to %s. %n", MINIMUM_NUMBER, MAXIMUM_NUMBER);
      } else {
        isInputInvalid = false;
      }
    } else {
    System.out.println("Only number allowed!");
    scanner.next();
    }
  }

  return input;
  }
```

5. Disini code utama kita. Menggunakan `looping` `do while()` untuk mendapatkan tebakan yang benar.  
Pertama kita panggil method untuk validasi input harus angka. Setelah itu kita panggil method validasi angka harus sesuai range yang kita tentukan.
Kemudian kita lakukan pengecekan, jika angka yang diinput lebih besar atau lebih kecil dari angka random, tampilkan pesan.  
Jika tebakan kita benar, tampilkan pesan beserta berapa kali percobaan yang kita lakukan.
`userAttempt++` berfungsi sebagai counter berapa kali percobaan kita sampai berhasil.
```java
do {
  validateInputMustBeNumber(scanner);

  userInput = validateInputNumber(scanner);

  if (userInput > randomNumber) {
    System.out.println("Try guessing lower number");
  }

  if (userInput < randomNumber) {
    System.out.println("Try guessing higher number");
  }

  if (userInput == randomNumber) {
    System.out.println("CORRECT!!");
    System.out.println("The number is " + randomNumber);
    System.out.println("You're guessing in " + userAttempt + " attempts.");
  }

  userAttempt++;
} while (userInput != randomNumber);
```

6. Jangan lupa di akhir code karena kita menggunakan `Scanner` jadi perlu di `close()`
```java
scanner.close();
```

## Kesimpulan
Game ini cukup sederhana, bisa dimainkan lewat terminal. Jika ingin mengubah range angka random yang digenerate, silahkan ubah code berikut dengan angkan yang diiginkan dan secara dinamis pesan yang tampil akan menyesuaikan angka yang baru :  
`  private static final int MINIMUM_NUMBER = angka_batas_bawah;
`

`  private static final int MAXIMUM_NUMBER = angka_batas_atas;
`