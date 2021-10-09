## Inner Class 
Inner Class merupakan class yang tidakk berada pada top level atau class yang dideklarasikan di dalam class lain (Outer Class)
Sama seperti halnya instance method dan variabel, inner class harus menggunakan instance object dari top level class untuk mengakses instance dari top level class, maka membernya tidak dapat di deklarasikan dengan static.
Object instance dari inner class hidup dalam instance dari outer classnya. Untuk sintaks dasarnya perhatikan contoh berikut ini
```java
class OuterClass{
    ...
    class InnerClass{
        ...
    }
}
```

Instance innerclass memerlukan instance dari outerclass untuk mengkases secara langsung method atau fieldnya. Untuk instance inner class, kita harus instance outer class terlebih dahulu, seperti berikut ini :
```java
OuterClass outerObject = new OuterClass();
```
Kemudian kita instance inner classnya, seperti berikut ini:
```java
OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```
Untuk lebih memahami konsep diatas, perhatikan contoh dibawah ini :
```java
public class DemoInnerClass{
    private class Inner{
        public void printText(){
            System.out.println("Inner Class example in Java")
        }
        public static void main(String[] args){
            DemoInnerClass Outer = new DemoInnerClass();
            DemoInnerClass.Inner OuterInner = Outer.new Inner();
            OuterInner.printText();
        }
    }
}
```
Kode Program diatas artinya : Mendeklarasikan sebuah innerclass didalam sebuah class lain (DemoInnerClass) kemudian instance inner untuk mengakses method printText. Bila kode Program diatas kita eksekusi keluaran yang dihasilkan seperti berikut ini

```java
Inner Class example in Java
```

Inner Class di java mempunyai dua macam bentuk, yaitu :
1. Local Classes
2. Anonymouse
