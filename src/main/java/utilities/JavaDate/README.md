# Java Date

Didalam **JAVA** memiliki sebuah objek yang bernama **_LocalDateTime_** yang dapat menampilkan informasi **Tanggal** dan **Waktu** dan tidak dapat diubah nilainya.

Untuk menggunakan objek **_LocalDateTime_**, tambahkan _library_ `java.time.LocalDateTime`

contoh menampilkan tanggal dan waktu hari ini

```java
import java.time.LocalDateTime;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow);
    }
}
```

## Mengubah Format Tampilan

Untuk mengubah format tampilan **Tanggal** dan **Waktu** dari **_LocalDateTime_**, tambahkan _library_ `java.time.format.DateTimeFormatter`

format tampilan default : `yyyy-MM-ddTHH:mm:ss`

Representasi untuk format tanggal dan waktu

| Representasi | simbol | Contoh         |
| ------------ | ------ | -------------- |
| Tahun        | yyyy   | 2021           |
| Bulan        | MMMM   | November (eng) |
| Bulan        | MMM    | Nov            |
| Bulan        | MM     | 11             |
| Hari         | dd     | 02             |
| Jam          | HH     | 22             |
| Menit        | mm     | 06             |
| Detik        | ss     | 58             |

contoh menampilkan tanggal dan waktu hari ini dengan perubahan format

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow);
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow.format(formatDateTime));
    }
}
```

## Menambah atau Mengurangi LocalDateTime saat ini

Tanggal atau waktu dari objek _LocalDateTime_ dapat **menampilkan tanggal atau waktu yang sudah berlalu atau yang akan datang**.

### _Method_ menambah tanggal atau waktu

| Method      | Kegunaan                         |
| ----------- | -------------------------------- |
| plusDays    | Menambah dalam hitungan hari     |
| plusWeaks   | Menambah dalam hitungan mingguan |
| plusMonts   | Menambahkan dalam hitungan bulan |
| plusYears   | Menambahkan dalam hitungan tahun |
| plusHours   | Menambahkan dalam hitungan jam   |
| plusMinutes | Menambahkan dalam hitungan menit |
| plusSeconds | Menambahkan dalam hitungan detik |

```java
import java.time.LocalDateTime;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow);
        System.out.println("30 Hari yang yang akan datang adalah tanggal : " +dateTimeNow.plusDays(30));

    }
}
```

### _Method_ Mengurangi tanggal atau waktu

| Method       | Kegunaan                           |
| ------------ | ---------------------------------- |
| minusDays    | Mengurangi dalam hitungan hari     |
| minusWeaks   | Mengurangi dalam hitungan mingguan |
| minusMonts   | Mengurangikan dalam hitungan bulan |
| minusYears   | Mengurangikan dalam hitungan tahun |
| minusHours   | Mengurangikan dalam hitungan jam   |
| minusMinutes | Mengurangikan dalam hitungan menit |
| minusSeconds | Mengurangikan dalam hitungan detik |

contoh menampilkan tanggal dan waktu hari ini dan 30 hari sebelum nya

```java
import java.time.LocalDateTime;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow);
        System.out.println("30 Hari yang lalu adalah tanggal : " +dateTimeNow.minusDays(30));

    }
}
```

## Menghitung selesih tanggal atau waktu

Untuk Menghitung selesih **Tanggal** dan **Waktu** dari **_LocalDateTime_**, tambahkan _library_ `java.time.Duration`

method `Duration.between()` akan mengembalikan nilai bertipe `integer`

| Method                                                   | Kegunaan                        |
| -------------------------------------------------------- | ------------------------------- |
| Duration.between(dariTanggal, sampaiTanggal).toDays()    | Menghitung jumlah selisih hari  |
| Duration.between(dariTanggal, sampaiTanggal).toHours()   | Menghitung jumlah selisih jam   |
| Duration.between(dariTanggal, sampaiTanggal).toMinutes() | Menghitung jumlah selisih menit |

contoh menghitung selisih hari **30 hari sebelum hari ini** dengan **30 hari setelah hari ini**

```java
import java.time.LocalDateTime;
import java.time.Duration;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Dari tanggal : "+ dateTimeNow.minusDays(30));
        System.out.println("Hingga tanggal : "+ dateTimeNow.plusDays(30));

        // Menghitung selisih hari tanggal sebelum dan tanggal setelah
        long selisihHari = Duration.between(dateTimeNow.minusDays(30),dateTimeNow.plusDays(30)).toDays();
        System.out.println("memiliki selisih "+selisihHari+" hari");
    }
}
```

## Mengubah zona waktu

Untuk mengubah zona waktu saat menampilkan **Tanggal** dan **Waktu** dari **_LocalDateTime_**, tambahkan _library_ `java.time.ZoneId` dan `java.time.ZonedDateTime`

contoh mengubah zona waktu ke zona waktu `Europe/London`

```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaDate {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Tanggal dan waktu di wilayah ku saat ini : "+ dateTimeNow);

        // Mengubah tipe data menjadi tipe data `ZonedDateTime`
        ZonedDateTime zonedDateTime = dateTimeNow.atZone(ZoneId.systemDefault());

        // Memilih zona waktu
        ZoneId zona = ZoneId.of("Europe/London");

        // Mengubah tanggal dan waktu mengikuti zona waktu yang dipilih
        ZonedDateTime dateChangeZoneTime = zonedDateTime.ofInstant(zonedDateTime.toInstant(), zona);
        System.out.println("Tanggal dan waktu di wilayah Inggris London saat ini : "+dateChangeZoneTime);
    }
}
```
