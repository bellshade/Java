# BELAJAR JAVA OOP

## Apa itu class?

Class adalah suatu kerangka kerja yang berisi property & method. Property adalah variable yang ada didalam class.
Method adalah function yang ada didalam class.

## Membuat class

Untuk membuat class kalian bisa menggunakan keyword class lalu diikuti nama class nya.
Penamaan kelas biasanya menggunakan UpperCamelCase. Berikut contoh sederhana membuat class di Java.

```java
class Orang {}
```

## Apa itu object?

Object adalah instance dari suatu class. Untuk membuat object cukup 
menggunakan keyword new lalu diikut nama class nya dan tanda kurung().
Kita bisa membuat banyak object dengan satu class.

contoh nya seperti ini :
```java
Orang orang1 = new Orang();
Orang orang2 = new Orang();
```

## Apa itu atribut?
Sebenarnya atribut dapat dikatakan sebuah variabel dari sebuah kelas atau bisa juga disebut dengan fields
Atribut dapat diakses dengan membuat obyek dari sebuah kelas, lalu menggunakan syntax titik ( . )
contohnya seperti ini

pada kelas Rumah terdapat atribut kamar_mandi dan kamar_tidur
```java
class Rumah() {
    int kamar_tidur;
    int kamar_mandi;
}

class Main() {
    public static void main(String[] args) {
        Rumah rumahSaya = new Rumah();
        System.out.println(rumahSaya.kamar_tidur);
    }
}
```

## Apa itu method?
Method adalah sebuah fungsi yang terdapat di dalam kelas pada Java. Sama seperti attribute 
untuk mengakses method bisa menggunakan nama object lalu diikuti tanda titik dan nama 
methodnya dan di akhiri dengan tanda kurung ().

Berikut cara pembuatan method di java.
```java
class Orang {
    // berikut cara pembuatan method pada class di Java
    void hello() {
        System.out.println("Hello Bellshade!");
    }
    void belajar() {
        System.out.println("Aku sedang belajar Java OOP!");
    }

    // cara pembuatan method dengan return type String
    String bellshade() {
        return "https://github.com/bellshade/Java";
    }
}
```
Dan ini contoh cara mengakses method di java
```java
public class KelasDanMethod {
    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.hello();
        orang.belajar();
        String bellshade = orang.bellshade();
        System.out.println(orang.bellshade());
    }
}

```