## array 2 dimensi java

Array dua dimensi adalah bentuk paling sederhana dari array multidimensi. Array dua dimensi dapat dilihat sebagai array satu dimensi untuk memudahkan  pemahaman.

```
tipe_data[][] variabel = new tipe_data[x][y];
```

## mengakses elemen dari array dua dimensi

element dalam array dua dimensi biasanya disebut denga x[i][j] dimana i adalah nomor dari baris dan j adalah nomor dari kolom.

```
x[baris][kolom]
```
sebagai contoh
```java
int[][] arraySaya = new int[11][15];
arr[0][0] = 1;
```

contoh diatas mewakili elemen yang ada di baris pertama dan kolom pertama

contoh

```java
class ArrayDuaD{
  public static void main(String[] args){
      int[][] arraySaya = new int[10][20];
      arr[0][0] = 1;
      
      System.out.println("array[0][0] = " + arraySaya[0][0])
    }
}
```

## metode deklarasi langsung

```
tipe_data[][] variabel = {
  {valueBaris1kolom1, valueBaris1Kolom2},
  {valueBaris2Kolom1, valieBaris2Kolom2}
};
```

contoh

```java
class ArrayDuaD{
  pulic static void main(String[] args){
      int[][] arraySaya = {{1, 2}, {3, 4}};
      
      // menggunakan perulangan
      for (int i = 0; i < 2; i++)
          for (int j = 0; j < 2; j++)
              System.out.println("arr[" + i + "][" + j + arr[i][j]);
    }
}
```

## cetak array 2d dalam format tabel

untuk menampilkan semua elemen array dua dimensi, gunakan loop bersarang. untuk ini dua _for looping_ diperlukan, satu untuk baris dan satu lagi untuk kolom.

contoh

```
class ArrayDuaD{
  public static void main(string[] args){
      int[][] arraySaya = {{1, 2}, {3, 4}};
      
      // looping untuk baris
      for (int i = 0; i < 2; i++){
        // looping untuk kolom
        for (int j = 0;, j < 2; j++){
          System.out.print(arraySaya[i][j] + " ");
        }
        
        System.out.println();
      }
    }
}
```
