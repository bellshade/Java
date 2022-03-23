# Java Lambda Expressions

_Lambda Expressions_ atau biasa dikenal _Lambda Functions_ adalah blok kode yang memiliki parameter dan mengembalikan suatu nilai. _Lambda Function_ sama seperti _method_ atau _function_ , namun tidak perlu mendefinisikannya secara eksplisit dan bisa langsung implementasi didalam _body_ sebuah _method_  

Implementasi simpel dari _Lambda Expression_ memiliki satu parameter dan _expression_


> *parameter* -> *expression*

Untuk menggunakan lebih dari satu parameter bisa meletakkan parameter tersebut kedalam tanda kurung

> *(parameter1, parameter2)* -> *expression*

Namun, jika ingin melakukan sebuah operasi kondisional bisa menggunakan tanda kurung kurawal untuk membungkus blok kode tersebut

> *(parameter1, parameter2)* -> { *blok kode* }

Contoh simpel penggunaan _Lambda Expressions_

```java
public class Lambda {
    interface PrintNumbers{
        void print(Integer number);
    }
    public static void main(String[] args) {
        PrintNumbers p = n -> {
            while(n <= 20) {
                System.out.println(n++);
            }
        };
        p.print(1);
    }
}
```