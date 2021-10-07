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

## Apa itu atribut ?
Sebenarnya atribut dapat dikatakan sebuah variabel dari sebuah kelas atau bisa juga disebut dengan fields

contohnya seperti ini

pada kelas Rumah terdapat atribut kamar_mandi dan kamar_tidur
```java
class Rumah() {
    int kamar_tidur;
    int kamar_mandi;
}
```