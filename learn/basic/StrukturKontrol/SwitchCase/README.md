# Switch Case

Pernyataan `switch` digunakan untuk beberapa perbandingan kondisi yang berbeda. Pernyataan switch dimaksudkan untuk menangani banyak kemungkinan kemunculan. Pernyataan switch memiliki beberapa kondisi pada setiap pernyataannya, program akan dieksekusi atau dijalankan hingga ditemukan kondisi yang cocok dengan pernyataan switch yang diberikan. Pernyataan ini juga memungkinkan untuk melakukan sejumlah tindakan berbeda terhadap kemungkinan nilai. *Basic Syntax* dari **Switch Case** adalah sbg berikut

```
switch(var) {
    case nilai_var1:
        Statement1;
        break;

    case nilai_var2:
        Statement2;
        break;
    
    default:
        defaultStatement;
        break;
}
```
Ketika kondisi switch terpenuhi, maka akan dilakukan evaluasi apakah perintah yang masuk memenuhi `case` dengan `nilai_var1` atau `nilai_var2` . Setelah ditemukan pilihan `case` yang tepat, maka akan dijalankan sesuai statement yang diberikan pada `case` tersebut. Jika tidak menemukan `case` yang tepat, maka akan dijalankan `defaultStatement`. Pernyataan `break` adalah opsional. Jika kita meniadakan `break` , maka eksekusi akan terus dilakukan ke pernyataan case berikutnya. Pernyataan `break` diadakan sebagai batas akhir dari statement.

Jika ingin mengetahui source_code apa yang digunakan, silahakan untuk mengeceknya [disini](https://github.com/bellshade/Java/blob/main/learn/basic/StrukturKontrol/SwitchCase/SwitchJava.java)