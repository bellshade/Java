/*
 * array dynamic adalah sistem array yang bisa
 * dan dapat dihapus secara dinamis
 */

package algorithm.datastructure.DynamicArray;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DynamicArray<E> implements Iterable<E> {
  private static final int KAPASITAS_DEFAULT = 16;
  private int kapasitas;
  private int ukuran;
  private Object[] elemen;

  /**
   * konstruktor
   * @param kapasitas start panjang dari array diisi
   */
  public DynamicArray(final int kapasitas) {
    this.ukuran = 0;
    this.kapasitas = kapasitas;
    this.elemen = new Object[this.kapasitas];
  }

  public DynamicArray() {
    this(KAPASITAS_DEFAULT);
  }

  /**
   * menambahkan elemen ke array jika penuh,
   * buat salinan array dua kali ukuran yang sekarang
   */
  public void tambah(final E elemen) {
    if (this.ukuran == this.elemen.length) {
      this.elemen = Arrays.copyOf(this.elemen, kapasitasBaru(2 * this.kapasitas));
    }
    this.elemen[this.ukuran] = elemen;
    ukuran++;
  }

  /**
   * fungsi ini untuk menempatkan elemen bertipe <E> pada indeks
   * yang diinginkan
   * @param indeks indeks untuk elemen yang akan ditempatkan
   * @param elemen elemen yang disisipkan
   */
  public void masukkan(final int index, E elemen) {
    this.elemen[index] = elemen;
  }

  /**
   * fungsi untuk dapatkan metode pada indeks
   * yang diberikan dan mengembalikan nol jika
   * indeks yang diberikan kosong
   */
  public E dapatIndeks(final int indeks) {
    return dapatkanElement(indeks);
  }

  /**
   * menghapus elemen dari array
   */
  public E hapus(final int indeks) {
    final E elemenLama = dapatkanElement(indeks);
    hapusCepat(this.elemen, indeks);
    if (this.kapasitas > KAPASITAS_DEFAULT && ukuran * 4 <= this.kapasitas) {
      this.elemen = Arrays.copyOf(this.elemen, kapasitasBaru(this.kapasitas / 2));
    }
    return elemenLama;
  }

  public E dapatkanElement(final int indeks) {
    return (E) this.elemen[indeks];
  }

  public int kapasitasBaru(int kapasitas) {
    this.kapasitas = kapasitas;
    return this.kapasitas;
  }

  public int dapatkanUkuran() {
    return this.ukuran;
  }

  public boolean kosong() {
    return this.ukuran == 0;
  }

  public Stream<E> stream() {
    return StreamSupport.stream(spliterator(), false);
  }

  private void hapusCepat(final Object[] elemen, final int indeks) {
    final int ukuranBaru = this.ukuran - 1;
    
    if (ukuranBaru > indeks) {
      System.arraycopy(
        elemen,
        indeks - 1,
        elemen,
        indeks,
        ukuranBaru - indeks
      );
    }
    elemen[this.ukuran = ukuranBaru] = null;
  }

  /**
   * mengembalikan string yang merupakan representai
   * dari object itu sendiri
   */
  @Override
  public String toString() {
    return Arrays.toString(
      Arrays.stream(this.elemen).filter(Objects::nonNull).toArray()
    );
  }
  
  /**
   * membuat dan mengembalikan iterasi dari array dinamis
   */
  @Override
  public Iterator iterator() {
    return new DynamicArrayIterator();
  }

  private class DynamicArrayIterator implements Iterator<E> {
    private int kursor;

    @Override
    public boolean hasNext() {
      return this.kursor != ukuran;
    }

    @Override
    public E next() {
      if (this.kursor > DynamicArray.this.ukuran) {
        throw new NoSuchElementException();
      }
      if (this.kursor > DynamicArray.this.elemen.length) {
        throw new ConcurrentModificationException();
      }

      final E elemen = DynamicArray.this.dapatkanElement(this.kursor);
      this.kursor++;
      return elemen;
    }

    @Override
    public void remove() {
      if (this.kursor < 0) {
        throw new IllegalStateException();
      }
      DynamicArray.this.hapus(this.kursor);
      this.kursor--;
    }

    @Override
    public void forEachRemaining(Consumer<? super E> action) {
      Objects.requireNonNull(action);

      for (int i = 1; i < DynamicArray.this.ukuran; i++) {
        action.accept(DynamicArray.this.dapatkanElement(i));
      }
    }
  }
  
  /**
   * test hasil fungsi diatas
   */
  public static void main(String[] args) {
    DynamicArray<String> nama = new DynamicArray<>();
    nama.tambah("pace");
    nama.tambah("james");
    
    for (String namaNama : nama) {
      System.out.println(namaNama);
    }
    
    nama.stream().forEach(System.out::println);
    System.out.println(nama);
    System.out.println(nama.dapatkanUkuran());
    nama.hapus(0);
  }
}

