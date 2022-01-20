# array tiga dimensi

Array tiga dimensi adalah bentuk kompleks dari array multidimensi. Array tiga dimensi dapat dilihat sebagai array dua dimensi untuk memudahkan pemahaman.

**cara deklarasi secara tidak langsung**

```
tipe_data[][][] variabel = new tipedata[x][y][z];
int [][][] arraySaya = new int[10][20][30];
```
penjelasan
```
[index_array][index_baris][index_kolom]
arraySaya[0][0][0] = 1;
```

**contoh**

```java
class ArrayDimensiTiga{
  public static void main(String[] args){
      int[][][] arraySaya = new int[10][20][30];
      arraySaya[0][0][0] = 1

      System.out.println("arraySaya[0][0][0] = " + arr[0][0][0]);
    }
}
```

**metode deklarasi secara langsung**

- ``B`` = baris
- ``K`` = kolom

```
tipe_data[][][] variabel = {
  {
    {valueArray1B1K1, valueArray1B1K2, ...},
    {valueArray1B2K1, valueArray1B2K2, ...},
  },
  {
    {valueArray2B1K1, valueArray2B1K2, ...}.
    {valueArray2B2K1, valueArray2B2K2, ...}
  }
};
```

contoh

```
class ArrayDimensiTiga{
  public static void main(String[] args){
    int[][][] arr = {
      {
        {1, 2},
        {3, 4}
      },
      {
        {5, 6},
        {7, 8}
      }
    };

    for (int i = 0; i < 2; i++)
      for (int j = 0; j < 2; j++)
        for (int z = 0; z < 2; z++)
          System.out.println("arr[" + i + "][" + j + "][" + z + "] =" + arr[i][j][z]);
  }
}
```

## mengakses elemen array tiga dimensi

elemen daalam array tiga dimensi biasanya disebut dengan ``x[i][j][k]`` dimana `i` adalah nomor larik, `j` adalah nomor baris dan `k` adalah nomor kolom.

sintaks
```
x[indeks_array][indeks_baris][indeks_kolom]
```

sebagai contoh

```
int[][][] arr = new int[10][20][30];
arr[0][0][0] = 1
```

