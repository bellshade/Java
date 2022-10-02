package utilities.JavaCalendar;
import java.util.Calendar;

public class JavaCalendar {
    public static void main(String[] args) {

        // Membuat instance class Calendar
        Calendar calendar = Calendar.getInstance();

        // Mengambil keseluruhan data waktu saat ini
        System.out.println("Waktu saat ini : " + calendar.getTime());

        // Mengambil hanya data tahun saat ini
        System.out.println("Tahun saat ini: " + calendar.get(Calendar.YEAR));
        
        // Mengambil hanya data tanggal saat ini
        System.out.println("Tanggal saat ini: " + calendar.get(Calendar.DATE));
        
        // Mengambil hanya data menit saat ini
        System.out.println("Menit saat ini: " + calendar.get(Calendar.MINUTE));
        
        // Mengambil hanya data detik saat ini
        System.out.println("Detik saat ini: " + calendar.get(Calendar.SECOND));

        // Mengambil data jumlah hari dalam seminggu
        Integer max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Jumlah hari dalam minggu ini: " + max);

        // Mengambil data jumlah minggu dalam setahun
        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Jumlah minggu dalam tahun ini: " + max);

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
    }
}
