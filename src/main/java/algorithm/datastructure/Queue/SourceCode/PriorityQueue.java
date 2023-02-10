package algorithm.datastructure.Queue.SourceCode;

/**
 * priority queue menambahkan elemen ke posisi
 * berdasarkan prioritasnya.
 * sehigga elemen terpenting ditempatkan di atas.
 * dalam contoh ini
 * diberikan angka yang lebih besar, prioritas
 * lebih tinggi. antrian dalam teori ini adalah tidak ada
 * ukuran tetap tetapi kita menggunakan implementasi array
 * benar
 */
class PriorityQueue {
  private int maxSize;
  private int[] queueArray;
  private int nItems;
  
  public PriorityQueue() {
    /* jika kapasitas tidak ditentukan, ukuran standar 11
     * akan diguankan
     * capacity = max + 1
     * karena kita tidak dapat mengakses elemen ke-0 dari PQ,
     * dan ke
     * mengakomodir (maks) elemen yang diperlukan kapasitas
     * menjadi maks+1
     * induk di posisi k, anak di posisi (k*2, k*2+1),jika
     * kita gunakan posisi 0 dalam antrian kita,anaknya akan
     * berada di = *(0*2,0*2 + 1) ->(0,0).
     * inilah mengapa kita mulai dari posisi 1
     */
    int size = 11;
    maxSize = size + 1;
    queueArray = new int[maxSize];
    nItems = 0;
  }

  /**
   * konstruktor dari parmater
   * @param size
   */
  public PriorityQueue(int size) {
    maxSize = size + 1;
    queueArray = new int[maxSize];
    nItems = 0;
  }

  /*
   * fungsi pembantu untuk implementasi PQ max-heap
   * fungsi akan membantu menurunkan simpul
   * induk ke yang benar
   */
  private void swim(int pos) {
    while (pos > 1 && (queueArray[pos / 2] < queueArray[pos])) {
      int temp = queueArray[pos];
      queueArray[pos] = queueArray[pos / 2];
      queueArray[pos / 2] = temp;
      pos = pos / 2;
    }
  }

  /**
  * fungsi pembantu untuk implementasi PQ max-heap
  * fungsi akan membantu menurunkan simpul induk 
  * ke posisi yang benar
  */
  private void sink(int pos) {
    // periksa apakah posisi simpul adalah simpul induk
    while (2 * pos <= nItems) {
      int current = 2 * pos;
      // lompat ke posisi simpul anak
      // bandingkan kedua anaknya dengan anaknya dengan
      // yang lebih besar
      if (current < nItems && queueArray[current] < queueArray[current + 1]) current++;
      // jika node induk lebih besar, operasi sink selesai
      // maka kita putuskan lingkarannya
      if (queueArray[pos] >= queueArray[current]) break;
      // jika tidak menukar
      int temp = queueArray[pos];
      queueArray[pos] = queueArray[current];
      queueArray[current] = temp;
      pos = current;
      // tukarkan posisi induk ke posisi child dalam larik
    }
  }

  public void insert(int value) {
    if (isFull()) {
      throw new RuntimeException("queue is penuh");
    } else {
      queueArray[++nItems] = value;
      swim(nItems);
    }
  }

  public int remove() {
    if (isEmpty()) {
      throw RuntimeException("queue kososng");
    } else {
      int max = queueArray[1];

      // swap max adn last element
      int temp = queueArray[1];
      queueArray[1] = queueArray[nItems];
      queueArray[nItems] = temp;
      queueArray[nItems--] = 0;
      sink(1);

      return max;
    }
  }

  /**
    * memeriksa apayang ada di depan
    * antrian
    */
  public int peek() {
    return queueArray[1];
  }

  /**
    * return true jika queue kosong
    */
  public boolean isEmpty() {
    return (nItems == 0);
  }

  /**
    * return true jika queue full
    */
  public boolean isFull() {
    return (nItems == maxSize - 1);
  }

  public int getSize() {
    return nItems;
  }
}
