# DateTime Java

Jenis-jenis **DateTime** yang sering digunakan tergantung pada kebutuhan aplikasi. Namun, beberapa jenis **DateTime** yang paling sering digunakan adalah:

1. `java.time.LocalDate`: Jenis ini digunakan untuk merepresentasikan **tanggal tanpa waktu** atau **zona waktu**. Misalnya, ketika Anda hanya perlu menyimpan tanggal dalam sebuah aplikasi atau saat menghitung selisih antara dua tanggal.

2. `java.time.LocalDateTime`: Jenis ini digunakan untuk merepresentasikan **kombinasi tanggal** dan **waktu tanpa zona waktu**. Misalnya, ketika Anda perlu menghitung durasi antara dua waktu dalam satu zona waktu.

3. `java.time.ZonedDateTime`: Jenis ini digunakan untuk merepresentasikan **tanggal, waktu,** dan **zona waktu**. Misalnya, ketika Anda perlu menampilkan waktu dalam zona waktu tertentu atau menghitung selisih waktu antara dua zona waktu yang berbeda.

4. `java.time.Instant`: Jenis ini digunakan untuk merepresentasikan **titik waktu dalam format timestamp UTC**. Misalnya, ketika Anda perlu melakukan perhitungan waktu yang sangat akurat atau ketika Anda bekerja dengan data historis.

Sementara itu, jenis DateTime seperti ` java.util.Date` dan `java.sql.Timestamp` masih digunakan di beberapa aplikasi lama atau dalam beberapa _framework legacy_. Namun, untuk aplikasi modern yang baru dikembangkan, lebih disarankan untuk menggunakan jenis-jenis **DateTime** yang lebih modern dan lebih aman seperti `java.time.LocalDateTime` atau `java.time.ZonedDateTime`.
