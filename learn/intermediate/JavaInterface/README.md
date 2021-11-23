# Java Interface

_Interface Class_ atau Kelas **Antarmuka** adalah kelas _setengah jadi_ yang memiliki *Method* 
tapi tidak memiliki _body_.

Biasanya _Interface Class_ digunakan untuk _Cetak Biru_ dalam pembuatan kelas turunan nya biasanya
berisi _method_ yang mempresentasikan sebuah perintah untuk mengakses nilai yang ada dalam sebuah
objek.

_Interface Class_ ini adalah salah satu karakteristik OOP [inheritance](https://github.com/bellshade/Java/tree/main/intermediate/JavaInheritance),
dimana dimungkinkan untuk mewarisi _method_ dan variabel yang _non-static_ ke kelas lainnya,
dimana memiliki kategori kelas sebagai berikut :

- subclass (child)
  kelas yang mewarisi dari kelas lain, dan melengkapi method yang diwariskan

- superclass (interface)
  kelas yang akan mewarisi method

untuk mewarisi dari kelas gunakan key `implements`

contoh

```java
interface tombolRemote{
  void volumeUp();
  void volumeDown();
}

class remoteTV implements tombolRemote{
  private Integer volume = 20;

  public remoteTV() {
  }

  public void volumeNow() {
    System.out.println("Volume TV : "+this.volume);
  }

  @Override
  public void volumeUp() {
    this.volume+=1;
  }

  @Override
  public void volumeDown() {
    this.volume-=1;
  }
}

public class interfaceJava {
  // deklarasi semua kelas dan pemanggilan
  public static void main(String[] args) {
    remoteTV remote = new remoteTV();

    remote.volumeNow(); // Volume TV : 20

    // volume berkurang
    remote.volumeDown();
    remote.volumeNow(); // Volume TV : 19

    // volume bertambah
    remote.volumeUp();
    remote.volumeUp();
    remote.volumeNow(); // Volume TV : 21
  }
}
```

## Kapan harus menggunakan kelas Interface ?

Kelas interface biasa berisi _method_ yang mempresentasikan perintah oleh **User** untuk berinteraksi dengan nilai yang
ada didalam kelas Objek.

contoh kasus :

kelas `tombolRemote` tidak perlu dibuat sebuah objek, karena hanya berisi sifat-sifat perintah yang harus dimiliki oleh 
remote pada umumnya.

Sehingga kelas `tombolRemote` dibuat menjadi _Interface Class_ dan method didalam nya diwariskan ke kelas turunannya 
seperti `remoteTV`.
