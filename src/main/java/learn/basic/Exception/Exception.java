package learn.basic.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        // Membuka file dan membacanya baris demi baris
        try {
            Scanner input = new Scanner(new File("file.txt"));
            while(input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        // Jika file tidak ditemukan
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
        // Program selesai
        } finally {
            System.out.println("Program selesai.");
        }
    }
}