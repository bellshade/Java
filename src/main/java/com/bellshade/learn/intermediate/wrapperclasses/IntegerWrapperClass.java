package com.bellshade.learn.intermediate.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class IntegerWrapperClass {
    public static void main(String[] args){
        System.out.println("\n");
        // Inisialisasi Wrapper Class Integer
        Integer integer = 10;
        System.out.println("========+++++++++========");
        System.out.println("Inisialisasi Integer (Integer) : "+integer);
        
        // Autoboxing int(primitif) ke Integer Wrapper Class
        int intPrimitif = 100;
        Integer integerAutoboxing = intPrimitif;
        System.out.println("Autoboxing Integer (Integer) : "+integerAutoboxing);
        
        // Unboxing Integer Wrapper Class ke int(primitif)
        Integer integerUnboxing = 99;
        int intPrimitifUnboxing = integerUnboxing;
        System.out.println("Unboxing Integer (int) : "+intPrimitifUnboxing);

        // Penerapan di Collection List
        // List/ArrayList tidak dapat menerima variable dalam bentuk tipe data primitf (char, int, long, dst)
        
        // Inisialisasi List of Integer
        List<Integer> integerList = new ArrayList<Integer>();
        // jika inisialisasi  List<int> integerList = new ArrayList<int>();  maka akan keluar Error
        // Untuk Lebih lanjut dengan List/ArrayList ada di Materi mengenai List/ArrayList

        Integer integerA = 10;
        Integer integerB = 11;

        integerList.add(integerA);
        integerList.add(integerB);
        // menampilkan ArrayList of Integer
        System.out.println("List of Integer : "+integerList);
        System.out.println("========+++++++++========");
        System.out.println("\n");

//------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------METHOD----------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------
        
        // Method-method yang sering digunakan untuk manipulasi data nilai int di Object Integer
        System.out.println("-------------------1. toString()----------------------");
        // 1. toString()
        // inisialisasi Integer
        
        Integer integerC = 10;
        System.out.println("Integer : "+integerC);
        Integer integerD = 100;
        System.out.println("Integer : "+integerD);

        // Mengubah Integer ke Object String
        System.out.println("stringIntegerC : "+integerC);
        String stringIntegerC = integerC.toString();
        System.out.println("stringIntegerD : "+integerD);
        String stringIntegerD = integerD.toString();

        // Hasil print
        System.out.println("IntegerC + integerD : "+ (integerC+integerD));
        System.out.println("stringIntegerC + stringIntegerD : "+ (stringIntegerC+stringIntegerD) );
        System.out.println("-------------------------------------------------------");
        System.out.println("\n");
       

        System.out.println("-----------------2. parseInt(String)-------------------");
        // 2. parseInt(String) 
        String integerString = "0001001";
        System.out.println("integerString : "+integerString);
        // Mengubah String menjadi Integer
        Integer integerParseInt = Integer.parseInt(integerString);
        System.out.println("integerParseInt : "+integerParseInt);
        System.out.println("-------------------------------------------------------");
        System.out.println("\n");
        
        
        System.out.println("-----------------3. equals(Integer)--------------------");
        // 3. equals(Integer)
        Integer integerF = 10;
        System.out.println("integerF : "+integerF);
        Integer integerG = 10;
        System.out.println("integerG : "+integerG);
        Integer integerH = 100;
        System.out.println("integerH : "+integerH);

        // pengecekan Integer
        System.out.println("integerF.equals(integerG) : "+integerF.equals(integerG)); 
        System.out.println("integerF.equals(integerH) : "+integerF.equals(integerH)); 
        System.out.println("-------------------------------------------------------");
        System.out.println("\n");

    }
}
