package com.bellshade.algorithm.datastructure.Array.ArrayDimensiTiga;

public class ArrayDimensiTiga{
  public static void main(String[] args){
    // membuat tipe data dari array 3 dimensi
    // [indeksArray][barisArray][kolomArray]
    int[][][] arraySaya = {
      {
        {1, 2},
        {3, 4}
      },
      {
        {5, 6},
        {7, 8}
      }
    };
    System.out.println("arraySaya[0][0][0] = " + arraySaya[0][0][0]);
  }
}

