package utilities.JavaDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {

        // Memanggil TANGGAL dan WAKTU saat ini
        // Wajib ada
        LocalDateTime dateTimeNow = LocalDateTime.now();

        // Menampilkan TANGGAL dan WAKTU sekarang
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow); // output : yyyy-MM-ddTHH:mm:ss

        System.out.println("\n=== Format Tanggal Dan Waktu ===");

        // Mengubah format tampilan dari TANGGAL dan WAKTU sekarang
        // dd   : hari
        // MMMM : bulan 'November' | MMM : bulan dalam singkatan kata 'Nov' | MM : bulan dalam angka '11'
        // yyyy : tahun
        // HH   : jam
        // mm   : menit
        // ss   : detik
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Tanggal dan waktu saat ini : " +dateTimeNow.format(formatDateTime)); // output : dd-MM-yyyy HH:mm:ss

        // Menampilkan dengan hanya format TANGGAL
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMMM, dd yyyy");
        System.out.println("Tanggal saat ini : " +dateTimeNow.format(formatDate));

        // Menampilkan dengan hanya format WAKTU
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Waktu saat ini : " +dateTimeNow.format(formatTime));

        System.out.println("\n=== Mendapat tiap element ===");

        // Menampilkan hanya TAHUN
        System.out.println("Tahun saat ini : " +dateTimeNow.getYear());

        // Menampilkan hari keberapa pada tahun ini
        System.out.println("Hari ini adalah hari ke-" +dateTimeNow.getDayOfYear()+ " di Tahun "+dateTimeNow.getYear());

        // Menampilkan hanya BULAN
        System.out.println("Bulan saat ini : " +dateTimeNow.getMonth());

        // Menampilkan hanya BULAN dalam angka
        System.out.println("Bulan saat ini ke-" +dateTimeNow.getMonthValue());

        // Menampilkan hanya tanggal
        System.out.println("Tanggal saat ini : " +dateTimeNow.getDayOfMonth());

        // Menampilkan hanya Jam 24 Format, Menit, Detik
        System.out.println("Jam saat ini "+dateTimeNow.getHour()
                +" | Menit saat ini "+dateTimeNow.getMinute()
                +" | Detik saat ini "+dateTimeNow.getSecond());

        System.out.println("\n=== Menambah atau Mengurangi tanggal ===");

        System.out.println("Jika hari ini : " +dateTimeNow.format(formatDate));

        // Menampilkan Tanggal 30 hari yang lalu
        System.out.println("30 Hari yang lalu adalah tanggal : " +dateTimeNow.minusDays(30));

        // Menampilkan Tanggal 30 hari yang akan datang
        System.out.println("30 Hari yang akan datang adalah tanggal : " +dateTimeNow.plusDays(30));

        System.out.println("\n=== Selisih hari ===");
        System.out.println("Dari tanggal : "+ dateTimeNow.minusDays(30).format(formatDate));
        System.out.println("Hingga tanggal : "+ dateTimeNow.plusDays(30).format(formatDate));

        // Menghitung selisih hari tanggal sebelum dan tanggal setelah
        long selisihHari = Duration.between(dateTimeNow.minusDays(30),dateTimeNow.plusDays(30)).toDays();
        System.out.println("memiliki selisih "+selisihHari+" hari");

        // Menghitung selisih jam tanggal sebelum dan tanggal setelah
        long selisihJam = Duration.between(dateTimeNow.minusDays(30),dateTimeNow.plusDays(30)).toHours();
        System.out.println("memiliki selisih "+selisihJam+" jam");

        System.out.println("\n=== Zona Waktu ===");
        System.out.println("Tanggal dan waktu di wilayah ku saat ini : "+ dateTimeNow.format(formatDateTime));

        // Mengubah tipe data menjadi tipe data `ZonedDateTime`
        ZonedDateTime zonedDateTime = dateTimeNow.atZone(ZoneId.systemDefault());

        // Memilih zona waktu
        ZoneId zona = ZoneId.of("Europe/London");

        // Mengubah tanggal dan waktu mengikuti zona waktu yang dipilih
        ZonedDateTime dateChangeZoneTime = zonedDateTime.ofInstant(zonedDateTime.toInstant(), zona);
        System.out.println("Tanggal dan waktu di wilayah Inggris London saat ini : "+dateChangeZoneTime.format(formatDateTime));
    }
}
