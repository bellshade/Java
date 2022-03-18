# Queue


>Pengertian Queue


Queue jika diartikan secara umum adalah antrian. Queue sendiri adalah jenis lain dari struktur data linier yang digunakan untuk menyimpan elemen seperti struktur data lainnya tetapi dengan cara tertentu. Queue juga merupakan suatu bentuk khusus dari List Linier dengan operasi penyisipan (insertion) hanya diperbolehkan pada salah satu sisi, yang disebut sisi belakang (REAR) dan operasi penghapusan (deletion) hanya diperbolehkan pada sisi yang lainnya, yang disebut dengan sisi depan (FRONT). Pemrosesan elemen-elemen dalam Queue menggunakan prinsip _First In First Out_ (FIFO) yang berarti elemen pertama masuk dan elemen pertama keluar. 


![Contoh Queue](https://static.javatpoint.com/core/images/java-queue.png)
>>>>>*diatas adalah gambar penerapan Queue


Seperti dengan gambar di atas, kita dapat melihat bahwa antrian adalah struktur data linier dengan dua terminal, yaitu start (depan/FRONT) dan end (belakang/REAR). Komponen ditambahkan di dalam antrian dari ujung belakang antrian dan komponen diekstraksi dari ujung depan antrian


>Queue di Java


Struktur Data Queue diterapin di hampir semua bahasa pemrograman, tak terkecuali Java. Queue Java terdapat dalam packages java util `java.util.Queue` dan bagian dari `Interface Collection` digunakan untuk menampung elemen-elemen Queue yang diproses. Queue ini juga _ordered list of object_  dengan penggunaan nya erbatas untuk menyisipkan elemen di akhir daftar dan menghapus elemen dari awal daftar yaitu mengikuti prinsip FIFO.


>Representasi generik dari interface Java Queue ditunjukan sbg berikut


```java
public interface Queue<T> extends Collection<T>  
```


Setelah tadi dibahas, Queue dalam Java adalah antarmuka (interface), karena itu kita dapat menyebutkkan bahwa Queue tidak dapat digunakan karena antarmuka tadi tidak digunakan. Jika kita ingin mengimplementasikan fungsionalitas antarmuka Queue di Java, maka kita wajib mempunyai beberapa `class` yang solid yang mengimplementasikan antarmuka Antrian. Dalam pemrograman Java, terdapat dua perbedaan `class` yang digunakann untuk mengimplementasikan __Queue Interface_, antara lain:

- [Linked List](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/LinkedList)
- [Priority Queue](https://image.freepik.com/free-vector/neon-style-coming-soon-glowing-background-design_1017-25516.jpg?w=1060)

>Karakteristik Java Queue

Dalam Java Queue, dapat dianggap sebagai salah satu sturkut Data terpenting dalam dunia pemrograman. Java Queue menarik karena sifatnya. Properti signifikan dari struktur data Antrian Java diberikan sebagai berikut:

- Java Queue menggunakan menggunakan prinsip FIFO. Ini menunjukkan bahwa elemen dimasukkan dalam antrian di akhir dan dihilangkan dari depan
- Interface dalam Java Queue memberikan semua aturan dan proses antarmuka Koleksi seperti penyertaan, penghapusan, dll
- Dalam mengimplementasikan Java Queue terdapat memiliki perbedaan 2 `class`, antara lain [Linked List](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/LinkedList) dan [Prority Queue](https://image.freepik.com/free-vector/neon-style-coming-soon-glowing-background-design_1017-25516.jpg?w=1060)
- Terdapat dua jenis Queue yang berlaku dalam Java Queue, antara lain `Unbounded Queue` (antrian tak terbatas) dan `Bounded Queue` (antrian terbatas). Antrian-antrian tersebut merupakan bagian dari `java.util` dikenal sebagai antrian tidak terikat dan antrian terikat adalah antrian yang ada dalam paket `java.util.concurrent;`
- Deque atau _double-ended queue_ juga merupakan jenis Queue yang membawa penyertaan dan penghapusan elemen dari kedua ujungnya. Deque juga dianggap thread-safe.
- Blocking Queue juga merupakan salah satu jenis antrian yang juga thread-safe. Antrian Pemblokiran digunakan untuk mengimplementasikan kueri produsen-konsumen

>Pengimplementasian Java Queue Interface

![Implementasian Java Queue](https://static.javatpoint.com/core/images/java-queue3.png)
![Extends dalam Java Queue](https://static.javatpoint.com/core/images/java-queue4.png)


>Method Java Queue


| Method | Method Prototype | Deskripsi |
| --- | --- | --- |
|`add` | `boolean add(E e)` | Menambahkan elemen `e` ke Queue akhir (end/tail) antrian tanpa melanggar batasan kapasitas _dan_ mengembalikan nilai `true` jika berhasil _atau_ `IllegalStateException` jika kapasitas tersebut habis |
| `peek` | `E peek()` | Mengembalikan kepala (front/head) dalam Queue tanpa menghapusnya |
| `element` | `E element()` | Melakukan operasi yang sama seperti method `peek(0)` _dan_ juga method _void_ `Throws NoSuchElementException` saat antrian kosong |
| `remove` | `E remove()` | Menghapus elemen kepala (**HEAD**) antrian dan mengembalikannya _dan_ juga method _void_ `Throws NoSuchElementException` saat antrian kosong |
| `poll` | `E poll()` | Menghapus elemen kepala (**HEAD**) antrian dan mengembalikannya _tetapi_ jika antrian kosong maka akan mengembalikan nilai `null` |
| `Offer` | `boolean offer(E e)` | Menyisipkan elemen `e` baru ke dalam antrian tanpa melanggar batasan kapasitas |
| `size` | `int size()` | Mengembalikan ukuran _atau_ nomor elemen dalam antrian |


>Pengimplementasian Array Java Queue

Untuk pemgimplementasikan Queue dalam Java tidak semudah pemgimplementasikan Stack. Untuk mengimplementasikan Queue dalam Java kita akan menggunakan [Array](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/Array), pertama kita mendeklarasikan array yang menampung `n` jumlah elemen. Kemudian, kita mendefinisikan dan mengikuti semua operasi-operasi yang ada di bawah ini:

1. Enqueue: Operasi ini digunakan untuk memasukkan elemen di dalam Queue yaitu Enqueue (fungsi Queue dalam program Enqueue). Untuk menyisipkan elemen di bagian belakang, pertama-tama kita perlu memeriksa apakah antrian ini sudah penuh? Jika sudah penuh, maka kita tidak bisa memasukkan elemen tersebut. Jika elemen Queue belakang (REAR) _kurang dari_ elemen `e`, maka kita memasukkan elemen tersebut ke dalam Queue
2. Dequeue: Operasi ini digunakan untuk menghapus elemen di dalam Queue yaitu Dequeue (fungsi antrian Dequeue dalam program). Pertama-tama kita perlu memeriksa apakah antrian ini kosong atau tidak. Agar operasi dequeue berfungsi, setidaknya harus ada satu elemen dalam antrian tersebut
3. Front: Method ini digunakan untuk mengembalikan elemen depan dalam antrian
4. Display: Method ini dapat melintasi antrian dan dapat menampilkan elemen antrian


>Program Java Queue

Pada contoh program ini berisi contoh pengimplementasian Queue menggunakan array pada Java

```java
class Antrian {
    private static int depan, belakang, kapasitas;
    private static int antrian[];

    Antrian(int ukuran) {
        depan = belakang = 0;
        kapasitas = ukuran;
        antrian = new int[kapasitas];
    }
    // menyisipkan elemen baru ke dalam Queue
    static void queueEnqueue(int item) {
        // mengecek apakah antrian sudah penuh
        if(kapasitas == belakang) {
            System.out.printf("\nAntrian sudah penuh\n");
            return;
        }
        // menyisipkan elemen ke belakang (REAR) antrian
        else {
            antrian[belakang] = item;
            belakang++;
        }
        return;
    }

    // menghapus elemen dalam antrian
    static void queueDeque() {
        // mengecek apakah antrian masih kosong
        if(depan == belakang) {
            System.out.printf("\n\nAntrian masih kosong\n\n");
            return;
        }
        // menggeser elemen ke kanan satu tempat ke atas hingga ke belakang
        else {
            for(int i = 0; i < belakang -1; i++) {
                antrian[i] = antrian[i + 1];
            }

            // mengatur elemen belakang (REAR) Queue ke nilai nol (0)
            if(belakang < kapasitas) {
                antrian[belakang] = 0;
                // decrement elemen belakang
                belakang--;
            }
        }
        return;
    }

    // mengeluarkan print output berupa elemen antrian
    static void queueTampilan() {
        int i;
        if(depan == belakang) {
            System.out.println("Antrian kosong\n");
            return;
        }
        // elemen melintasi ke Queue depan (FRONT) dan belakang (REAR)
        for(i = depan; i < belakang; i++) {
            System.out.printf("%d , ", antrian[i]);
        }
        return;
    }

    static void queueDepan() {
        if(depan == belakang) {
            System.out.println("\nAntrian kosong saat ini\n");
            return;
        }
        System.out.printf("\nElemen depan dalam antrian : %d", antrian[depan]);
        return;
    }
}

// mendeklarasikan program utama sebagai program untuk mengeluarkan output
public class Main2 {
    public static void main(String[] args) {

        // membuat antiran dengan berisi 6 elemen
        Antrian q = new Antrian(6);

        System.out.println("Antrian awal : ");
        // mengeluarkan output berupa elemen Queue
        q.queueTampilan();

        // menyisipkan elemen ke dalam antrian
        q.queueEnqueue(10);
        q.queueEnqueue(30);
        q.queueEnqueue(50);
        q.queueEnqueue(70);
        q.queueEnqueue(90);
        q.queueEnqueue(100);

        // print elemen antrian
        System.out.println("Antrian sesudah menggunakan operasi Enqueue : ");
        q.queueTampilan();

        // print elemen depan dalam antrian
        q.queueDepan();

        // menyisipkan elemen ke dalam antrian
        q.queueEnqueue(100);

        // print elemen antrian
        q.queueTampilan();

        q.queueDeque();
        q.queueDeque();
        System.out.printf("\nAntrian setelah melakukan operasi dua Dequeue : ");

        // print elemen antrian
        q.queueTampilan();

        // print elemen depan dalam antrian
        q.queueDepan();
    }
}
```

Output:
```
Antrian awal : 
Antrian kosong

Antrian sesudah menggunakan operasi Enqueue : 
10 , 30 , 50 , 70 , 90 , 100 , 
Elemen depan dalam antrian : 10
Antrian sudah penuh
10 , 30 , 50 , 70 , 90 , 100 , 
Antrian setelah melakukan operasi dua Dequeue : 50 , 70 , 90 , 100 , 100 , 100 , 
Elemen depan dalam antrian : 50
```

>Mengimplementasikan Java Queue menggunakan Linked List

Karena kita mengimplementasikan struktur data Queue menggunakan Array pada program di atas, kita juga dapat mengimplementasikan Queue menggunakan Linked List. Kita dapat menerapkan metode yang sama enqueue, dequeue, front, dan display dalam program ini. Perbedaannya adalah kita akan menggunakan struktur data Daftar [Linked List](https://github.com/bellshade/Java/tree/main/algorithm/data-structure/LinkedList) alih-alih Array


```java
class LinkedListQueue {
    private Node depan, belakang;
    private int ukuranQueue; // ukuran antrian

    // Node dalam Linked List
    private class Node {
        int data;
        Node selanjutnya;
    }

    // konstruktor default - mulanya dari depan (FRONT) dan belakang (REAR) adalah null; ukuran = 0; antrian kosong;
    public LinkedListQueue() {
        depan = null;
        belakang = null;
        ukuranQueue = 0;
    }

    // mengecek apakah antrian tersebut kosong atau tidak
    public boolean isEmpty() {
        return(ukuranQueue == 0);
    }

    // menghapus item dari depan antrian
    public int dequeue() {
        int data = depan.data;
        depan = depan.selanjutnya;

        if(isEmpty()) {
            belakang = null;
        }
        ukuranQueue--;
        System.out.println("Elemen " + data + " dihapus dari antrian");
        return data;
    }

    // menambahkan adata ke belakang antrian
    public void enqueue(int data) {
        Node belakangLama = belakang;
        belakang = new Node();
        belakang.data = data;
        belakang.selanjutnya = null;

        
        if(isEmpty()) {
            depan = belakang;
        } else {
            belakangLama.selanjutnya = belakang;
        }
        ukuranQueue++;
        System.out.println("Elemen " + data + " ditambahkan ke antrian");
    }

    public void print_ElemenDepan() {
        System.out.println("Antrian Depan : " + depan.data
        + " Antrian Belakang : " + belakang.data);
    }
}

class Main {
    public static void main(String[] args) {
        LinkedListQueue var = new LinkedListQueue();

        var.enqueue(290);
        var.enqueue(120);
        var.print_ElemenDepan();
        var.enqueue(50);
        var.enqueue(30);
        var.dequeue();
        var.dequeue();
        var.enqueue(10);
        var.print_ElemenDepan();
    }
}
```

Output:

```
Elemen 290 ditambahkan ke antrian
Elemen 120 ditambahkan ke antrian
Antrian Depan : 290 Antrian Belakang : 120
Elemen 50 ditambahkan ke antrian
Elemen 30 ditambahkan ke antrian
Elemen 290 dihapus dari antrian
Elemen 120 dihapus dari antrian
Elemen 10 ditambahkan ke antrian
Antrian Depan : 50 Antrian Belakang : 10
```


Baik, itu saja pengertian dari Struktur Data Queue, bagi kalian yang ingin langsung mencoba, kalian bisa melihat lagi materinya dalam berupa _Source-Code_ [disini](https://image.freepik.com/free-vector/neon-style-coming-soon-glowing-background-design_1017-25516.jpg?w=1060) _atau_ kalian bisa melihat materi Queue selanjutnya, masih berkaitan dengan Queue yakni [Priority Queue](https://image.freepik.com/free-vector/neon-style-coming-soon-glowing-background-design_1017-25516.jpg?w=1060).