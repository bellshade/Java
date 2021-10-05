import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        // Object untuk membuat data nya menggunakan Scanner
        Scanner input = new Scanner(System.in);
        // Input Angka Desimal
        System.out.println("Masukkan Angka Desimal Yang Ingin Anda Konversi Ke Hexadesimal :");
        int angka_desimal = input.nextInt();
        // Program untuk Mengubah Angka Desimal yang sebelum nya telah kita input
        // Menjadi Hexadesimal
        String angka_hexa = Integer.toHexString(angka_desimal);
        System.out.println("Hasil Konversi Desimal To Hexadesimal : " + angka_hexa);
        // Program untuk menghentikan input data nya
        input.close();
    }
}