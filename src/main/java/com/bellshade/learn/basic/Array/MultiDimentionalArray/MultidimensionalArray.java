package com.bellshade.learn.basic.Array.MultiDimentionalArray;

/*
    Multidimensional adalah array yang berisi array. Array dapat terdiri dari 1 atau lebih dimensi. Contoh 2 atau 3 dimensi.
**/

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Deklarasi array 2 Dimensi
        int[][] numbers_2d = { { 1, 3, 5 }, { 2, 4, 6 }, { 3, 6, 9 } };
        String names_2d[][] = new String[10][10];

        // Deklarasi array 3d Dimensi
        int[][][] numbers_3d = { { { 1, 2, 3 }, { 1, 2 }, { 2, 3, 4 } }, { { 2, 3, 4 }, { 2, 45, 6 } } };
        String names_3d[][][] = new String[10][10][10];

        /*
         * Dalam melakukan print array multidimensional, looping dilakukan secara nested
         * /bersarang. Jumlah looping dilakukan sebanyak jumlah dimensi dalam array,
         * jika 2 dimensi maka diperlukan 2 kali looping.
         **/

        // print array 2 dimensi
        for (int i = 0; i < numbers_2d.length; i++) {
            for (int j = 0; j < numbers_2d[i].length; j++) {
                System.out.print(numbers_2d[i][j] + " ");
            }
        }

        System.out.println();

        // print array 3 dimensi
        for (int i = 0; i < numbers_3d.length; i++) {
            for (int j = 0; j < numbers_3d[i].length; j++) {
                for (int k = 0; k < numbers_3d[i][j].length; k++) {
                    System.out.print(numbers_3d[i][j][k] + " ");
                }
            }
        }
    }
}