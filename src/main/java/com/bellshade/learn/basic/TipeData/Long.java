package com.bellshade.learn.basic.TipeData;

// tipe data primitif pada java
// byte     5
// short    5
// int      5
// long     5
// float    5.0
// double   5.0
// boolean  true / false
// char     'A'

public class Long{
    public static void main(String[] args){
        // pada tipe data long akan mengeluarkan value
        // yang sangat besar
        // -9223372036854775808 ke 9223372036854775807
        // ini digunakan jika value integer tidak mencukupi
        // pastikan kamu menggunakan L pada akhir value long

        long angka = 150000000L;
        System.out.println(angka);
    }
}