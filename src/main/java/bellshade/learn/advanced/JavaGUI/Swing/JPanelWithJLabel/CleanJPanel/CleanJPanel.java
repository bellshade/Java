package bellshade.learn.advanced.JavaGUI.Swing.JPanelWithJLabel.CleanJPanel;

import javax.swing.*; // mengimport Package Swing yang merupakan Toolkit standart Java GUI

public class CleanJPanel  { // mendeklarasikan class utama, pastikan nama class sesuai dengan source_code
    public static void main(String[] args) { // mendeklarasikan method void. Method void ini digunakan untuk menghasilkan pengeluaran (output) dalam program Java
        SwingUtilities.invokeLater(new Runnable() { // utilities dari Java Swing yang biasanya mendeklarasikan GUI pokok pada Java
            @Override // Method Override
            public void run() { // methood void yang biasanya dideklarasikan untuk menjalankan dari sebuah variabel  
                createAndShowGUI(); // mendeklarasikan variabel yang dimana akan digunakan untuk menampilkan GUI pada Java
            }
        });
    }
    private static void createAndShowGUI() { // mendeklarasikan method void private yang dimana akan digunakan untuk membuat GUI Java
        JFrame frame = new JFrame("Ini adalah title dari JFrame"); // JFrame adalah Subclass dari JFrame yang memiliki fungsi sama dengan JFrame. JFrame ini juga bisa menuliskan sebuah output pada "tab" sebuah Panel GUI Java
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dari variabel frame pada JFrame yang Menyetel operasi yang akan terjadi secara default ketika pengguna memulai "tutup" pada bingkai ini. Pada fungsi ini akan mengeluarkan GUI pada Java berupa sebuah Frame

        JLabel label = new JLabel("Hello World"); // mendeklarasikan label pada frame GUI Java. Label ini juga bisa menuliskan sebuah output dengan tipe data "String".
        frame.getContentPane().add(label); // menambahkan varibale JLabel tadi ke JFrame lewat subclass yakni JFrame
        frame.pack(); // hasil dari packages swing yang biasanya digunakan untuk mengatur GUI agar sesuai dengan engan ukuran dan tata letak subkomponen yang diinginkan
        frame.setVisible(true); // hasil dari packages swing yang digunakan untuk meng-set tampilan GUI. Pada tipe data dalam setVisible() adalah boolean.
    }
}

/**
Saran dari kami, untuk menjalankan program ini dilakukan secara manual melalui Terminal/Bash/CMD
Untuk mengetahui cara mengcompile program Java, terdapat di README.md Repo Java ya :)
 */