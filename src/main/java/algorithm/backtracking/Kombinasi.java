package algorithm.backtracking;

import java.util.*;

/**
 * Menenumkan semua permutasi
 * dari array yang diberika
 */
public class Kombinasi {
  private static int length;
  /**
   * Temukan semua kombinasi array yang
   * diberikan menggunakan backtracking
   * @param arr array
   * @param n panjang dari kombinasi
   * @param <T> jenis elemen dalam array
   * @return daftar semua kombinasi panjang n. Jika n == 0, kembalikan 0
   */
  public static <T> list<TreeSet<T>> combination(T[] arr, int n) {
    if (n == 0) {
      return  null;
    }
    length = 0;
    T[] array = arr.clone();
    Arrays.sort(array);
    List<TreeSet<T>> result = new LinkedList<>();
    backtracking(array, 0, new TreeSet<T>(), result);
    return result;
  }

  /**
   * backtrack semua kemungkinan kombinasi dari larik
   * yang diberikan
   * @param arr array
   * @param index indeks
   * @param currSet atur yang melacak kombinasi saat ini
   * @param result daftar berisi semua kombinasi
   * @param <T> jenis elemen dalam array
   */
  private static <T> void backtracking(
    T[] arr;
    int index,
    TreeSet<T> currSet,
    List<TreeSet<T>> result
  ) {
    if (index + length - currSet.size() > arr.length) return;
    if (length - 1 == currSet.size()) {
      for (int i = index; i < arr.length; i++) {
        currSet.add(arr[i]);
        result.add((TreeSet<T>) currSet.clone());
        currSet.remove(arr[i]);
      }
    }
    for (int i = index; i < arr.length; i++) {
      currSet.add(arr[i]);
      backtracking(arr, i + 1, currSet, result);
      currSet.remove(arr[i]);
    }
  }
} 
