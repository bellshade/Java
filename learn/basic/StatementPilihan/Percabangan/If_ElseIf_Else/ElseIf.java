public class ElseIf {
    public static void main(String[] args) {
        int masukan = 220;

        if(masukan % 2 == 0) {
            System.out.println("Angka yang dimasukkan adalah angka jenis Genap");
        } else if(masukan % 2 == 1) {
            System.out.println("Angka yang dimasukkan adalah angka jenis Ganjil");
        } else {
            System.out.println("Bukan jenis angka yang dimasukkan");
        }
    }
}