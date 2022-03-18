package learn.intermediate.JavaKonstrutktor;





public class Constructor {
    public static void main(String[] args) {

        // deklarasi kelas `smartphone`
        // Disini smartphone1 akan langsung memiliki nilai dibeberapa atribut
        Smartphone smartphone1 = new Smartphone();

        // variabel `smartphone1` dnegan atribut `namaBrand` dan `kapasitasMemory`
        // langsung memiliki nilai karena telah di assign di kontraktor
        System.out.println("Nama brand : "+smartphone1.namaBrand);
        // output -> "Name brand : Samsung"

        System.out.println("kapasitas RAM : "+smartphone1.kapasitasMemory+" GB");
        // output -> "kapasitas RAM : 6 GB"

        // atribut `prosesor` null karena belum di inialisasikan di kotraktor
        System.out.println("Merek prosesor : "+smartphone1.prosesor);
        // output -> "Merek prosesor : null"
    }
}
