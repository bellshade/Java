# java overloading

di bahasa java, terdapat suatu istilah yang disebut dengan "Overloading". Secara garis besar, Overloading adalah istilah yang digunakan saat kita membuat beberapa method di dalam sebuah class dengan nama yang sama, namun dibedakan dari parameter yang dikirim.

contoh
```java
class SegitigaSamaSisi{
    void hitung(int alas, int tinggi){
        double luas = alas * 0.5 * tinggi;
        System.out,println("Luas Segitiga : "+luas);
    }
    void hitung(int sisi){
        double keliling = sisi * 3;
        System.out,println("Keliling Segitiga : "+keliling);
    }
    void hitung(){
        System.out.println("Parameter Kosong");
    }
}

class testOverloading{
    public static void main(String[] args){
        SegitigaSamaSisi s = new SegitigaSamaSisi();

        s.hitung();
        s.hitung(15);
        s.hitung(10, 5);
    }
}
```
