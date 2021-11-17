# Java Abstraction

_Abstraction Class_ atau Kelas Abstrak adalah kelas _setengah jadi_ yang tidak bisa digunakan sebagai objek
dan memiliki _[method](https://github.com/bellshade/Java/tree/main/basic/MethodJava)_ abstrak atau non-abstrak.

Biasanya kelas abstrak digunakan untuk _Cetak Biru_ dalam pembuatan kelas turunan nya.

Kelas abstrak ini adalah salah satu karakteristik OOP [inheritance](https://github.com/bellshade/Java/tree/main/intermediate/JavaInheritance),
dimana dimungkinkan untuk mewarisi metode abstrak atau non-abstrak dari satu kelas abstrak ke kelas lainnya,
dimana memiliki kategori kelas sebagai berikut :

- subclass (child)
  kelas yang mewarisi dari kelas lain, dan melengkapi method yang diwariskan

- superclass (abstrak)
  kelas yang akan mewarisi method

untuk mewarisi dari kelas gunakan key `extends`

contoh

```java
abstract class Binatang{
  public abstract void kakiBinatang();
  protected void suaraBinatang(String suara) {
    System.out.println("bersuara "+suara);
  }

class Kucing extends Binatang{
  public String nama = "Kucing";

  @Override
  public void kakiBinatang() {
    System.out.println("memiliki 4 kaki");
  }
}

class Bebek extends Binatang{
  public String nama = "Bebek";

  @Override
  public void kakiBinatang() {
    System.out.println("memiliki 2 kaki");
  }
}

class abstrakTutorial{
  public static void main(String[] args){
    Kucing peliharaanSaya = new Kucing();
    System.out.println(peliharaanSaya.nama); // output : Kucing
    peliharaanSaya.kakiBinatang(); // output : memiliki 4 kaki
    peliharaanSaya.suaraBinatang(); // output : bersuara meow meow

    Bebek mentok = new Bebek();
    System.out.println(mentok.nama); // output : Bebek
    mentok.kakiBinatang(); // output : memiliki 2 kaki
    mentok.suaraBinatang("wek wek"); // output : bersuara wek wek
  }
}
```

## Kapan harus menggunakan kelas Abstrak ?

Jika kita lihat di [inheritance](https://github.com/bellshade/Java/tree/main/intermediate/JavaInheritance),
_superclass_ yang digunakan dalam **pewarisan** adalah kelas normal dan bukan kelas abstrak.

Ada beberapa kasus dimana sebuah kelas tidak perlu diinisiasi menjadi objek. sehingga cukup dijadikan kelas abstrak saja

contoh kasus :

kelas `Binatang` tidak perlu dibuat sebuah objek, karena hanya berisi sifat-sifat yang harus dimiliki oleh binatang pada umumnya.

Sehingga kelas `Binatang` dibuat menjadi kelas abstrak dan didalam nya method abstrak untuk diwariskan ke kelas turunannya seperti `Kucing` dan `Bebek`
