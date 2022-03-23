package algorithm.backtracking;

/**
 * Diberikan papan catur N x N. mengembalikan semua 
 * pengaturan di mana N ratu dapat ditempatkan di papan seperti tidak ada serangan dua ratu
 * saling menyerang
 * contoh N = 6
 * solusi:
 * dengan metode brute force
 * Hasilkan semua kemungkinan pengaturan untuk menempatkan N ratu di papan N*N.
 * Periksa setiap papan ratu ditempatkan dengan aman.
 * Jika aman, sertakan pengaturan dalam set solusi. Jika tidak, abaikan saja
 * 
 * solusi optimisasi
 * Ini dapat diselesaikan dengan menggunakan backtracking dalam langkah-langkah di bawah Ini
 * Mulailah dengan kolom pertama dan tempatkan ratu di baris pertama
 * Coba tempatkan ratu secara berurutan di kolom kedua
 * Jika menempatkan ratu kedua di kolom kedua menyerang salah satu ratu sebelumnya, ubah baris di kolom kedua
 * jika tidak pindah ke kolom berikutnya dan coba tempatkan ratu berikutnya
 * Jika tidak ada baris tempat ratu dapat ditempatkan sehingga tidak menyerang ratu sebelumnya, maka kembali ke kolom sebelumnya dan ubah baris ratu sebelumnya.
 * Terus lakukan ini sampai ratu terakhir tidak ditempatkan dengan aman.
 * Jika tidak ada cara seperti itu maka kembalikan daftar kosong sebagai solusi
* */

import java.util.ArrayList;
import java.util.List;

public class NQueen{
  public static void main(String[] args){
  }

  public static void placeQueens(final int queens){
    List<List<String>> arrangements = new ArrayList<List<String>>();
    getSolution(queens, arrangements, new int[queens], 0);
    if (arrangements.isEmpty()){
      System.out.println("tidak ada tempat " + queens + " ratu pada papan " + queens + "x" + queens);
    }
    else{
      System.out.println("peraturan untuk penempatan " + queens + " ratu");
    }
    arrangements.forEach(arrangement ->{
      arrangement.forEach(row -> System.out.println(row));
      System.out.println();
    });
  }
  
  /**
   * Ini adalah fungsi backtracking yang mencoba menempatkan ratu secara rekursif
   * @param boardSize panjang papan
   * @param arrangements list solusi
   * @param rowIndex index baris yang sedang ditelusuri
   * */
  private static void getSolution(int boardSize, List<List<String>> solutions, int[] columns, int columnIndex){
    if (columnIndex == boardSize){
      List<String> sol = new ArrayList<String>();
      for (int i = 0; i < boardSize; i++){
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < boardSize; j++){
          sb.append(j == columns[i] ? "Q" : ".");
        }
        sol.add(sb.toString());
      }
      solutions.add(sol);
      return;
    }
    for(int rowIndex = 0; rowIndex < boardSize; rowIndex++){
      columns[columnIndex] = rowIndex;
      if(isPlaceCorretly(columns, rowIndex, columnIndex)){
        getSolution(boardSize, solutions, columns, columnIndex + 1);
      }
    }
  }
  /**
   * Ini adalah fungsi yang mengecek apakah ratu dapat ditempatkan di baris dan kolom yang diberikan
   * @param columns array kolom yang sedang ditelusuri
   * @param rowIndex index baris yang sedang ditelusuri
   * @param columnIndex index kolom yang sedang ditelusuri
   */
  private static boolean isPlaceCorretly(int[] columns, int rowIndex, int columnIndex){
    for (int i = 0; i < columnIndex; i++){
      int diff = Math.abs(columns[i] - rowIndex);
      if (diff == 0 || diff == columnIndex - i){
        return false;
      }
    }
    return true;
  }
}
