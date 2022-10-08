package learn.intermediate.JavaGeneric.AbstractGenericClass;

/**
 * Contoh class abstrak generic
 *
 * @param <T> tipe data atribut dapat berubah-ubah sesuai inisiasi di kelas anaknya
 */
abstract class Pakaian<T> {

    private String CodePakaian;
    private String warnaPakaian;

    /**
     * Tipe data `sizeChart` akan mengikuti tipe data `T` sesuai inisiasi di kelas anaknya
     */
    private T sizeChart;

    public Pakaian(String codePakaian, String warnaPakaian, T sizeChart) {
        CodePakaian = codePakaian;
        this.warnaPakaian = warnaPakaian;
        this.sizeChart = sizeChart;
    }

    @Override
    public String toString() {
        return "Pakaian{" +
                "CodePakaian='" + CodePakaian + '\'' +
                ", warnaPakaian='" + warnaPakaian + '\'' +
                ", sizeChart=" + sizeChart.toString() +
                '}';
    }
}
