# Linear Search
_Linear Search_ adalah algoritma pencarian yang sangat sederhana. Dalam jenis pencarian ini, pencarian berurutan dilakukan pada semua item satu per satu. Setiap item diperiksa dan jika kecocokan ditemukan maka item tertentu dikembalikan, jika tidak, pencarian berlanjut hingga akhir pengumpulan data.
## Cara Kerja
- Lakukan perulangan pada _array_
- Cocokkan elemen kunci dengan elemen pada _array_
- Jika elemen kunci ditemukan, kembalikan posisi indeks elemen _array_
- Jika elemen kunci tidak ditemukan, kembalikan nilai -1

# Binary Search
_Binary Search_ digunakan untuk mencari elemen kunci dari beberapa elemen. Dalam kasus pencarian biner, elemen _array_ harus dalam urutan menaik. Jika Anda memiliki _array_ yang tidak disortir, Anda dapat mengurutkan _array_ menggunakan metode ```Arrays.sort(arr)```.
## Cara Kerja
- Bandingkan x dengan elemen tengah.
- Jika x cocok dengan elemen tengah, akan mengembalikan indeks tengah.
- Jika x lebih besar dari elemen tengah, maka x hanya dapat terletak di setengah _subarray_ kanan setelah elemen tengah. Jadi dilakukan perulangan untuk bagian kanan.
- Jika (x lebih kecil) dilakukan perulangan untuk bagian kiri.
# Daftar Algoritma Searching
1. [Linear Search](./LinearSearch.java)
2. [Binary Search](./BinarySearch.java)
