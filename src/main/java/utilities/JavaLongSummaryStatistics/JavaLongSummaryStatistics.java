package utilities.JavaLongSummaryStatistics;
import java.util.LongSummaryStatistics;

public class JavaLongSummaryStatistics {
    public static void main(String[] args) {
        // Membuat objek dari class LongSummaryStatistics
        LongSummaryStatistics data = new LongSummaryStatistics();

        // Memasukkan nilai-nilai kedalam object class
        data.accept(1000);
        data.accept(2000);
        data.accept(3000);
        data.accept(4000);
        data.accept(5000);

        // Menampilkan hasil rata-rata
        System.out.println("Rata-rata : " + data.getAverage());

        // Menampilkan hasil penjumlahan dari seluruh data nilai
        System.out.println("Hasil penjumlahan seluruh data : " + data.getSum());
        
        // Menampilkan nilai terbesar
        System.out.println("Nilai terbesar : " + data.getMax());

        // Menampilkan nilai terkecil
        System.out.println("Nilai terkecil : " + data.getMin());
    }
}
