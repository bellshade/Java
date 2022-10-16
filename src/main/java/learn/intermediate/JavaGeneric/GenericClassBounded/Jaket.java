package learn.intermediate.JavaGeneric.GenericClassBounded;

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
