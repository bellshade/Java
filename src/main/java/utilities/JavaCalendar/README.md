# Java Calendar

Didalam **JAVA** terdapat sebuah class abstract bernama **_Calendar_** yang menyediakan methods untuk melakukan konversi tanggal antara waktu tertentu dan serangkaian bidang waktu kalender seperti bulan, tahun, jam, dan lain-lain.

Karena Calendar merupakan sebuah class abstract, maka tidak bisa dilakukan instansiasi dengan konstruktornya. Kita bisa menggunakan static method ```Calendar.getInstance()``` untuk membuat instance dan mengimplementasikan sub-class yang ada.

Untuk menggunakan class tersebut, silahkan import package ```java.util.Calendar``` terlebih dahulu.

### Contoh penggunaan

[![](https://img.shields.io/static/v1?&label=Lihat%20source%20code&message=%3e&color)](JavaCalendar.java)

Dibawah ini akan didemonstrasikan cara mengambil data waktu saat ini **secara keseluruhan**.

```java
Calendar calendar = Calendar.getInstance();
System.out.println("Waktu saat ini : " + calendar.getTime());
```

Method ```getTime()``` mengembalikan data berupa object class **Date** yang merepresentasikan waktu saat ini.

Maka, outputnya adalah

```
Waktu saat ini : Sun Oct 02 22:42:46 WIB 2022
```

Tentunya, output yang kalian dapat akan berbeda dengan output yang ada di dokumentasi ini karena waktunya sudah pasti berubah.

Selanjutnya, kita akan coba menggunakan method ```get()```. Dibawah ini akan didemonstrasikan cara mengambil data detik, menit, tanggal, dan tahun saat ini **secara terpisah**.

```java
Calendar calendar = Calendar.getInstance();

System.out.println("Tahun saat ini: " + calendar.get(Calendar.YEAR));
System.out.println("Tanggal saat ini: " + calendar.get(Calendar.DATE));
System.out.println("Menit saat ini: " + calendar.get(Calendar.MINUTE));
System.out.println("Detik saat ini: " + calendar.get(Calendar.SECOND));
```

Maka, outputnya adalah

```
Tahun saat ini: 2022
Tanggal saat ini: 2
Menit saat ini: 55
Detik saat ini: 21
```

Tentunya, output yang kalian dapat akan berbeda dengan yang ada di dokumentasi ini karena waktunya sudah pasti berubah.

Selanjutnya, kita akan coba menggunakan method ```getMaximum()```. Dibawah ini akan didemonstrasikan cara mengambil data jumlah maksimum hari dalam seminggu, dan jumlah maksimum minggu dalam setahun.

```java
Calendar calendar = Calendar.getInstance();

// Jumlah hari dalam seminggu
Integer max = calendar.getMaximum(Calendar.DAY_OF_WEEK);

System.out.println("Jumlah hari dalam minggu ini: " + max);

// Jumlah minggu dalam setahun
max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);

System.out.println("Jumlah minggu dalam tahun ini: " + max);
```

Maka, outputnya adalah

```
Jumlah hari dalam minggu ini: 7
Jumlah minggu dalam tahun ini: 53
```

Selanjutnya, kita akan coba menggunakan method ```add()```. Dibawah ini akan didemonstrasikan cara mengambil data waktu tanggal, bulan, tahun yang sudah berlalu dan yang akan datang.

```java
Calendar calendar = Calendar.getInstance();

/* Data waktu tanggal dikurangi 9 untuk
   mengambil data waktu 9 hari yang lalu */
calendar.add(Calendar.DATE, -9);
System.out.println("9 hari yang lalu : " + calendar.getTime());

/* Data waktu bulan ditambah 3 untuk mengambil
   data waktu 3 bulan yang akan datang */
calendar.add(Calendar.MONTH, 3);
System.out.println("3 bulan yang akan datang: " + calendar.getTime());

/* Data waktu tahun ditambah 5 untuk
   mengambil data waktu 5 yang akan datang */
calendar.add(Calendar.YEAR, 5);
System.out.println("5 tahun yang akan datang: " + calendar.getTime());
```

Maka, outputnya adalah

```
9 hari yang lalu : Fri Sep 23 23:27:03 WIB 2022
3 bulan yang akan datang: Fri Dec 23 23:27:03 WIB 2022
5 tahun yang akan datang: Thu Dec 23 23:27:03 WIB 2027
```

Tentunya, output yang kalian dapat akan berbeda dengan yang ada di dokumentasi ini karena waktunya sudah pasti berubah.

### Apakah ada method lain yang bisa digunakan ?

Ya, ada banyak method-method lain yang bisa digunakan.

[![](https://img.shields.io/static/v1?&label=Lihat%20semua%20method&message=%3e&color)](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html#method_summary)