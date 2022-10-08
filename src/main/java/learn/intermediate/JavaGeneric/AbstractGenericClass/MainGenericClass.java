package learn.intermediate.JavaGeneric.AbstractGenericClass;

/**
 * Contoh class yang meng-extends class abstrak `Pakaian`
 * `T` pada Pakaian<T> akan mengikuti `T` pada AbstractGenericClass<T>
 *
 * @param <T> tipe data objek
 */
public class MainGenericClass<T> extends Pakaian<T> {

    public MainGenericClass(String codePakaian, String warnaPakaian, T sizeChart) {
        super(codePakaian,warnaPakaian,sizeChart);
    }
}
