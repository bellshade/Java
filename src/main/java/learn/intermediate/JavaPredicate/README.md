# Java Predicate
Pada _package_ ini, akan membahas salah satu fungsi matematika yang sering digunakan pada Java. Dalam logika matematika, _Predicate_ adalah fungsi yang dapat menerima nilai dan mengembalikan nilai _boolean_.  
Pada Java, _Predicate_ merupakan sebuah _functional interface_ dengan spesialisasi menerima masukan _generic_ dan mengembalikan nilai _boolean_.  

## Contoh Penggunaan _Predicate_
```java
class Main {
    Predicate<Integer> evenNumber = value -> (value % 2 == 0) && (value > 1);
    Predicate<String> startsWithA = value -> value.startsWith("A");
}
```
Untuk contoh lengkap ada pada kode sumber [JavaPredicate.java](JavaPredicate.java)