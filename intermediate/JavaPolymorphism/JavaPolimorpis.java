class Hewan{
  // membuat kelas dari suara hewan
  public void SuaraHewan(){
    // menampilkan suara output dari suara hewan
    System.out.println("hewan memiliki suara yang unik");
  }
}

// membuat kelas dari suara kucing dengan turunan dari
// kelas hewan
// class Kucing extends Hewan{
//  public void SuaraHewan(){
//    System.out.println("kucing: miaw miaw");
//  }
//}

// membuat kelas dari suara sapi dengan turunan dari
// kelas hewan
class Sapi extends Hewan{
  public void SuaraHewan(){
    System.out.println("sapi: moooo");
  }
}

// membuat kelas utama untuk menampilkan
// semua kelas lainnya
public class JavaPolimorpis{
  public static void main(String[] args){
    // mendklarasi variabel terbaru
    // dari kelas hewan, berupa kucing , dan sapi
    Hewan SuaraHewanVar = new Hewan();
    // Hewan SuaraKucing = new Kucing();
    Hewan SuaraSapi = new Sapi();

    // menampilkan isi dari kelas
    SuaraHewanVar.SuaraHewan();
    // SuaraKucing.SuaraHewan();
    SuaraSapi.SuaraHewan();
  }
}

