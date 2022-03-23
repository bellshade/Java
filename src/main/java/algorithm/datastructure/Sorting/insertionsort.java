package algorithm.datastructure.Sorting;

// Insertion Sort merupakan sebuah teknik pengurutan dengan cara membandingkan dan mengurutkan dua data pertama pada array, kemudian membandingkan data para array berikutnya apakah sudah berada di tempat semestinya. Algorithma insertion sort seperti proses pengurutan kartu yang berada di tangan kita. Algorithma ini dapat mengurutkan data dari besar ke kecil (Ascending) dan kecil ke besar (Descending). 

// Disini saya membuat sebuah algoritam Insertion Sort Divide and Conquer

// Divide (Pemisahan Data)
// Conquer atau Combine atau Merge (Penggabungan Data sembari di Sorting)

import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        // Object untuk membuat data nya menggunakan Scanner
        Scanner input = new Scanner(System.in);

        // Input banyaknya data
        System.out.print("Input banyaknya Data : ");
        int jmlh_data = input.nextInt();

        // Input nilai tiap Data
        int[] data = new int[jmlh_data];
        for (int a = 0; a < jmlh_data; a++) {
            System.out.print("Nilai Data ke-" + (a + 1) + " : ");
            data[a] = input.nextInt();
        }

        // Tampilkan Data
        System.out.println("Data Sebelum di Sorting : " + Arrays.toString(data));

        // Proses Algoritma Divide and Conquer
        // Divide (Pemisahan Data)
        System.out.println("\nDivide");
        for (int a = 0; a < data.length; a++) {
            System.out.println("Iterasi ke-" + (a + 1));
            for (int b = 0; b < data.length; b++) {
                // Tanda pemisah di awal untuk memisah setiap Data dengan tanda | untuk Data
                // yang sudah terpisah
                if (b == 0 || b <= a) {
                    System.out.print("| " + data[b] + " ");
                }

                // Untuk Data yang belum terpisah
                else {
                    System.out.print(" " + data[b]);
                }

                // Tanpa pemisah di akhir
                if (b == a) {
                    System.out.print("|");
                }
            }
            System.out.println("\n");
        }

        // Conquer atau Combine atau Merge (Penggabungan Data Sembari di Sorting)
        System.out.println("Merge/Combine/Conquer");
        for (int a = 0; a < data.length - 1; a++) {
            System.out.println("Iterasi ke-" + (a + 2));
            // Proses Sorting Insertion Sort
            for (int b = a + 1; b > 0; b--) {
                if (data[b] < data[b - 1]) {
                    int temp = data[b];
                    data[b] = data[b - 1];
                    data[b - 1] = temp;
                }
            }
            for (int c = 0; c < data.length; c++) {
                // Untuk Data yang akan digabung
                if (c <= a + 1) {
                    System.out.print(data[c] + " ");
                }

                // Untuk Data yang belum digabung
                else {
                    // Pengecualian untuk Data iterasi terakhir
                    if (a == data.length - 1) {
                        System.out.print(data[c]);
                        continue;
                    }
                    System.out.print("| " + data[c] + " ");
                    // Pmebatas untuk Data terakhir yang belum digabung
                    if (c == data.length - 1)
                        System.out.print("|");
                }
            }
            System.out.println("\n");
        }
        // Code untuk mengentikan Scanner (Input Data nya)
        input.close();
    }
}