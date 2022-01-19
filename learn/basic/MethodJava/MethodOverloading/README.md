# java overloading

di bahasa java, terdapat suatu istilah yang disebut dengan _"Overloading"_. Secara garis besar, _Overloading_ adalah istilah yang digunakan saat kita membuat beberapa method di dalam sebuah class dengan nama yang sama, namun dibedakan dari parameter yang dikirim.

## Contoh program _overloading_
```java
public class MethodOverloading {

    static void kenalan(String namaSaya){
        System.out.println("Hai nama ku "+ namaSaya+", Salam kenal");
    }

    static void kenalan(String namaSaya, String namaTeman){
        System.out.println("Hai salam kenal "+namaTeman+", nama ku "+ namaSaya);
    }

    public static void main(String[] args){
        kenalan("Sandhika");
        kenalan("Sandhika","Doddi");
    }
}
```