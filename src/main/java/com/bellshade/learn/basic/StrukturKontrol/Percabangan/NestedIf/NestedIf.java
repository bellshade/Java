package com.bellshade.learn.basic.StrukturKontrol.Percabangan.NestedIf;

public class NestedIf {
    public static void main(String[] args) {
        int a = 100;

        if(a == 100) {
            if(a > 50) {
                System.out.println("Angka saya lebih dari 50");
            }
            if(a > 70) {
                System.out.println("Angka saya lebih dari 70");
            }
            if(a > 100) {
                System.out.println("Angka saya lebih dari 100");
            }
        }
    }
}