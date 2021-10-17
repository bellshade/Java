# Method

## Apa itu _Method_?

_Method_ di Java adalah blok kode yang dieksekusi dengan cara memanggil nama dari blok kode tersebut di program Anda. _Method_

format penulisan

```java
static void namaMethod(){
    // masukan kode
    System.out.println("ini method!");
}
```

cara memanggil _Method_

```java
namaMethod();
```

## Kegunaan _Method_

Dengan menggunakan _method_, kode yang dibuat dapat lebih pendek karena tidak perlu menulis ulang `1 blok kode logic` jika digunakan di baris lain.

### Contoh kode java:

#### **Tidak** menggunakan _method_

```java
public class MethodJava{
  public static void main(String[] args){
    System.out.println("hello teman!");
    System.out.println("nama saya Jono");
    System.out.println("Saya dari Jakarta");
    System.out.println("Hobi saya adalah ngoding");
    System.out.println("Saya biasa menggunakan bahasa Java");
    System.out.println("Salam kenal ya . .");

    System.out.println("hello teman!");
    System.out.println("nama saya Jono");
    System.out.println("Saya dari Jakarta");
    System.out.println("Hobi saya adalah ngoding");
    System.out.println("Saya biasa menggunakan bahasa Java");
    System.out.println("Salam kenal ya . .");
  }
```

#### Menggunakan _method_

```java
public class MethodJava{
  static void salamKenal(){
    System.out.println("hello teman!");
    System.out.println("nama saya Jono");
    System.out.println("Saya dari Jakarta");
    System.out.println("Hobi saya adalah ngoding");
    System.out.println("Saya biasa menggunakan bahasa Java");
    System.out.println("Salam kenal ya . .");
  }

  public static void main(String[] args){
      salamKenal()
      salamKenal()
  }
```
