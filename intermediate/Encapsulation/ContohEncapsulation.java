package intermediate.Encapsulation;

public class ContohEncapsulation {
    private String bentuk;
    private String merk;

    public String getBentuk() {
        return this.bentuk;
    }

    public void GantiBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getMerk() {
        return this.merk;
    }

    public void GantiMerk(String merk) {
        this.merk = merk;
    }
}