# java overriding

di bahasa java, terdapat suatu istilah yang disebut dengan "Overriding". Secara garis besar, Overloading adalah istilah yang digunakan saat kita meng-override atau bahasa mudahnya itu "meniban" method yang sudah ada di parent class di child class. Overriding biasanya digunakan dalam konsep "Polymorphism" yang bisa dipelajari pada materi Object Oriented Programming

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
## @override 
Simbol ini biasanya ditulis diatas _method_ yang _meng-override_ method dari _class parent_. Hal ini berguna untuk memudahkan developer dalam membaca, maupun debugging code. 


## Lalu Bagaimana cara kita "Memanggil" method yang berada di parent class ?
Caranya cukup dengan memakai keyword _super_ untuk memberitahu Java bahwa method yang kita tunjuk adalah method yang berada di _Super Class_ atau _Parent Class_.

Contoh : _tambahkan method dibawah ke class persegi_
```java
void memanggilMethodDiParent(){
    //keyword super ini berfungsi untuk memanggil method yang berada di parent
    super.hitung(); //output : "Tidak bisa menghitung"
}
```
