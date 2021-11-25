package intermediate.Object_Oritented_Programming.oop_basic.Encapsulation;

public class ContohEncapsulation {
    // Deklarasikan variable class dengan bentuk private
    private String bentuk;
    private String merk;

    // Disini kita membuat untuk memanggil variable private menjadi public dari
    // method public yang kita buat ini
    public String getBentuk() {
        return this.bentuk;
    }

    // Method disini kita buat untuk mengganti dari method getBentuk menjadi
    // method baru yaitu method GantiBentuk
    public void GantiBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    // Disini kita membuat untuk memanggil variable private menjadi public dari
    // method public yang kita buat ini
    public String getMerk() {
        return this.merk;
    }

    // Method disini kita buat untuk mengganti dari method getMerk menjadi
    // method baru yaitu method GantiMerk
    public void GantiMerk(String merk) {
        this.merk = merk;
    }
}