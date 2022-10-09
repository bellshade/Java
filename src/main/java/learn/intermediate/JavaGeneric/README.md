# Java Generic

Generic adalah kemampuan menambahkan parameter type saat membuat class atau method  
Berbeda dengan tipe data yang biasa kita gunakan di class atau function, generic memungkinkan kita bisa merubah bentuk tipe data sesuai dengan yang kita mau.

## Nama generic parameter type yang biasa digunakan adalah :
- E - Element (biasa digunakan di collection atau struktur data)
- K - Key
- N - Number
- T - Type
- V - Value
- S,U,V etc. - 2nd, 3rd, 4th types


## Contoh Kode Generic Class
```java
class Main {
    public class GenericClass<T> {
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public GenericClass(T data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        GenericClass<String> data1 = new GenericClass<>("Bellshade");
        GenericClass<Integer> data2 = new GenericClass<>(2022);

        System.out.println(data1.getData());
        System.out.println(data2.getData());
    }
}
```

## Contoh Kode Generic Method
```java
class Main {
    public class GenericMethod {
        public static <T> int arrayCount(T[] array) {
            return array.length;
        }
    }

    public static void main(String[] args) {
        String[] events = {"Hacktoberfest", "Harbolnas", "PRJ"};
        Integer[] numbers = {1, 2, 4, 8, 16};
        
        System.out.println(GenericMethod.arrayCount(events));
        System.out.println(GenericMethod.<Integer>arrayCount(numbers));
    } 
}
```

## Java Generic Multi Parameter

Pada **Java Generic**, parameter type dapat dideklarasikan lebih dari 1 type pada _class_ atau
_method_ generic.

Setiap parameter type yang dideklarasikan harus **berupa karakter yang berbeda**, tetapi dapat
mengandung objek yang sama.

### Contoh Kode Class Generic
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

### Contoh Kode Pemanggilan Class Generic
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