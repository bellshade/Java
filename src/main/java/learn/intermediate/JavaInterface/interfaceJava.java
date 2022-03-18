package learn.intermediate.JavaInterface;

/**
 * kelas remoteTV mempunyai method Perintah yang diwariskan oleh kelas tombolRemote
 */

interface TombolRemote{
    // Membuat kelas interface
    void volumeUp();
    void volumeDown();
}

class RemoteTV implements TombolRemote{
    // Contoh kelas yang mengimplementasi kelas Interface

    // Inisialisasi nilai awal setiap membuat objek
    private int volume = 20;

    public RemoteTV() {
    }

    public void volumeNow() {
        System.out.println("Volume TV : "+this.volume);
    }

    @Override
    public void volumeUp() {
        // Perintah : Setiap di panggil volume bertambah 1
        this.volume += 1;
    }

    @Override
    public void volumeDown() {
        // Perintah : Setiap di panggil volume berkurang 1
        this.volume -= 1;
    }
}

public class interfaceJava {
    // deklarasi semua kelas dan pemanggilan
    public static void main(String[] args) {
        RemoteTV remote = new RemoteTV();

        remote.volumeNow(); // Volume TV : 20

        // volume berkurang
        remote.volumeDown();
        remote.volumeNow(); // Volume TV : 19

        // volume bertambah
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeNow(); // Volume TV : 21
    }
}
