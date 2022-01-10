# Bubble Sort
Bubble sort adalah algoritma pengurutan. Cara kerjanya adalah melakukan komparasi elemen yang bersebelahan. Jika elemen kiri lebih besar dari yang di kanan maka akan dilakukan proses pertukaran posisi.

Struktur Data yang digunakan: Array
<br>
Kompleksitas Waktu/Time Complexity: O(n^2)

### Cara Kerja
- Melakukan perulangan selama maksimal n*n, misal n = 5 maka 5*5 = 25 kali
- jika elemen 1 lebih besar dari elemen sebelahnya. maka lakukan pertukaran posisi


# Selection Sort
Selection Sort adalah metode pengurutan yang mengimplementasikan nested loop. Terdapat pointer khusus yang menyimpan indeks dengan nilai terkecil di setiap loop, setiap 1 kali loop akan terjadi pertukaran nilai antara nilai pointer tersebut dengan indeks loop-nya.

Struktur Data yang digunakan: Array
<br>
Kompleksitas Waktu/Time Complexity menjadi O(n^2)

### Cara Kerja
- Melakukan perulangan selama n*n (nested loop), misal n = 5 maka 5*5 = 25 kali
- Terdapat loop luar yang digunakan untuk melakukan pertukaran nilai dengan nilai indeks minimal
- Lalu ada loop dalam yang digunakan untuk mencari indeks minimal yang memiliki nilai terkecil
- Kondisi pada perulangan luar, jika nilai indeks ke i lebih besar dari nilai pada indeks minimal, maka lakukan pertukaran nilai
- Juga ada kondisi pada perulangan dalam, jika nilai indeks ke j lebih kecil daripada indeks minimal maka lakukan penggantian indeks dengan nilai yang lebih kecil tersebut


## Daftar Algoritma Sorting
1. [Bubble Sort](./BubbleSort.java)
2. [Selection Sort](./SelectionSort.java)
3. [Insertion Sort](./insertionsort.java)