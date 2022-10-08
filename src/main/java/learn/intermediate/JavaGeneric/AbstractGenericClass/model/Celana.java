package learn.intermediate.JavaGeneric.AbstractGenericClass.model;

/**
 * Objek celana
 */
public class Celana {
    private int lingkarPinggang;
    private int LingkarPaha;
    private int panjangCelana;

    public Celana(int lingkarPinggang, int lingkarPaha, int panjangCelana) {
        this.lingkarPinggang = lingkarPinggang;
        LingkarPaha = lingkarPaha;
        this.panjangCelana = panjangCelana;
    }

    @Override
    public String toString() {
        return "Celana{" +
                "lingkarPinggang=" + lingkarPinggang + " cm" +
                ", LingkarPaha=" + LingkarPaha + " cm" +
                ", panjangCelana=" + panjangCelana + " cm" +
                '}';
    }
}
