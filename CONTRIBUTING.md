# Panduan Berkontribusi

## Kontributor

Kami sangat senang anda telah ikut berkontribusi dalam implementasi algoritma, struktur data atau memperbaiki _error_.
Semua boleh ikut berkontribusi walaupun hal kecil dengan pengecualian sebagai berikut:

- Hasil pekerjaan kamu adalah buatan kamu sendiri dan tidak ada hak cipta dari orang lain.
- Jika kami menemukan kesamaan maka kami tidak `merged`.
- Hasil kerja kamu akan berlisensi [MIT](LICENSE) ketika permintaan _pull_ kamu sudah di _merged_.
- Hasil kerja kamu wajib mengikuti standar dan _style koding_ dari kami.
- Menggunakan _output_ `System.out.println();`.
- Menghindari penggunaan _library_ pada _koding_ (jika dibutuhkan silahkan diskusi di [_issue_](https://github.com/bellshade/JavaAlgorithm/issues)).

## Apa Itu Algoritma?

Algoritma adalah langkah-langkah untuk menyelesaikan suatu pekerjaan dimana terdiri dari 3 bagian utama, yaitu:

- _Input_/masukan, sebelum menjalankan sebuah algoritma maka hal yang pertama harus dilakukan adalah menerima masukan, _input_ dapat berasal dari pengguna ataupun dari langkah sebelumnya.
- Proses, bagian utama dari algoritma yang melakukan pengolahan _input_ yang akan menghasilkan _output_.
- _Output_/keluaran, _output_ adalah hasil dari bagian proses, _output_ ini juga bisa digunakan untuk langkah selanjutnya (jika masih ada).

Algoritma harus dikemas sedemikian rupa sehingga memudahkan pembaca untuk memasukkannya ke dalam program yang lebih besar.

Algoritma harus memiliki:

- Memiliki nama kelas dan fungsi intuitif yang memperjelas tujuannya bagi pembaca
- Menggunakan konvensi penamaan Java dan nama _variabel_ intuitif untuk memudahkan pemahaman
- Fleksibel untuk mengambil nilai _input_ yang berbeda
- Memiliki _docstrings_ dengan penjelasan yang jelas dan/atau _URL_ ke materi sumber
- Berisi _doctests_ yang menguji nilai _input_ yang valid dan salah
- Kembalikan semua hasil perhitungan alih-alih mencetak atau memplotnya

## Informasi Perubahan dan Penambahan
**persyaratan perubahan atau penambahan kode**
- pastikan _file_ ekstensi berupa ``*.java``
- gunakan **snake_case** atau **CamelCase** dalam menamakan Variabel p.s : Var. di Java bersifat **case sensitive**
- gunakan **CamelCase** dalam pebuatan _package_ **(jangan menggunakan dash "-")**

**contoh penggunaan variabel yang baik pada java**
kami menyarankan agar menggunakan struktur kode variable pada java seperti di bawah ini
```java
public class NamaFile {
    public static void main(String[] args) {
        int angka_saya = 12;
        double angka_saya_kedua = 13.2f;
        int angkaSayaKedua = 13;
        double doubleBebasSaya = 19.4f;
    }
}
```

- jika menggunakan kelas (class) kami menyarankan untuk kapitalisasi
```java
class NamaMurid {
    // kode disini
}
```

- compile file java

```bash
javac NamaFile.java
java NamaFile.java
```

## _Pull Request (PR)_

### _Pull Request (PR)_ Yang Baik

- Lakukan _fork_ pada _repository_ kami
- Setelah melakukan _fork_ kamu dibebaskan untuk mengubah atau menambah algoritma
- Untuk _Pull Request (PR)_ merubah diusahakan kamu menerapkan algoritma yang lebih baik dan lebih mudah
- Setelah merubah, menambah, atau perbaikan dokumentasi, usahakan kamu membuat _branch_ baru sebelum melakukan _Pull Request (PR)_

**tambahan perubahan**
jika ingin menambahkan algoritma atau _script_ Java, kamu bisa menambahkan perubahan di folder ``other`` atau ``namaPackage`` di dalam _package_ ```src\main\java```. Jika terdapat beberapa __*file*__, sebaiknya __*file-file*__ tersebut dimasukkan ke dalam satu folder yang sesuai dengan nama __*script*__ tersebut sebagai contoh

```
countBulletSpeed
├── CountBulletSpeed.java
└── FileTambahan.java
```

```bash
git checkout -b <branch_name_buatan_kamu>
git add .
git commit -m "add: menambahkan algoritma baru"
git push origin <branch_name_yang_kamu_buat>
```

- Lakukan push ke _branch_ kamu dan kemudian open _Pull Request (PR)_

### Saran Pesan _Commit_

- `feat:` untuk menambah algoritma atau tambahan lainnya
- `fix:` untuk mengubah algoritma yang sudah ada atau memperbaiki
- `docs:` untuk mengubah atau membuat dokumentasi
- `add:` untuk mengubah algoritma atau tambahan lainnya (opsional)

_Pull Request (PR)_ `merged` jika:

- Mengikuti standar dan arahan dari `CONTRIBUTING.md`
- Lulus test dan cek dari beberapa test yang sudah kami siapkan

## Tambahan

- Jika ada kendala atau masalah dalam _Pull Request (PR)_, kamu bisa laporkan masalah pada [_issue_](https://github.com/bellshade/JavaAlgorithm/issues)
- Jika ada test yang tidak lewat atau gagal, kami akan mengecek kembali perubahan.

Untuk _Pull Request (PR)_ kami sarankan untuk menjelaskan secara detail yang kamu ubah atau tambahkan, dan bersikap sopan, serta selalu berterima kasih, itu salah satu bentuk tata krama yang baik terhadap sesama contributor dan programmer lainnya.terima kasih sudah berkontribusi di **Bellshade Java**.
