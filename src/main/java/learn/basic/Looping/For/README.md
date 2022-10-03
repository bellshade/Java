# For

Looping atau Perulangan `for` (beberapa orang menyebutnya _counted loop_) merupakan perulangan yang akan melakukan eksekusi perintah yang telah diketahui jumlah banyaknya. Sehingga perulangan `for` akan melakukan perulangan kode sejumlah tertentu. Perulangan ini terstruktur untuk mengulangi kode sampai tercapai batas yang telah ditentukan. 

Contoh *syntax* dari `for` adalah sebagai berikut:

```
for(nilai_awal; kondisi; modifier;) {
    Statement;
}
```

ket: Dari contoh diatas, jika hanya satu pernyataan yang hendak diulang, maka diperbolehkan tidak memakai pasangan kurung kurawal. Perulangan for mengulangi statement sejumlah tertentu menggunakan:

- `nilai_awal` untuk deklarasi variabel kendali perulangan atau menginisialisasi nilai awal dimana menjadi titik awal perulangan dimulai
- `kondisi` untuk membandingkan variabel kendali perulangan dengan nilai batas dengan memberikan kondisi tertentu
- `modifier` untuk menspesifikasikan cara variabel kendali dimodifikasi sebelum iterasi berikutnya atau bagian untuk memberikan penambahan nilai atau pengurangan
Jika semua sudah terpenuhi, maka program mengeluarkan output langsung dari *syntax* `Statement;`

Untuk lebih jelas program Looping `For` pada Java, kamu bisa langsung memperhatikan `source_code` nya [disini](https://github.com/bellshade/Java/blob/main/src/main/java/learn/basic/Looping/For/ForStatement.java)