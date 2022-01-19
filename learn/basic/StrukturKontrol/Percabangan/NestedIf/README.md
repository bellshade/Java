# Nested If

Percabangan selanjutnya yakni Nested If *atau* dalam Bahasa Indonesia nya yakni If Bercabang. Jika dijelaskan secara benar-benar mendasar, If yaitu suatu if berada dalam pernyataan if. Nested If adalah kondisi bersarang yaitu suatu kondisi di dalam kondisi tertentu, Jika terdapat 2 cabang kondisi maka di dalam salah satu cabang kondisi tersebut dapat pula di isi suatu kondisi tertentu. Terkadang, Nested If tidak hanya diisi oleh percabangan `if` saja, melainkan `if - else` secara bercabang, tetapi menurut logika pemrograman yang berlaku di seluruh Bahasa Pemrograman, dalam percabangan selalu dimulai dengan `**IF**`, sehingga Percabangan yang "Bercabang" ini dinamakan dengan `**NESTED IF**`. 

Berikut adalah contoh penulisan programnya

```
if(var_input == memasuki_kondisi) {
    if(var_input == kondisi1) {
        Statement1;
    } else if(var_input == kondisi2) {
        Statement2;
    } else {
        Statement3;
    }
} else {
    StatementKondisiSalah;
}
```

ket: Pada "Percabangan yang Bercabang" ini, memiliki `If - Else` yang didalam nya terdapat `If - Else If - Else`. Jadi, pada `var_input` disamakan dengan `if - else` pertama, jika `var_input` sesuai dengan kondisi yang diminta yakni `memasuki_kondisi`, maka akan berlanjut ke percabangan selanjutnya, sedangkan jika `var_input` tidak sesuai dengan kondisi yang diminta yakni `memasuki_kondisi`, maka program akan langsung berhenti dan mengeluarkan output dari statement yakni `StatementKondisiSalah;`. 
Selanjutnya jika `var_input` memnuhi `memasuki_kondisi`, akan berlanjut ke percabangan selanjutnya. Jika `var_input` seuai dengan `kondisi1`, maka program akan mengeluarkan output `Statement1;`, lalu apabila `var_input` sesuai dengan `kondisi2`, maka program akan mengeluarkan output `Statement2;`, dan seterusnya sampai tidak ditemukan kesesuaian antara `var_input` dan kondisi yang diminta. Jika sudah tidak ditemukan kondisi lainnya, maka `var_input` akan dimasukkan ke blok `else`, sesuai contoh, program akan mengeluarkan output `Statement3;`

Nested If memang dikenal sebagai percabangan yang rumit, oleh karena itu sebelum memahami "Percabangan yang Bercabang" ini, disarankan terlebih dahulu memahami [if](https://github.com/bellshade/Java/tree/main/learn/basic/StrukturKontrol/Percabangan/If), [if - else](https://github.com/bellshade/Java/tree/main/learn/basic/StrukturKontrol/Percabangan/If-Else), dan [if - else - if](https://github.com/bellshade/Java/tree/main/learn/basic/StrukturKontrol/Percabangan/ElseIf)

Selain contoh, di Repo ini terdapat sebuah contoh *source_code*, kamu langsung bisa mengeceknya [disini](https://github.com/bellshade/Java/blob/main/learn/basic/StrukturKontrol/Percabangan/NestedIf/NestedIf.java)