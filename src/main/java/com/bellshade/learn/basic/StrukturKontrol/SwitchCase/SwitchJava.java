package com.bellshade.learn.basic.StrukturKontrol.SwitchCase;

// statement switch merupakan salah satu dari statement
//  logika yang dapat digunakan untuk menentukan kondisi
//  yang akan dijalankan

// syarat khusus pada java meliputi
//  - tidak menerima sistem duplikasi case
//  - harus mengandung value yang konstan dan tidak menggunakan variabel
//  - jika semua case tidak terpenuhi maka lanjut ke default case sebagai
//    default case yang akan dijalankan

public class SwitchJava {
    public static void main(String[] args){
        int angka = 20;

        switch(angka){
            // jika angka 15 case 15 akan diesekusi
            // break sebagai penutup dari fungsi case
            // jika tidak akan lanjut sampai ke default case
            // atau case yang memiliki break statement
            case 15:
                System.out.println("angka 15");
                break;
            case 20:
                System.out.println("angka 20");
                break;
            
            // statement ini akan dijalankan jika kedua case
            // tidak terpenuhi
            default:
                System.out.println("angka tidak terdaftar");

        }
    }    
}
