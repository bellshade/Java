# Wrapper Classes di Java

- ## Deskripsi singkat
Wrapper class di java menyediakan mekanisme untuk mengubah tipe data primitif menjadi suatu Object dan dapat mengubah suatu Object menjadi tipe data primitif. Proses pengubahan ini disebut sebagai fitur Autoboxing dan Unboxing di java.

- ## Penggunaan Wrapper Classes di Java
Java adalah bahasa pemrograman yang beorintasi object, sehingga kita akan selalu berurusan dalam manipulasi object seperti penggunaan Collections, Serialization, Synchronization, dan lain sebagainya. Keunggulan dalam menggunan Wrapper Classes :

1. Wrapper Classes mengubah tipe data primitif menjadi object. Object ini diperlukan jika kita ingin mengubah argumen yang akan diteruskan ke suatu method/fungsi.
2. Banyak kelas kelas yang ada di java.util hanya dapat menerima tipe data Object sehingga dengan Wrapper Classes ini dapat membantu dalam kasus-kasus tertentu.
3. Wrapper Classes diperlukan untuk membungkus tipe data primitif jika ingin menggunakan Collection Framework karena Collection Framework hanya dapat memproses data Object. Contoh Collection Framework seperti ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc. Collection Framework ini akan sangan diperlukan jika sudah berurusan dengan pemrosesan basis data seperti di SpringBoot ataupun di Spring MVC.
4. Wrapper Classes bisa menerima data dalam beluk Null, sedangkan tipe data primitif tidak bisa menerima data dalam Null.
5. Wrapper Classes sudah terdapat banyak method yang dapat digunakan untuk manipulasi tipe data primitif.

| Tipe data Primitive     | Wrapper Class                             |
|:--            |:--                                        |
| [byte](Byte.java)          | Byte                               |
| [short](Short.java)         | Short                        |
| int           | [Integer](IntegerWrapperClass.java#L7)           |
| [long](Long.java)          | Long                                                       |
| [float](Float.java)         | Float                                   |
| [double](Double.java)        | Double                                           |
| [boolean](Boolean.java)       | Boolean                                                                |
| [char](Character.java)          | Character                          |

---

## 1. Integer
Java Class Integer berada dibawah paket Java.lang.Number. Kelas ini membungkus nilai tipe primitif int dalam suatu Object. Object kelas Integer berisi satu bidang nilai tipe int.
Java Integer Class menyediakan banyak sekali fungsi/method yang dapat memanipulasi nilai int. Beberapa method yang banyak/biasa digunakan untuk memanipulasi int yaitu :
- [toString()](IntegerWrapperClass.java#L44)

Method ini digunakan untuk memanipulasi data value di Integer diubah menjadi tipe data String. Method ini akan mengembalikan object String yang mewakili nilai dari Object Integer.

- [parseInt(String)](IntegerWrapperClass.java#L63)

Method ini digunakan untuk memparsing argumen String sebagai object Integer.

- [equals(Integer)](IntegerWrapperClass.java#L78)

Method ini membandingkan nilai parameter Integer dengan nilai nya sendiri. Method ini akan mengembalikan dalam bentuk boolean.

