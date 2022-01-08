# java overriding

di bahasa java, terdapat suatu istilah yang disebut dengan "Overriding". Secara garis besar, Overloading adalah istilah yang digunakan saat kita meng-override atau bahasa mudahnya itu "meniban" method yang sudah ada di parent class di child class. Overriding biasanya digunakan dalam konsep "Polymorphism"

contoh
```java
class BangunDatar{
    void hitung(){
        System.out.println("Tidak bisa menghitung");
    }
}

class Persegi extends BangunDatar{
    int sisi = 10;
    
    @override
    void hitung(){
        int luas = this.sisi * this.sisi;
        System.out.println("Luas Persegi : "+luas);
    }
}

class testOverriding{
    public static void main(String[] args){
        Persegi persegi_1 = new Persegi();
        persegi_1.hitung();
        persegi_1.super.hitung();
    }
}
```
