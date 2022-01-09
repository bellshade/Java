import javax.swing.*; // mengimport Package Swing yang merupakan Toolkit standart Java GUI

public class Programnya { // mendeklarasikan class utama, pastikan nama class sesuai dengan source_code
    public static void main(String[] args) { // mendeklarasikan method void. Method void ini digunakan untuk menghasilkan pengeluaran (output) dalam program Java
        SwingUtilities.invokeLater(new Runnable() { // utilities dari Java Swing yang biasanya mendeklarasikan GUI pokok pada Java
            @Override // Method Override
            public void run() { // methood void yang biasanya dideklarasikan untuk menjalankan dari sebuah variabel
                createAndShowGUI(); // mendeklarasikan variabel yang dimana akan digunakan untuk menampilkan GUI pada Java
            }
        });
    }
    private static void createAndShowGUI() { // mendeklarasikan method void private yang dimana akan digunakan untuk membuat GUI Java
        JFrame frame = new JFrame("Ini adalah JFrame"); // JFrame adalah Subclass dari JFrame yang memiliki fungsi sama dengan JFrame. JFrame ini juga bisa menuliskan sebuah output pada "tab" sebuah Frame GUI Java
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dari variabel frame pada JFrame yang Menyetel operasi yang akan terjadi secara default ketika pengguna memulai "tutup" pada bingkai ini. Pada fungsi ini akan mengeluarkan GUI pada Java berupa sebuah Frame
        frame.setBounds(20, 30, 300, 100); // Method ini digunakan untuk mengatur ukuran tampilan komponen GUI Java. Di method ini, biasanya mengatur tampilan (x, y, width, height) 
        frame.setLayout(null); // Method ini digunakan untuk mengatur Layout pada JFrame.

        JButton button = new JButton("Click Me"); // JButton adalah utilities dari Java GUI yang digunakan untuk membuat sebuah tombol yang berisi tulisan saja
        frame.getContentPane().add(button); // dari var. JFrame dengan method getContentPane() dan add() dari Javax Swing yang digunakan untuk menambahkan Utilities Java SWing lainnya ke JFrame dengan var. frame
        button.setBounds(20,20,200,20); // Method ini digunakan untuk mengatur ukuran tampilan komponen GUI Java. Di method ini, biasanya mengatur tampilan (x, y, width, height) 
        frame.setVisible(true); // Utilities dari JFrame yang digunakan untuk mengeset semua GUI dan siap ditampilkan dalam bentuk output
    }
}

/**
Saran dari kami, untuk menjalankan program ini dilakukan secara manual melalui Terminal/Bash/CMD
Untuk mengetahui cara mengcompile program Java, terdapat di README.md Repo Java ya :)
 */