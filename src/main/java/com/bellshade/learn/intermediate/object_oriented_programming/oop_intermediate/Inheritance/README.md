# java inheritance

di java, dimungkinkan untuk mewarisi atribut dan metode dari satu kelas ke kelas lainnya, bisa disebut dengan "konsep pewarisan" dalam dua kategori

- subclass (child)
  kelas yang mewarisi dari kelas lain

- superclass (parent)
  kelas yang akan mewarisi

untuk mewarisi dari kelas gunakan key ``extends``

contoh
```java
class Motor{
    void starter(){
        System.out.println("menghidupkan motor");
      }
  }
class Matic extends Motor{
    void JenisMotor(){
        System.out.println("motor matic");
      }
  }

class testInheritance{
    public static void main(String[] args){
        Matic motorSaya = new Matic();
        
        motorSaya.starter();
        motorSaya.JenisMotor();
      }
  }
```
