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


## contoh kode
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