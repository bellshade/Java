# java polimorpis
Polimorfisme berarti "banyak bentuk", dan itu terjadi ketika kita memiliki banyak kelas yang terkait satu sama lain melalui pewarisan.

contoh kode
```java
class Hewan{
    public void Suara(){
        System.out.println("beberapa hewan memiliki suara yang unik")
      }
  }

class Babi extends Hewan{
    public void Suara(){
        System.out.println("suara dari babi: wee wee");
      }
  }

class Kucing extends Hewan{
    public void Suara(){
        System.out.println("suara kucing: miaw miaw");
      }
  }
```
