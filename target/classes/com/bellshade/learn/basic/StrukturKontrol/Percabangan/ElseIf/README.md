# If - Else If - Else

Percabangan selanjutnya adalah If - Else If - Else. Percabangan ini digunakan untuk melakukan penyeleksian kondisi dimana kondisi yang diberikan lebih dari satu kondisi atau memiliki beberapa kondisi. Jika kondisi pertama bernilai salah maka akan dilakukan seleksi kondisi ke-dua dan seterusnya sampai menemukan hasil. Berikut adalah contoh nya

```
if(var_input == kondisi1) {
    Statement1;
} else if(var_input == kondisi2) {
    Statement2;
} else {
    Statement3;
}
```

ket: Jadinya, jika `var_input` atau variabel inputan kita cocok dengan `kondisi1`, maka program akan menjalankan `Statement1;`, sedangkan jika `var_input` atau variabel inputan kita cocok dengan `kondisi2`, maka program akan menjalankan `Statement2;`, dan seterusnya selama `else if` memiliki kondisi. Jika kondisi sudah habis tiada sisa alias _default_, maka secara otomatis akan dilanjutkan di blok statement `else`, dan sesuai di contoh atas, maka ditaruh di bagian `Statement3;`

Untuk lebih memahami algoritma pemrograman percabangan `if - else` bisa dilihat lebih lengkap [disini](https://github.com/bellshade/Java/blob/main/learn/basic/StrukturKontrol/Percabangan/ElseIf/ElseIf.java)
