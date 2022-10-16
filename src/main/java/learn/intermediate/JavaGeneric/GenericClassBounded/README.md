# Java Generic Bounded

Saat ingin membatasi penggunaan _class generic_ dengan hanya bisa digunakan oleh 
class yang terpilih. Dapat menggunakan cara _parameter type_ dari _class generic_ dijadikan 
_child class_ dari sebuah _paretn class_.

## Contoh Kode

### Contoh class generic
```java
/**
 * Contoh class generic yang paramter type nya memiliki parent class
 * hal ini membuat hanya class dari turunan class AbstractEntity yang bisa menggunakan 
 * class DataEntity
 *
 * @param <T> paramter type entity
 * @param <ID> paramter type id
 */
public class DataEntity<T extends AbstractEntity<ID>, ID>{

    private T data;

    public DataEntity(T jaket) {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * Contoh memanggil method dari parent di child jika generic
     * karena variabel `data` telah di assign T, maka `data` bisa memanggil method dari parent
     * seperti konsep abstraksi pada umumnya
     *
     * @return getNote()
     */
    public String getNoteChild(){
        return this.data.getNote();
    }
}
```
### Contoh class yang memiliki parent yang sama

```java
/**
 * harus memiliki parent AbstractEntity
 * karena parameter type generic class yang digunakan juga memiliki parent AbstractEntity
 */
public class Jaket extends AbstractEntity<String>{

    private int panjangLengan;
    private int panjang;

    public int getPanjangLengan() {
        return panjangLengan;
    }

    public void setPanjangLengan(int panjangLengan) {
        this.panjangLengan = panjangLengan;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
}
```
