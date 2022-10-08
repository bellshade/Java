package learn.intermediate.JavaGeneric.AbstractGenericClass.model;

/**
 * Objek baju
 */
public class Baju {

    private int panjangLengan;
    private int panjang;
    private int lebarDada;

    public Baju(int panjangLengan, int panjang, int lebarDada) {
        this.panjangLengan = panjangLengan;
        this.panjang = panjang;
        this.lebarDada = lebarDada;
    }

    public int getPanjangLengan() {
        return panjangLengan;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebarDada() {
        return lebarDada;
    }

    @Override
    public String toString() {
        return "Baju{" +
                "panjangLengan=" + panjangLengan + " cm" +
                ", panjang=" + panjang + " cm" +
                ", lebarDada=" + lebarDada + " cm" +
                '}';
    }
}
