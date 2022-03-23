# Switch Case Lambda

Switch case lambda sama seperti switch case biasa namun penulisan switch case lambda lebih singkat. 

Switch case lamba setidaknya bisa mendukung **Java versi 14 ke atas**.

Sintaks dasar dari switch case lambda adalah sebagai berikut.

```
switch (var) {
    case nilai1 -> statement1;

    case nilai2, nilai3 -> statement2;

    case nilai4 -> {
        statement3;
        statement4;
    }
    
    default -> statement5;
}
```

Switch case lambda tidak memerlukan _keyword_ **_break_**.

Switch case lamba hanya dengan menggunakan tanda **->** untuk mencetak sebuah _statement_.

Jika _statement_ lebih dari 1, maka harus menambahkan tanda **kurung kurawal** setelah tanda **->** seperti contoh kode di atas.

Source code dapat Anda lihat di `SwitchLambda.java`.