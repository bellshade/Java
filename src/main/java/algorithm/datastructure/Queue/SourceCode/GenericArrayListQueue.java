package algorithm.datastructure.Queue.SourceCode;

import java.util.ArrayList;

/**
 * struktur data GenericArrayListQueue berfungsi sama
 * seperti yang lain, antrian yang dibuat khusus
 * GenericArrayListQueue menyimpan elemen bertipe
 * yang akan ditentukan oleh runtime. elemen yang
 * ditambahkan pertama adalah yang pertama
 * untuk dihapus (menggunakan FIFO). elemen baru
 * ditambahkan ke belakang antrian
 */
public class GenericArrayListQueue<T> {
  // array list generik untuk antrian T adalah
  // elemen generik
  ArrayList<T> _queue = new ArrayList<>();

  /*
   * cek jika queue memiliki elemen (tidak kosong)
   */
  private boolean hasElements() {
    return !_queue.isEmpty();
  }

  /**
   * memeriksa apakah ada di depan antrian
   */
  public T peek() {
    T result = null;
    if (this.hasElements()) {
      result = _queue.get(0);
    }
    return result;
  }

  /**
   * menyisipkan elemen tipe T ke antrian
   */
  public boolean add(T element) {
    return _queue.add(element);
  }

  /**
   * ambil apa yang ada di depan antrian
   */
  public T pull() {
    T result = null;
    if (this.hasElements()) {
      result = _queue.remove(0);
    }
    return result;
  }

  public static void main(String[] args) {
    GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
    assert queue.peek() == null;
    assert queue.pull() == null;
    assert queue.add(1);
    assert queue.peek() == 1;
  }
}
