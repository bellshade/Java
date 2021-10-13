## Enkapsulasi

Enkapsulasi sendiri merupakan sebuah proses dimana method dan juga atribut dibungkus di dalam program. Program itu sendiri bersifat menyembunyikan informasi yang terdapat pada program, sehingga program lebih aman dan tidak mudah diambil oleh orang lain. Dan untuk membuat program bersifat pribadi misalnya kita membutuhkan modifier yaitu private.
Berikut contoh program yang menggunakan prinsip dari Enkapsulasi :

`` Mobil `` 
```java
public class mobil{
    private String bentuk;
    private String merk;

    public String getBentuk() {
        return this.bentuk;
    }

    public void GantiBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getMerk() {
        return this.merk;
    }

    public void GantiMerk(String merk) {
        this.merk = merk;
    }
}
```
Ini merupakan Fila program dari **Main.java** nya
`` Main ``

```java
public class Main {
    public static void main(String[] args) {
        ContohEncapsulation object = new ContohEncapsulation();
        object.GantiBentuk("Minibus");
        object.GantiMerk("Isuzu");
        System.out.println("Bentuk Mobil adalah : " + object.getBentuk());
        System.out.println("Merk Mobil adalah : " + object.getMerk());
    }
}
```