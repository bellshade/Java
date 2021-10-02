# method scope pada java

dalam java variabel hanya bisa diakses dan di dalam region tertentu dan hanya bisa dipanggil ketika variabel tersebut sudah dibuat, itu adalah yang dimaksud dengan **java scope**

seperti contoh dibawah ini
**contoh pertama**
```java
public class NamaFile{
    public static void main(String[] args){
        System.out.println(AngkaSaya);
        int AngkaSaya = 20;
      }
  }
```
kode tersebut diatas akan menyebabkan error dikarenakan variabel ``AngkaSaya`` belum dibuat, karena lingkup dari output dari AngkaSaya hanya dimulai dari pembuatannya sampai akhir dari kurung kurawal  ``public static void main()``

**contoh kedua dari scope**
```java
public class NamaFile{
    public static void main(String[] args){
        // disini fungsi dari AngkaSaya tidak akan berkerja
        
        {
          // diatas AngkaSaya juga tidak akan berfungsi kita memanggil
          // dari variabel AngkaSaya
          int AngkaSaya = 20;

          // dibawah ini kita bisa menggunakan variabel dari AngkaSaya
          System.out.println
        }

        // di luar ini maka fungsi dari AngkaSaya tidak akan berkerja
      }
  }
```
