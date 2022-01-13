# String

Tipe Data satu ini sangatlah unik dan menarik, sehingga Tipe Data ini menurut beberapa orang dipisah dengan Tipe Data lainnya, tak lain dan tak kala bukan adalah Tipe Data `String`. `String` adalah rangkaian simbol alphabet, angka, spasi, dan karakter lainnya (bahkan bisa juga tipe data numerik). Cara mendeklarasikan penulisan `String` pada Java adalah sbg berikut:

```java
String var_name = "Ini adalah Contoh penulisan String pada Java";
```

##### Deskripsi String

Di Java terdapat dua kelas yang memodelkan `String` yakni:

1. *String* untuk string konstan yang tidak berubah isinya setelah penciptaannya
2. *StringBuffer* untuk string yang memerlukan banyak manipulasi

##### Constructor String

Class *String* mempunyai 15 *constructor* sehingga terdapat beragam cara eksplisit menciptakan objek `string`. Berikut adalah contoh-contoh *Constructor* untuk kelas *String*:

- *String()*
*Constructor* ini dapat digunakan untuk menciptakan `string` baru bernilai kosong (null)
- *String (String value)*
*Constructor* ini dapat digunakan untuk menciptakan string baru dan memiliki nilai
- *String (char value[])*
*Constructor* ini berupa String yang digunakan untuk sebuah Struktur Data *Array*
- *String (char value [], int offset, int count)*
*Constructor* ini berupa *String* dari sub array karakter dan memiliki parameter untuk pengambilan karakter
- *String (byte ascii[], int hibyte, int offset, int count)*
Unicode string dari sub array byte menggunakan hibyte sebagai high byte untuk tiap karakter Unicode
- *String (byte ascii[], int byte)*
Unicode string dari array byte menggunakan hibyte sebagai high byte untuk tiap karakter Unicode
- *String (StringBuffer buffer)*
String dari objek stringBuffer

##### Operasi String

Setelah menciptakan objek baru pada`String`, maka kelas `String` ini dapat melakukan metode-metode yang dapat digunakan untuk memanipulasi _string_. Beberapa metode `String` yang tersedia dalam Java adalah sbg berikut:

- `length()` : *method* ini digunakan untuk menghitung jumlah karakter pada variabel
- `charAt()` : *method* ini mengembalikan karakter yang terletak di indeks `String` yang ditentukan. Indeks `string` mulai dari nol.
- `startsWith()` : *method* digunakan untuk memeriksa kondisi awalan pada nilai atau karakter dari tipe data `String`
- `endsWith()`: *method* ini digunakan untuk memeriksa kondisi akhiran pada nilai atau karakter dari tipe data `String`. Kedua *method* tersebut mengembalikan nilai boolean, berupa true atau false
- `indexOf()` : *method* ini digunakan untuk menemukan kemunculan pertama karakter tertentu pada `String` dengan memberikan nilai index
- `lastIndexOf()` : *method* ini digunakan untuk mengembalikan nilai index kemunculan terakhir suatu karakter dalam `String` tertentu
- `substring()` : *method* ini digunakan untuk mengambil sebagian atau beberapa potong karakter dari isi `String`
- `equals()` : *method* tersebut digunakan untuk membandingkan 2 buah variabel yang bertipe data `String`
- `equalsIgnoreCase()` : *method* ini serupa dengan `equals()`, namun bersifat case insensitivity
- `compareTo()` : *method* ini memungkinkan untuk membandingkan object bilangan yang dipanggil melalui *method* untuk argumen
- `concat()` : *method* ini digunakan untuk menggabungkan `string`
- `trim()` : *method* tersebut berfungsi untuk menghapus spasi dari bagian awal dan juga akhir
- `toLowerCase()` dan `toUpperCase()` : *method* ini digunakan untuk mengonversi semua karakter pada objek `String` menjadi lowercase (semua inputan dalam variabel `String` jadi mengecil atau kata lain tulisan akan menjadi kecil semua) dan uppercase (semua inputan dalam variabel `String` jadi membesar atau kata lain tulisan akan menjadi besar semua)
- `valueOf()` : *method* ini berfungsi untuk mengonversi nilai dari tipe data menyerupai `int`, `boolean` dan lain sebagainya, atau tipe data objek lain ke dalam tipe data `String`


##### Method `Length()` `Substring()` `Concat()` `Replace()`

> `length()`
*Method* `length()` digunakan untuk memperoleh panjang dari `string`. Cara penulisan `length()` adalah sbg berikut:

```java
public class contoh {
    public static void main(String[] args) {
        String aString = "Ini Contoh";
        int len = aString.length();

        System.out.println(len);
    }
}
```

```
Output : 10
```

Pertama-tama, kita mendeklarasikan Variabel `aString` bertipe data yang menampung inputan `String`. Variabbel `len` bertipe data `int` ketika nantinya di `print`, maka program diatas akan mengeluarkan output 10 (termasuk spasi)

> `substring()`
*Method* selanjutnya adalah `substring()`. `Substring()` digunakan untuk mengambil isi sebagian dari variable `String` atau mengambil potongan beberapa karakter dari sebuah isi `String`. Dimana, pada parameter pertama merupakan index awal dari `String` dan parameter kedua merupakan batasan index yang akan diambil. Cara penulisan `substring` adalah sbg berikut:

```java
String substring(index_awal,index_akhir);
```

Contoh:

```java
public class contoh {
    public static void main(String[] args) {
        String var = "Ini adalah String";
        String hasil = var.substring(0, 3);

        System.out.println(hasil);
    }
}
```

```
Output : Ini
```

ketika program dijalankan maka, akan menghasilkan output `Ini`. Hal ini dikarenakan *method* `substring()` pada variabel `hasil`. Di variabel `var` terdapat tipe data `String`, dimana variabel tersebut menampung inputan tipe data `String`. Setelah itu kita mendeklarasikan variabel `hasil` bertipe data `String`, yang dimana menampung `substring()` ke variabel `var`. Di `substring()` ini kita memasukan index berupa (0, 3) yang berari mengambil dari *paling* awal karakter `String` hingga index ke tiga yakni "i". 
Jika misalkan mendeklarasikan `substring(1, 4)` maka akan mengeluarkan output `ni`, ingat spasi juga termasuk ke dalam tipe data `String`

> `concat()`
Selanjutnya adalah `concat()`. Java menggunakan tanda ‘+’ untuk menyambungkan dua `string`. Apabila saat menyambungkan `string` dengan nilai yang bukan bertipe `string` maka nilai tersebut dikonversi terlebih dahulu menjadi `string`. Setiap objek Java dapat dikonversi menjadi `string`. Contoh penggunaan `String` `concat()` adalah sbg berikut

```
String concat(String str);
```

Metode `concat()` digunakan untuk menyambung dua objek `String`. `String` yang dispesifikasikan di parameter `str` kemudian disambung ke akhir objek `string`. Contoh penerapannya sbg berikut:

```java
public class contoh {
    public static void main(String[] args) {
        String v1 = new String("Saya Makan");
        String v2 = new String(v1 + "Nasi Goreng");
        String v3 = v1.concat("Nasi Goreng");

        System.out.println(v2);
        System.out.println(v3);
    }
}
```

penjelasan

- variabel `v1` bertipe data `String` menyimpan inputan 
- variabel `v2` bertipe data `String` menambahkan `String` dari `v1` sehingga menghasilkan output `Saya Makan Nasi Goreng`
- variabel `v3` bertipe data `String` menggunakan *method* `concat()` sehingga menghasilkan output `Saya Makan Nasi Goreng`
jadi bisa ditarik kesimpulan,`concat()` sama seperti penyambungan `String()` pada manual.

> `replace()`

Metode `replace()` mengganti karakter. Semua kemunculan *oldChar* diganti *newChar*. Berikut adalah contoh penggunaanya:

```java
public class Contoh {
    public static void main(String[] args) {
        String a1 = "mengganti bala";
        String a2 = a1.replace('l', 'r');

        System.out.println(a2);
    }
}
```

Hasilnya adalah `mengganti bara`. Perlu diingat bahwa *method* ini bersifat `CaseSensitive`, sehingga harus bisa memilah huruf mana yang diganti.