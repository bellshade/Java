import java.util.Scanner;

public class DecimalToBiner {
    public static void main(String[] args) {
        // Object untuk membuat data nya menggunakan Scanner
        Scanner input = new Scanner(System.in);
        // Input Angka Desimal
        System.out.println("Masukkan Angka Desimal Yang Ingin Anda Konversi Ke Biner :");
        int angka_desimal = input.nextInt();
        // Program untuk Mengubah Angka Desimal yang sebelum nya telah kita input
        // Menjadi Biner
        String angka_biner = Integer.toBinaryString(angka_desimal);
        System.out.println("Hasil Konversi Desimal Ke Biner : " + angka_biner);
        // Program untuk menghentikan input data nya
        input.close();
    }
}
