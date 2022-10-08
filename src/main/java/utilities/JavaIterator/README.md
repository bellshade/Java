# Java Iterator

Didalam **JAVA** terdapat sebuah class yang bernama **Iterator**. Class ini berguna untuk melakukan iterasi pada data collections seperti ArrayList dan HashSet.

Untuk menggunakannya, silahkan import package ```java.util.Iterator``` terlebih dahulu. Kemudian, panggil method ```iterator()``` pada collection yang ingin dilakukan iterasi.

Terdapat 4 method dalam class **Iterator**, yaitu :

- ```forEachRemaining(Consumer<? super E> action)```
    Melakukan _action_ yang telah diinput sebagai argumen hingga semua elemen data melewati proses iterasi.
- ```hasNext()```.
    Melakukan pengecekan apakah masih ada elemen data yang dapat diproses.
- ```next()```
    Mengembalikan nilai berupa elemen data yang berada setelah elemen data yang sedang diproses.
- ```remove()```
    Menghapus suatu elemen data pada collection yang sedang diiterasi.

### Contoh penggunaan
[![](https://img.shields.io/static/v1?&label=Lihat%20source%20code&message=%3e&color)](JavaIterator.java)

Dibawah ini akan didemonstrasikan cara membaca dan menampilkan data dari sebuah ArrayList dengan memanfaatkan method ```next()``` dan ```hasNext()```.

```java
ArrayList<String> langs = new ArrayList<String>();
Iterator<String> itr = langs.iterator();

cars.add("Java");
cars.add("Python");
cars.add("PHP");
cars.add("Rust");

while(itr.hasNext()) {
  System.out.println(itr.next());
}
```

Alur kerja program diatas adalah :

1. Proses iterasi dimulai pada elemen data "Java".

2. Setelah proses iterasi data "Java" selesai, method ```hasnext()``` melakukan cek apakah masih ada elemen data yang tersedia untuk diiterasi. Dalam kasus ini, terdapat elemen data "Python" maka method ```hasNext()``` mengembalikan nilai **```true```** .

3. Didalam blok program ```while``` loop, elemen data "Python" diakses dengan menggunakan method ```next()``` lalu mencetaknya dengan ```System.out.println()``` .

4. Langkah-langkah diatas akan terus dilakukan hingga akhirnya tidak ada lagi elemen data yang dapat diproses.

Maka, outputnya adalah

```
Java
Python
PHP
Rust
```

Selanjutnya, kita akan coba menggunakan method ```remove()``` untuk menghapus elemen data angka genap dalam sebuah ArrayList.

```java
ArrayList<Integer> nums = new ArrayList<Integer>();

nums.add(12);
nums.add(77);
nums.add(34);
nums.add(29);

Iterator<Integer> itr = nums.iterator();

while(itr.hasNext()) {
    Integer n = itr.next();
    if(n % 2 == 0) {
        itr.remove();
    }
}

System.out.println(nums);
```

Alur kerja program diatas sama saja dengan penjelasan pada contoh  sebelumnya. Namun, kita memanggil method ```remove()``` selama method ```hasNext()``` mengembalikan nilai **```true```** .

Maka, outputnya adalah

```
[77, 29]
```

Selanjutnya, kita akan coba menggunakan method ```forEachRemaining()``` untuk menampilkan seluruh elemen data pada sebuah ArrayList. Namun, kita tidak akan menggunakan perulangan ```while``` seperti pada contoh sebelumnya.

```java
ArrayList<String> animals = new ArrayList<>();
        
animals.add("Cat");
animals.add("Squid");
animals.add("Tiger");
animals.add("Wolf");

Iterator<String> itr3 = animals.iterator();

itr3.forEachRemaining((animal) -> System.out.println(animal));
```

Elemen data yang sedang diproses akan diinput sebagai argumen ```animal```, kemudian _action_ yang akan dilakukan adalah mencetak elemen data tersebut dengan ```System.out.println(animal)``` .

Maka, outputnya adalah

```
Cat
Squid
Tiger
Wolf
```

### Apakah ada method lain yang bisa digunakan ?

Tidak. Hanya keempat method diatas yang dapat digunakan dari class **Iterator**.