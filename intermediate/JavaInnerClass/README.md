# java inner class
java inner class atau kelas dalam satu file pada java dapat dilakukan. ini dapat dilakukan bertujuan untuk memudahkan dan mengurangi penggunaan banyak file agar tidak terlalu ribet.

**contoh**
```java
class DiluarKelas{
    int Angka = 20;
  class DiDalamKelas{
      int AngkaLain = 20;
    }
}

public class NamaFile{
    public static void main(String[] args){
        DiluarKelas LuarKelas = new DiluarKelas();
        DiluarKelas.DiDalamKelas DalamKelas = LuarKelas.new DiDalamKelas();
        
        System.out.println(DalamKelas.AngkaLain + DiluarKelas.AngkaLain);
      }
  }

```

kelas ``DiluarKelas`` mendeklarasikan value integer (20) yang bisa diakses dan kemudian di dalam kelas kita juga bisa membuat kelas baru untuk melakukan sebuah operasi dan lain-lain, disini kita membuat variabel terbaru dengan value interger berupa (20).

kemudian kita bisa mengaksesnya dengan cara memanggil kelas terluarnya terlebih dahulu kemudian kita bisa mengakses di dalam kelasnya (``kelas DiluarKelas``)
