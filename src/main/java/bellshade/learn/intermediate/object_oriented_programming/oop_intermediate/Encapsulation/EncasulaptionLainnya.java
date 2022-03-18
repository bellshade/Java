package bellshade.learn.intermediate.object_oriented_programming.oop_intermediate.Encapsulation;

public class EncasulaptionLainnya {
    public static void main(String[] args) {
        // Disini kita mengubah class ContohEncapsulation menjadi object yang dimana
        // nanti di panggil untuk mengeluarkan hasil dari yang kita buat pada class
        // ContohEncapsulation
        ContohEncapsulation object = new ContohEncapsulation();
        // Disini kita memanggil method GantiBentuk dengan membuat isi sesuai yang kita
        // buat
        object.GantiBentuk("Minibus");
        object.GantiMerk("Isuzu");
        // Disini kita nge print hasil yang sudah kita buat sebelum nya
        System.out.println("Bentuk Mobil adalah : " + object.getBentuk());
        System.out.println("Merk Mobil adalah : " + object.getMerk());
    }
}
