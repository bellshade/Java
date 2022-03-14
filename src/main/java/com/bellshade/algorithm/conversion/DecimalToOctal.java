package com.bellshade.algorithm.conversion;
// cara compile
// javac DecimalToOctal.java
// java DecimalToOctal


import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka, k, d, s = 0, c = 0;
        System.out.print("masukkan angka desimal: ");
        angka = input.nextInt();
        k = angka;
        
        while(k != 0){
            d = k % 8;
            s += d * (int)

            // 100 hasil bagi 8 = 12  remainder 4
            // 12 hasil bagi 8 = 1  remainder 4
            // 1 hasil bagi 8 = 0   remainder 1

            Math.pow(10, c++);
            k /= 8;
        }
        
        System.out.println("angka octal: " + s);
        input.close();
    }
}