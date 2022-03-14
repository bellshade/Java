package com.bellshade.learn.basic.String;

// string dalam java adalah kumpulan dari karakter
// yang menggunakan tanda petik dua ("")


public class StringJava {
    public static void main(String[] args){
        String nama = "Anna";
        String nama2 = "Jeon Somi";
        String kalimat = "indonesia memiliki 34 provinsi";

        // print dari string
        System.out.println(nama);
        System.out.println(nama2);

        // menghitung jumlah String
        System.out.println(nama.length());
        System.out.println(nama2.length());

        // mencari kata yang spesifik
        System.out.println(kalimat.indexOf("memiliki"));

        // mengubah menjadi kapital
        System.out.println(nama.toUpperCase());

        // mengubah menjadi kecil
        System.out.println(nama2.toLowerCase());
    }
}
