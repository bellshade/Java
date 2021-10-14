## Konstruktor

Konstruktor merupakan sebuah proses dimana *method* memberikan nilai awal ke atribut disuatu
`class` saat suatu objek dibuat



#### Smartphone.java
```java
public class Smartphone {

    String namaBrand;
    int kapasitasMemory;
    String prosesor;

    public Smartphone(){
        this.namaBrand = "Samsung";
        this.kapasitasMemory = 6;
    }
}
```
variabel `namaBrand` dan `kapasitasMemory` akan langsung berisikan nilai karena telah
diberikan nilai didalam *method contractor* `Smartphone()`


#### Main

```java
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        System.out.println("Nama brand : "+smartphone1.namaBrand); // Samsung
        System.out.println("kapasitas RAM : "+smartphone1.kapasitasMemory+" GB"); // 6
        System.out.println("Merek prosesor : "+smartphone1.prosesor); // NULL
    }
}
```