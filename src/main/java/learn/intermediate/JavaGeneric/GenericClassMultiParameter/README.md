# Java Generic Multi Parameter

Pada **Java Generic**, parameter type dapat dideklarasikan lebih dari 1 type pada _class_ atau
_method_ generic.

Setiap parameter type yang dideklarasikan harus **berupa karakter yang berbeda**, tetapi dapat
mengandung objek yang sama.

## Contoh Kode Class Generic
```java
/**
 * Contoh pembuatan Generic class dengan 2 parameter type
 * Dapat juga bisa lebih dari 2 dengan menambah karakter dan dipisah dengan koma
 * contoh: <T,K,K2,k3>
 *
 * @param <T> Tipe data objek
 * @param <K> Key variabel sebuah objek
 */
public class GenericClassMultiParameter <T,K>{

    private T dataObjek;
    private K dataKey;

    public GenericClassMultiParameter(T dataObjek, K dataKey) {
        this.dataObjek = dataObjek;
        this.dataKey = dataKey;
    }

    public T getDataObjek() {
        return dataObjek;
    }

    public K getDataKey() {
        return dataKey;
    }
}
```

## Contoh Kode Pemanggilan Class Generic
```java
public class JavaGeneric {
    public static void main(String[] args) {
        // Membuat objek `GenericClassMultiParameter` dimana T diinisiasi objek Baju dan K diinisiasi Integer
        GenericClassMultiParameter<Baju,Integer> data3  =
                new GenericClassMultiParameter<>(new Baju(26,72,59),6);
        System.out.println("Data3 Objek bertipe data: " + data3.getDataObjek().getClass().getSimpleName());
        System.out.println("Data3 key bertipe data: " + data3.getDataKey().getClass().getSimpleName());
    }
}
```