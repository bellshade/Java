package bellshade.learn.intermediate.UserInput;



import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // menginisialisai variabel yang dibutuhkan
        String nama;
        int umur;
        double tinggiBadan;
        boolean menikah;

        // membuat object Scanner
        Scanner userInput = new Scanner(System.in);

        // menampilkan "Nama lengkap: "
        System.out.print("Nama lengkap: ");
        // mengambil user input bertipe String dan memasukkannya ke variable nama
        nama = userInput.nextLine();

        // menampilkan "Umur: "
        System.out.print("Umur: ");
        // mengambil user input bertipe int dan memasukkannya ke variable umur
        umur = userInput.nextInt();

        // menampilkan "Tinggi badan: "
        System.out.print("Tinggi badan: ");
        // mengambil user input bertipe double dan memasukkannya ke variable tinggiBadan
        tinggiBadan = userInput.nextDouble();

        // menampilkan "Sudah menikah (true/false): "
        System.out.print("Sudah menikah (true/false): ");
        // mengambil user input bertipe boolean dan memasukkannya ke variable menikah
        menikah = userInput.nextBoolean();

        // menampilkan data yang sudah diinput
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi badan: " + tinggiBadan);
        System.out.println("Menikah: " + menikah);
    }
}
