# Linked List

>Pengertian Dasar Linked List

Struktur Data berikut adalah Linked List. Linked List adalah strukut data linier seperti [Array](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Array). Tidak seperti Array, Linked List memiliki elemen yang tidak disimpan di lokasi yang berdekatan. elemen-lemen pada Linked List berdekatan dengan _pointer_. 

>Linked List dalam Java

Linked List diterapkan di seluruh bahasa pemrograman, ta terkecuali Java. Linked List dalam Java adalah bagian _framework collection_ yang berada dalam `java.util` packages. `class` Java Linked List menggunakan Linked List ganda (doubly linked list) untuk menyimpan elemen-elemen. Tersedia dalam Linked List, juga mewarisi (_inhertiance_) AbstractList class dan mengimplementasikann antar muka [List](https://image.freepik.com/free-vector/coming-soon-construction-illustration-design_1017-31446.jpg) dan [Deque](https://image.freepik.com/free-vector/coming-soon-construction-illustration-design_1017-31446.jpg). 

Poin-poin penting dalam Java Linked List:

- `class` Java Linked List dapat berisikan elemen-elemen yang di duplikasikan
- `class` Java Linked List dapat berisikan untuk mempertahankan urutan penyisipan
- `class` Java Linked List tidak dapat di sinkronisasikan
- `class` Java Linked List memiliki manipulasi yang cepat, hal itu menyebabkan tidak perlu terjadi pergeseran
- `class` Java Linked List bisa digunakan sebagai [List](https://image.freepik.com/free-vector/coming-soon-construction-illustration-design_1017-31446.jpg), [Stack](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Stack), dan [Queue](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Queue)

> Bagaimana Linked List bekerja secara internal?
>
Karena Linked List adalah [array](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Array) dinamis, kita tidak perlu mendeklarasikan besarnya ukuran tersebut, ukuran `list` secara otomatis bertambah saat kita menambahkan dan menghapus item secara dinamis. Dan juga, elemen-elemen tidak disimpan secara terus menerus. Oleh karena itu tidak diperlukan untuk menambahkan ukuran `list` dari Linked List tersebut. Secara internal, Linked List di Java diimplementasikan menggunakan struktur data [Linked List Ganda (Double Linked List)](https://slideplayer.info/slide/13587451/). Kami menyarankan anda memahami teerlebih dulu struktur data Linked List secara umum [disini](https://osf.io/53k7h)

![Linked List Ganda yang diimplementasikan di Struktur Data Java](https://static.javatpoint.com/images/doubly-linked-list.png)

> pendeklarasian `class` LinkedList

berikut adaslah contoh pendeklarasian `java.util.LinkedList;` class

```java
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable 
```

> `Constructors` di Java Linked List

| Constructors | Penjelasan |
| --- | --- |
| `LinkedList()` | digunakan untuk membuat daftar kosong (`null` `list`) |
| `LinkedList(Collection<? extends E> c)` | digunakan untuk membuat `list` yang berisi elemen-elemen dari koleksi yang ditentukan, di dalam urutan tersebut, dikembalikan oleh iterator koleksi |

> `Methods` dalam Java Linked List

| Methods | Penjelasan |
| --- | --- |
| `boolean add(E e)` | digunakan untuk menambahkan elemen yang ditentukan ke akhir `list` |
| `void add(int index, E element)` | digunakan untuk menyisipkan elemen tertentu pada indeks posisi yang ditentukan dalam `list` |
| `boolean addAll(Collection<? extends E> c)` | digunakan untuk menambahkan semua elemen dalam koleksi yang ditentukan ke akhir `list`, di dalam urutan yang dikembalikan oleh iterator koleksi yang ditentukan |
| `boolean addAll(Collection<? extends E> c)` | digunakan untuk menambahkan semua elemen-elemen ke dalam koleksi yang ditentukan ke akhir `list`, di dalam urutan dikembalikan oleh iterator koleksi yang ditentukan |
| `boolean addAll(int index, Collection<? extends E> c)` | digunakan untuk menambahkan semua elemen-elemen ke koleksi yang ditentukan, dimulai di posisi `list` yang ditentukan |
| `void addFirst(E e)` | digunakan untuk menyisipkan pemberian elemen di awal `list` |
| `void addLast(E e)` | digunakan untuk menambahkan pemberian elemen di akhir `list` |
| `void clear()` | digunakan untuk menghapus semua elemen dari `list` tersebut |
| `Object clone()` | digunakan untuk mengembalikan salinan dangkal dari [Array List](https://image.freepik.com/free-vector/coming-soon-construction-illustration-design_1017-31446.jpg) |
| `boolean contains(Object o)` | digunakan untuk mengembalikan nilai `true` jika `list` berisikan elemen yang ditentukan |
| `Iterator<E> descendingIterator()` | digunakan untuk mengembalikan iterator di atas elemen-elemen dalam `deque` dalam urutan sequnetial |
| `E element()` | digunakan untuk mengambil elemen pertama pada `list` |
| `E get(int index)` | digunakan untuk mengembalikan elemen di dalam posisi `list` yang telah ditentukan |
| `E getFirst()` | digunakan untuk mengembalikan elemen pertama pada `list` |
| `E getLast()` | digunakan untuk mengembalikan elemen terakhir pada `list` |
| `intIndexOf(Object o)` | digunakan untuk mengembalikan indeks `list` kemunculan terakhir dari elemen yang ditentukan, atau `-1` jika list tidak berisikan elemen apapun |
| `ListIterator<E> listIterator(int index)` | digunakan untuk mengembalikan elemen _list-iterator_ ke dalam urutan yang benar, mulai dari posisi yang ditentukan dalam `list` |
| `boolean offer(E e)` | menambahkan elemen yang ditentukan sebagai elemen terakhir dari `list` |
| `boolean offerFirst(E e)` | menyisipkan elemen elemen yang ditentukan di bagian depan `list` |
| `boolean offerLast(E e)` | menyisipkan elemen elemen yang ditentukan di bagian belakang `list` |
| `E peek()` | mengambil elemen pertama dalam `list` |
| `E peekFirst()` | mengambil elemen pertama dalam dari `list` _atau_ mengembalikan nilai nol (`null`) jika `list` tersebut kosong |
| `E peekLast()` | mengambil elemen terakhir dalam dari `list` _atau_ mengembalikan nilai nol (`null`) jika `list` tersebut kosong |
| `E poll()` | mengambil dan menghapus elemen pertama dalam `list` |
| `E pollFirst()` | mengambil dan menghapus elemen pertama dalam `list` _atau_ mengembalikan nilai nol (`null`) jika `list` tersebut kosong |
| `E pollLast()` | mengambil dan menghapus elemen terakhir dalam `list` _atau_ mengembalikan nilai nol (`null`) jika `list` tersebut kosong |
| `pop()` | memunculkan elemen dari [`Stack`](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Stack) yang diwakili oleh `list` |
| `void push(E e)` | mendorong elemen ke [`Stack`](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Stack) yang diwakili oleh `list` |
| `E remove()` | digunakan untuk menghapus atau mengembalikan elemen pertama dalam `list` |
| `E removeFirst()` | menghapus dan mengembalikan elemen pertama dari `list` |
| `E removeLast()` | menghapus dan mengembalikan elemen terakhir dari `list` |
| `E remove(int index)` | digunakan untuk menghapus elemen di posisi tertentu dalam `list` |
| `boolean remove(Object o)` | digunakan untuk menghapus kemunculan pertama dari elemen yang ditentukan dalam `list` |
| `boolean removeFirstOccurrence(Object o)` | digunakan untuk menghapus kemunculan pertama dari elemen yang ditentukan dalam `list` (digunakan saat melintasi daftar dari kepala ke ekor) |
| `boolean removeLastOccurrence(Object o)` | digunakan untuk menghapus kemunculan terakhir dari elemen yang ditentukan dalam `list` (digunakan saat melintasi daftar dari kepala ke ekor) |
| `E set(int index, E element)` | digunakan untuk menggantikan elemen di posisi yang ditentukan dalam `list` dengan elemen yang ditentukan |
| `Object[] toArray()` | digunakan untuk mengembalikan [array](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Array) yang berisi semua elemen dalam `list` dan di dalam urutan yang benar(dari elemen pertama hingga terakhir) |
| `<T> T[] toArray(T[] a)` | digunakan untuk mengembalikan [array](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Array) yang berisi semua elemen dalam urutan yang tepat (dari elemen pertama hingga terakhir); tipe _runtime_ dari array yang dikembalikan adalah array yang ditentukan |
| `int size()` | digunakan untuk mengembalikan nomor elemen yang berada di dalam `list` |

>Contoh Java Linked List

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // mendeklarasikan variabel untuk Linked List, di bawah ini berbentuk String
        LinkedList<String> str = new LinkedList<String>();

        // mengisi bagian-bagian Linked List yang di deklarasikan tadi
        str.add("Satu");
        str.add("Dua");
        str.add("Tiga");
        str.add("Empat");
        str.add("Lima");

        // mendeklarasikan method iterator melalui variabel Iterator. Iterator sendiri digunakan sebagai perulangan, disini perulangan akan menggunakabn variabel dari Linked List
        Iterator<String> itr = str.iterator();

        // dari variabel Iterator, diterapkan perulangan while 
        while(itr.hasNext()) {
            // mebncetak output
            System.out.println(Itr.next());
        }
    }
}
```

Output:
```
Satu
Dua
Tiga
Empat
Lima
```

>Contoh Java Linked List menambahkan elemen ke `list`

```java
import java.util.LinkedList;  

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        System.out.println("Awal elemen list: " + lst);

        lst.add("Satu");
        lst.add("Dua");
        lst.add("Tiga");
        System.out.println("Setelah memanggil method add(E e) : " + lst);

        // menambahkan sebuah elemen pada posisi terentu
        // seperti dibahas di awal, semua elemen dalam list ini meiliki artian sama seperti array
        lst.add(2, "Empat");
        System.out.println("Setelah memanggil method add(int index, E element) : " + lst);

        LinkedList<String> arr = new LinkedList<String>();
        arr.add("Lima");
        arr.add("Enam");

        lst.addAll(arr);
        System.out.println("Setelah menambahkan method addAll(Collection<? extends E> c) : " + lst);

        LinkedList<String> num = new LinkedList<String>(); 
        num.add("Tujuh");
        num.add("Delapan");

        lst.addAll(5, num);
        System.out.println("Setelah menambahkan method addAll(int index, Collection<? extends E> c) : " + lst);

        lst.addFirst("Nol");
        System.out.println("Setelah menambahkan method addFirst(E e) : " + lst);

        lst.addLast("Sembilan");
        System.out.println("Setelah menambahkan method addLast(E e) : " + lst);
    }
}
```

>Contoh Java Linked List untuk menghapus elemen

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("Satu");
        lst.add("Dua");
        lst.add("Tiga");
        lst.add("Empat");
        lst.add("Lima");
        lst.add("Enam");
        lst.add("Tujuh");
        lst.add("Delapan");
        lst.add("Sembilan");
        lst.add("Sepuluh");
        System.out.println("Elemen list awal : " + lst);

        // menghapus elemen yang ditentukan di Array List
        lst.remove("Sepuluh");
        System.out.println("Setelah menambahkan method remove(object) : " + lst);

        // menghapus elemen dalam basis yang ditentukan
        lst.remove(8);
        System.out.println("Setelah menambahkan method remove(index) : " + lst);

        // medeklarasikan Linked List baru dengan sebuah variabel
        LinkedList<String> arr = new LinkedList<String>();
        arr.add("Sembilan");
        arr.add("Sepuluh");

        // menambahkan elemen baru ke ArrayList
        lst.addAll(arr);
        System.out.println("List Terbaru setelah menambahkan method addAll(Collection<? extends E> c) : " + lst);

        // menghapus semua elemen baru dalam Linked List
        lst.removeAll(arr);
        System.out.println("Setelah menambahkan method removeAll() : " + lst);

        // menghapus elemen pertama dalam list
        lst.removeFirst();
        System.out.println("Setelah menambahkan method removeFirst() : " + lst);

        // menghapus elemen akhir dalam list
        lst.removeLast();
        System.out.println("Setelah menambahkan method removeLast() : " + lst);

        // menghapus elemen kejadian pertama dari list
        lst.removeFirstOccurrence("Dua");
        System.out.println("Setelah menambahkan method removeFirstOccurrence() : " + lst);

        // menghapus elemen kejadian akhir dari list
        lst.removeLastOccurrence("Tujuh");
        System.out.println("Setelah menambahkan method removeLastOccurrence() : " + lst);

        // menghapus semua elemen dari list
        lst.clear();
        System.out.println("Setelah menambahkan method clear() : " + lst);
    }
}
```

Output:

```
Elemen list awal : [Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan, Sembilan, Sepuluh]
Setelah menambahkan method remove(object) : [Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan, Sembilan]
Setelah menambahkan method remove(index) : [Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan]
List Terbaru setelah menambahkan method addAll(Collection<? extends E> c) : [Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan, Sembilan, Sepuluh]
Setelah menambahkan method removeAll() : [Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan]
Setelah menambahkan method removeFirst() : [Dua, Tiga, Empat, Lima, Enam, Tujuh, Delapan]
Setelah menambahkan method removeLast() : [Dua, Tiga, Empat, Lima, Enam, Tujuh]
Setelah menambahkan method removeFirstOccurrence() : [Tiga, Empat, Lima, Enam, Tujuh]
Setelah menambahkan method removeLastOccurrence() : [Tiga, Empat, Lima, Enam]
Setelah menambahkan method clear() : []
```

>Contoh Java Linked List untuk membalikkan elemen

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // mendeklarasikan Linked List baru
        LinkedList<String> brr = new LinkedList<String>();
        brr.add("Satu");
        brr.add("Dua");
        brr.add("Tiga");

        // mengubah elemen dalam list dengan urutan yang terbalik
        Iterator i = brr.descendingIterator(); 
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
```

Baik, itu saja dokumentasi penjelasan mengenai Linked List, selanjutnya kamu dapa mencoba program diatas, atau kamu bisa langsung mencobanya [disini](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/LinkedList/SourceCode)
