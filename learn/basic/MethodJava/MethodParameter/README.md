# Method Parameter

## Apa itu _Method Parameter_?

maka kita lihat defisinisi dari parameter. _Parameter_ adalah sebuah nilai yang dapat diterima oleh sebuah _Method_ saat method tersebut didefinisikan atau dipanggil.
Jadi, _Method Parameter_ adalah sebuah method yang memiliki nilai yang harus diisi saat method tersebut didefinisikan atau dipanggil

Contoh method parameter

```java
static void NamaSiswa(String nama, int umur){
    System.out.println(nama + " berumur " + umur);
  }
```

cara memanggil _Method_ berparameter

```java
NamaSiswa("udin", 15);
```
Data yang dimasukan sebagai parameter harus sesuai dengan type datanya.

## Kegunaan _Method Parameter_

Dengan menggunakan _method parameter_, kita dapat mengirimkan sebuah data secara eksplisit sehingga memudahkan dalam pengolahan data dan masih banyak kegunaan lainnya.

### Contoh kode java:

#### Menggunakan _method parameter_

```java
public class MethodParameter{
  static void NamaSiswa(String nama, int umur){
    System.out.println(nama + " berumur " + umur);
  }

  static int Pertambahan(int Angka1, int Angka2){
    return Angka1 + Angka2;
  }

  public static void main(String[] args){
    NamaSiswa("joes", 21);

    System.out.println(
      "hasil pertambahan adalah " +
      Pertambahan(3, 5)
    );

    System.out.println(
      "hasil pertambahan lain " +
      Pertambahan(3, 20)
    );
  }
}
```
