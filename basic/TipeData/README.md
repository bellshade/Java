# tipe data

tipe data adalah value dengan jenis tertentu yang sangat berguna mempermudah dalam melakukan operasi dll sehigga tidak terjadi kesalahan kalkulasi, operasi, dan hasil


| tipe data     | ukuran | panjang value                             |
|:--            | -----  |:--                                        |
| [byte](Byte.java)          | 1 byte | -128 ke 127                               |
| [short](Short.java)         | 2 byte | -32,768 ke 32,767                         |
| [int](Int.java)           | 4 byte | -2,147,583,684 ke 2,147,483,647           |
| [long](Long.java)          | 8 byte | -9,223,372,036,854,775,808 ke 9,223,372,036,854,775,807127                                                       |
| [float](Float.java)         | 4 byte | menyimpan bilangan pecahan, cukup untuk menyimpan 6 sampai 7 digit desimal                                   |
| [double](Double.java)        | 8 byte | menyimpan bilangan pecahan, cukup untuk mentimpan 15 digit desimal                                           |
| [boolean](Boolean.java)       | 1 bit | value antara ture atau false                                                                |
| [char](Character.java)          | 2 byte | value dari ascii                          |


- byte

    byte adalah tipe data integer yang memiliki panjang value dari ``-128`` sampai ``127``. penggunaan byte bisa untuk nilai2 yang keil dikarenakan lebih hemat pada penggunanaan memori.

- short

    short adalah tipe data integer yang memiliki panjang value dari `` -32,768`` sampai ``32767`` penggunaan lingkup panjang value short lebih banyak dibandingkan byte, tetapi memakan sedikit lebih banyak daripada short.

- int

    int adalah tipe data integer yang memiliki value dari ``-2147483648`` sampai `` 2147483647``, kebanyakan dari para user menggunakan tipe data ini untuk pembelajaran, membuat program sederhana dan kompleks.
    ```java
    public class NamaFile{
        public static void main(String [] args){
            int AngkaSaya = 70;
            System.out.println(AngkaSaya);
        }
    }
    ```

- long

    long adalah tipe data integer yang meiliki vaue dari ``-9223372036854775808`` sampai `` 9223372036854775807``, tipe ini digunakan sebagai tambahan jika tipe data int tidak dapat menampilkan value. penggunaan long diakhir dengan value yang bertanda **L**
    ```java
    public class NamaFile{
        public static void main(String[] args){
            long AngkaSaya = 1672841124524L;
            System.out.println(AngkaSaya)
        }
    }
    ```

- float

    float adalah tipe data pecahan yang memliki value dari ``3.4e-038`` sampai ``3.4e+038``, penggunaan float diakhiri dengan value yang bertanda **f**:
    ```java
    public class NamaFile{
        public static void main(String[] args){
            float AngkaSaya = 5.21f;
            System.out.println(AngkaSaya);
        }
    }

- double

    double adalah tipe data pecahanyang memiliki value dari ``1.7e−308`` sampai ``1.7e+308``, penggunaan double diakhiri dengan value yang bertanda **d**:
    ```java
    public class NamaFile{
        public static void main(String[] args){
            double AngkaSaya = 24.92d;
            System.out.println(AngkaSaya);
        }
    }

