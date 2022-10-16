package learn.intermediate.JavaGeneric.GenericClassBounded;

/**
 * Generic Class Bounded
 *
 * Membatasi paramater type class generic,
 * sehingga hanya dapat dimasukan oleh class yang memiliki parent yang sama
 */
public class MainGenericClassBounded {
    public static void main(String[] args) {

        Jaket jaket = new Jaket();
        DataEntity<Jaket, String> pakaianSatu = new DataEntity<Jaket, String>(jaket);
    }
}
