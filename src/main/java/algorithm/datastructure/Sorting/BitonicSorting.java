package algorithm.datastructure.Sorting;

/**
 * bitonic sorting adalah algoritma paralel untuk
 * pengurutan. ini juga digunakan sebagai metode
 * untuk membangun jaringan pernyortiran. algoritma
 * ini dibangun oleh Ken Batcher
 */
public class BitonicSorting{
  /*
   * parameter dir menunjukkan arah pengurutan.
   * ASCENDING atau DESCENDING
   */
  void Swap(int a[], int i, int j, int dir) {
    if ((a[i] > a[j] && dir == 1) || (a[i] < a[j] && dir == 0)) {
      // swap element
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }

  /**
   * secara rekursif akan mengurutkan bitonic menaik
   * urutan, jika dir=1, dan dalam urutan menurun 
   * maka sebaliknya (dir=0). urutan yang akan diurutkan
   * dimulai pada posisi indeks renda, parameter cnt adalah
   * angka element yang diurutkan
   */
  void bitonicMerge(int a[], int low, int cnt, int dir) {
    if (cnt > 1) {
      int k = cnt / 2;
      for (int i = low; i < low + k; i++) {
        Swap(a, i, i + k, dir);
      }
      bitonicMerge(a, low, k, dir);
      bitonicMerge(a, low + k, k, dir);
    }
  }

  /*
   * fungsi ini pertama dalam menghasilkan urutan bitonic
   * oleh menyortir dua bagian secara rekursif dalam
   * penyortiran yang berlawan
   */
  void bitonicSort(int a[], int low, int cnt, int dir) {
    if (cnt > 1) {
      int k = cnt / 2;
      // urutkan dalam urutan menaik karena dir disini
      // adalah 1
      bitonicSort(a, low, k, 1);
      // urutkan dalam urutan menurun karena dir disini 
      // adalah 0
      bitonicSort(a, low + k, k, 0);
      bitonicMerge(a, low, cnt, dir);
    }
  }

  void sort(int a[], int N, int up) {
    bitonicSort(a, 0, N, up);
  }

  // fungsi utilitas untuk mencetak array n
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int a[] = { 3, 7, 4, 8, 6, 2, 1, 5 };
    int up = 1;
    BitonicSorting bs = new BitonicSorting();
    bs.sort(a, a.length, up);
    System.out.println("\narray yang ke sorting");
    printArray(a);
  } 
}
