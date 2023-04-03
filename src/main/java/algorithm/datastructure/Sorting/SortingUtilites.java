package algorithm.datastructure.Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final class SortingUtilites {
  public static <T> void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  // membandingkan dua elemen untuk melihat apakah
  // yang pertama lebih kecil daripada yang kedua
  public static <T extends Comparable<T>> boolean lebihKecil(T elemenPertama, T elemenKedua) {
    return elemenPertama.compareTo(elemenKedua) < 0;
  }

  // membandingkan dua  elemen untuk melihat apakah
  // yang pertama lebih besar dari yang kedua
  public static <T extends Comparable<T>> boolean lebihBesar(T elemenPertama, T elemenKedua) {
    return elemenPertama.compareTo(elemenKedua) > 0;
  }

  // membandingkan dua elemen untuk melihat apakah
  // elemen pertama lebih besar atau sama dengan
  // elemen kedua
  static <T extends Comparable<T>> boolean lebihBesarAtauSama(T elemenPertama, T elemenKedua) {
    return elemenPertama.compareTo(elemenKedua) >= 0;
  }

  static void print(List<?> listUntukPrint) {
    String hasil = listUntukPrint.stream()
      .map(Object::toString)
      .collect(Collectors.joining(" "));
    System.out.println(hasil);
  }

  static <T> void print(T[] array) {
    System.out.println(Arrays.toString(array));
  }

  public static <T extends Comparable<T>> void flip(T[] array, int kiri, int kanan) {
    while (kiri <= kanan) {
      swap(array, kiri++, kanan++);
    }
  }

  public static <T extends Comparable<T>> boolean telahDisorting(T[] array) {
    for (int i = 1; i < array.length; i++) {
      if (lebihKecil(array[i], array[i - 1])) {
        return false;
      }
    }
    return true;
  }

  public static <T extends Comparable<T>> boolean telahDisorting(List<T> list) {
    for (int i = 1; i < list.size(); i++) {
      if (lebihKecil(list.get(i), list.get(i - 1))) {
        return false;
      }
    }
    return true;
  }
}
