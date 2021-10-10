class Motor{
  // membuat kelas parent dengan membuat void berupa
  // menghidupkan motor
  void starter(){
    System.out.println("menghidupkan motor...");
  }
}

class JenisMotor extends Motor{
  // membuat kelas baru degan warisan dari kelas motor
  // dan kemudian membuat fungsi panggil berupa
  // "motor matic"
  void matic(){
    System.out.println("motor matic");
  }
}

class InheritanceJava{
  // deklarasi semua kelas dan pemanggilan
  // dari jenis motor karena jenisMotor sudah dapat warisan dari
  // kelas Motor
  public static void main(String[] args){
    // deklarasi kelas JenisMotor
    JenisMotor motorSaya = new JenisMotor();
    
    // memanggil kedua void
    motorSaya.starter();
    motorSaya.matic();
  }
}

