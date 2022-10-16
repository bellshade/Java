package learn.intermediate.JavaGeneric.GenericClassBounded;

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
