package learn.advanced.QuickMath;
import java.util.Scanner;
public class QuickMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menginitialisasikan variabel
        int userInput = 0, numberOne, numberTwo;
        long startTime, endTime;
        double phi = 3.14;
        int answer;

        // Mengacak nomor
        numberOne = (int) Math.round(Math.random() * 10);
        numberTwo = (int) Math.round(Math.random() * 10);
        int hasil = numberOne + numberTwo;
        
        // Menampilkan soal
        System.out.println("Berapakah hasil dari " + numberOne + " + " + numberTwo + "?");
        startTime = System.currentTimeMillis();
        System.out.print("Jawaban : ");
        answer = scanner.nextInt();
        if (answer == hasil) {
            endTime = System.currentTimeMillis();
            System.out.println("Jawaban anda benar!");
            System.out.println("Waktu yang dibutuhkan: " + (endTime - startTime) + " milidetik");
        } else {
            System.out.println("Jawaban anda salah!");
        }
    }
}
