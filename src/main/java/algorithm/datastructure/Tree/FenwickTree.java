/**
 * Fenwick tree atau pohon berindeks biner
 * adalah strutktur data yang dapat secara efisien
 * memperbarui elemen dan menghitung jumlah awalan
 * dalam tabel angka
 * space:
 *  - rata-rata : O(n)
 *  - terburuk : O(n)
 * contoh:
 * B = [1, 2, 3, 4, 5]
 * update(2, 3) = [1 5 3 4, 5]
 * query(2) = 5, query(3) = 3
 */
package algorithm.datastructure.Tree;

public class FenwickTree {
  private int n;
  private int fen_t[];

  /**
   * konstruktpr yang mengambil ukuran array
   * sebagai parameter
   */
  public FenwickTree(int n) {
    this.n = n;
    this.fen_t = new int[n + 1];
  }

  /**
   * fungsi yang kan menambahkan elemen val pada
   * indeks i
   */
  public void update(int i, int val) {
    i += i;
    while (i <= n) {
      fen_t[i] += val;
      i += i & (-i);
    }
  }

  /**
   * fungsi yang akan mengembalikan jumlh 
   * kumulatif dari indeks 1 ke indeks i
   */
  public int query(int i) {
    i += 1;
    int cumSum = 0;
    while (i > 0) {
      cumSum += fen_t[i];
      i -= i & (-i);
    }
    return cumSum;
  }
}
