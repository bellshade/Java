# Array Satu Dimensi

Array satu dimensi adalah array yang terdiri dari n buah kolom atau Array satu dimensi adalah array yang terdiri dari satu subskrip array saja. Setiap elemen array satu dimensi dapat diakses melalui indeks yang terdapat di dalamnya. Jenis Array ini adalah Array dasar, jadi sebelum kamu ingin memahami Array pada Java atau bahkan semua bahasa pemrograman lainnya, diwajibkan untuk menghafal struktur data yakni Array Satu Dimensi atau orang-orang lebih menyebutnya Array Dasar. *Pseudocode* array satu dimensi adalah sebagai berikut

```
tipe_data[] nama_var;
```

`tipe_data` merupakan deklarasi tipe basis dari array tersebut. Tipe basis menentukan tipe data bagi masing-masing elemen yang membentuk array . Dengan demikian, `tipe_data` untuk array digunakan untuk menentukan tipe data yang dimuat oleh array . Pada setiap array terdapat indeks yang memudahkan untuk mengakses data yang disimpan. Indeks merupakan ukuran yang terdapat di dalam simbol kurung siku. Pada setiap Array, indeks akan selalu bermula mulai dari nol, sebagai contoh

```java
String[] merk = new String[5];
nama[0] = "Samsung";
nama[1] = "LG";
nama[2] = "Sony";
nama[3] = "Polytron";
nama[4] = "Sharp";
System.out.println(nama[2]);
```

```
output : Sony
```

Seperti yang dilihat dari contoh atas, jika dilihat pada output maka yang ditampilkan adalah indeks array ke 2, dikarenakan awal indeks array dimulai dari nol. Pada saat kita juga mendeklarasikan array kita tidak perlu mendeklarasikan ukuran array . Namun, jika akan menyatakan ukuran array , maka dilakukan secara eksplisit saat pendeklarasian menggunakan operator `new()` atau dengan mendaftarkan item-item untuk array . Operator `new()` berfungsi untuk membuat object atau array baru. Selain itu, pada Java penempatan kurung siku pada deklarasi array dilakukan setelah tipe data atau setelah nama variabel.

Untuk bisa melihat contoh program Array, kamu bisa melihatnya [disini]()