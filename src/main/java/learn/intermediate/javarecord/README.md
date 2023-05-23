# Java record

record merupakan fitur baru yang diperkenalkan pada Java 14. Fitur ini menyediakan cara yang ringkas untuk mendefinisikan kelas-kelas yang digunakan untuk menyimpan data yang tidak dapat diubah (immutable). Record menggabungkan fitur-fitur kelas dan data transfer object (DTO) dengan secara otomatis menghasilkan metode-metode standar seperti konstruktor, getter, equals, hashCode, dan toString.

## Penggunaan record

seperti yg sudah dijelaskan record ini cocok digunakan untuk data transfer object (DTO) karna data record ini bersifat immutable.
contoh record bisa di lihat disini
```java
package learn.intermediate.javarecord;

public record User(String name, String email, int age) {
}
```
kita juga dapat menambahkan method di dalam record
```java
package learn.intermediate.javarecord;

public record User(String name, String email, int age) {
    
    public void test() {
        System.out.println("hello");
    }
}
```

lalu untuk contoh record yg digunakan sebagai DTO bisa dilihat pada [RestClientServiceImpl.java](/learn/intermediate/javahttpclient/services/RestClientServiceImpl.java) di package javahttpclient