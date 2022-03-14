package com.bellshade.learn.basic.StrukturKontrol.Percabangan.IfElse;


// if statement (logika if) adalah statement
// yang difungsikan untuk mengesikusi block dari kode jika
// kondisi dalam if bersifat true atau false 

public class IfElse {
    public static void main(String[] args){
        int angka = 1;
        int angka_kedua = 50;
        
        // dalam kondisi jika angka pertama
        // lebih kecil dari angka kedua
        // maka akan mengesekusi perintah
        // yaitu "angka kedua lebih besar"
        if (angka < angka_kedua){
            System.out.println("Angka kedua lebih besar dari angka pertama");
        }
        // else digunakan jika pernyataan if tidak terpenhi
        // maka statement dalam else akan di jalankan
        else{
            System.out.println("Kedua angka memiliki kesamaan");
        }

        // contoh kedua
        // disini else akan tereksekusi dikarenakan
        // perintah if tidak terpenuhi
        // int angka_ketiga = 50;
        // int angka_keempat = 50;
        // if (angka_ketiga > angka_keempat){
        //     System.out.println("Angka kedua lebih bsar dari angka pertama");
        // }
        // else{
        //     System.out.println("Kedua Angka memiliki kesamaan")
        // }
    }
}
