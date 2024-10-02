package algorithm.math;

/**
 * @brief contoh implementasi dari dua diskret sinyal
 */
public final class Konvolusi {
  private Konvolusi() {}

  /**
   * @brief fungsi konvolusi yang memberikan dua input sinyal
   * @param angkaPertama nilai diskret sinyal pertama
   * @param angkaKedua nilai diskret sinyal kedua
   * @return sinyal konvolusi
   */
  public static double[] konvolusi(double[] angkaPertama, double[] angkaKedua) {
    double[] konvolu = new double[angkaPertama.length + angkaKedua.length - 1];

    for (int i = 0; i < konvolu.length; i++) {
      konvolu[i] = 0;
      int k = Math.max(i - angkaKedua.length + 1, 0);

      while (k < i + 1 && k < angkaPertama.length) {
        konvolu[i] += angkaPertama[k] * angkaKedua[i - k];
        k++;
      }
    }

    return konvolu;
  }
}
