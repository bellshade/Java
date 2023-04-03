package algorithm.datastructure.Sorting;

import static algorithm.datastructure.Sorting.SortingUtilites.*;

/**
 * salah satu algoritma sorting tercepat adalah quick sort
 * yaitu dengan cara membagi list dengan menggunakan sebuah pivot.
 * algoritma ini dikenal sebagai partition-exchange sort atau sorting
 * pergantian pembagi.
 * dalam perakteknya adalah yang tercepat dari berbagai algoritma
 * pengurutan dengan perbandingan, seperti merge sort atau heap sort
 * melakukan proses langsung pada input (in-place) dengan sedikit
 * tambahan memori. bekerja dengan baik pada berbagai jenis input
 * data (seperti angka dan karakter).
 */

class QuickSort implements AlgoritmaSorting {
  // method untuk implementasi dari generic quick sorting
  @Override
  public <T extends Comparable<T>> T[] sorting(T[] array) {
    lakukanSorting(array, 0, array.length - 1);
    return array;
  }

  // fungsi fungsi proses dari sorting
  private static <T extends Comparable<T>> void lakukanSorting(T[] array, int kiri, int kanan) {
    if (kiri < kanan) {
      int pivot = partisiAcak(array, kiri, kanan);
      lakukanSorting(array, kiri, pivot - 1);
      lakukanSorting(array, pivot, kanan);
    }
  }
  // acak array untuk menghindari urutan yang pda dasarnya
  // sudah di order
  private static <T extends Comparable<T>> int partisiAcak(
    T[] array,
    int kiri,
    int kanan
  ) { 
    int indeksAcak = kiri + (int)(Math.random() * (kanan - kiri + 1));
    swap(array, indeksAcak, kanan);
    return partisi(array, kiri, kanan);
  }

  private static <T extends Comparable<T>> int partisi(T[] array, int kiri, int kanan) {
    int mid = (kiri + kanan) >>> 1;
    T pivot = array[mid];

    while (kiri <= kanan) {
      while (lebihKecil(array[kiri], pivot)) {
        ++kiri;
      }
      while (lebihKecil(pivot, array[kanan])) {
        --kanan;
      }
      if (kiri <= kanan) {
        swap(array, kiri, kanan);
        ++kiri;
        --kanan;
      }
    }
    return kiri;
  }
}


