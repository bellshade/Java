# Game : QuickMath

QuickMath adalah game perhitungan tambah tambahan singkat yang sederhana. Game ini menghitung berapa waktu yang diperlukan oleh pemain untuk dapat menjawab
soal soal dengan benar.

## Alur Code
Berikut akan dijelaskan fungsi masing-masing code yagn ada didalam program ini



1. Lakukan inisialisasi variable yang dibutuhkan serta mengimport 'Scanner'
```java
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
int userInput = 0, numberOne, numberTwo;
long startTime, endTime;
double phi = 3.14;
int answer;
```

3. Melakukan generate nomor dan ditambahkan untuk dapat menghasilkan jawabannya.
```java
numberOne = (int) Math.round(Math.random() * 10);
numberTwo = (int) Math.round(Math.random() * 10);
int hasil = numberOne + numberTwo;
```

4. Disini kita akan menampilkan soal dengan fungsi `System.out.println` dan mulai menghitung waktu dengan `System.currentTimeMillis()` dan meminta input dari usernya untuk mendapatkan jawabannya
```java
System.out.println("Berapakah hasil dari " + numberOne + " + " + numberTwo + "?");
startTime = System.currentTimeMillis();
System.out.print("Jawaban : ");
answer = scanner.nextInt();
```

5. Disini kita akan memeriksa jawaban dari pemain apakah benar atau tidak, jika tidak akurat maka akan mengakhiri permainan. Namun jika jawaban cocok dengan hasil maka akan menghasilkan keluaran berupa tanda berhasil dan waktu yang dibutuhkan.
```java
        if (answer == hasil) {
            endTime = System.currentTimeMillis();
            System.out.println("Jawaban anda benar!");
            System.out.println("Waktu yang dibutuhkan: " + (endTime - startTime) + " milidetik");
        } else {
            System.out.println("Jawaban anda salah!");
        }
```


## Kesimpulan
Game ini sangatlah simpel dan mudah untuk dimainkan, permainan ini dapat dimainkan melalu terminal
