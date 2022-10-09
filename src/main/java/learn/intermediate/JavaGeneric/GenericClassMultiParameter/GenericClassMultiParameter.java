package learn.intermediate.JavaGeneric.GenericClassMultiParameter;

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
