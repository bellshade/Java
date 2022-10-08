# Java Abstract Generic

Penerapan _Java Generic_ bisa dilakukan pada _class abstract_, 
sehingga di salah satu atribut pada _class abstract_ dapat bersifat dinamis 
mengikuti tipe data yang diinisiasikan di _child class_ nya.

Biasanya _study case_ ini digunakan untuk membuat _ResponseBody_ dalam 
JSON REST API yang lebih terstruktur.

## Contoh Kode

Contoh parameter diinisialisasi langsung

```java
public class AbstractGenericClass extends Pakaian<String>{
    ...
}
```

```java
public class AbstractGenericClass<T> extends Pakaian<String>{
    ...
}
```

Contoh parameter mengikuti dari _child class_ nya

```java
// `T` pada Pakaian<T> akan mengikuti `T` pada AbstractGenericClass<T>
public class AbstractGenericClass<T> extends Pakaian<T>{
    ...
}
```