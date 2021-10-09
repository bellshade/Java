class DiluarKelas{
  int Angka = 20;
  class DalamKelas{
    int AngkaLain = 20;
  }
}

public class InnerClassJava{
  public static void main(String[] args){
    // memanggil kelas pertama dahulu yaitu diluar kelas
    DiluarKelas KelasLuar = new DiluarKelas();
    // memanggil kelas dalam dengan var dari KelasLuar
    DiluarKelas.DalamKelas KelasDalam = KelasLuar.new DalamKelas();

    // operasi antara kelas luar dan dalam dengan cara fungsi matematika
    System.out.println(KelasLuar.Angka + KelasDalam.AngkaLain);
  }
}

