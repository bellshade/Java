import javax.swing.*; // mengimport Package Swing yang merupakan Toolkit standart Java GUI

public class MembuatGUISendiri  { // mendeklarasikan class, pastikan nama class sesuai dengan source_code
    public static void main(String[] args) { // mendeklarasikan method void 
        SwingUtilities.invokeLater(new Runnable() { // utilities dari Java Swing yang biasanya digunakan untuk menjakanj=
            public void run() { // methood void yang biasanya dideklarasikan untuk menjalankan dari sebuah variabel  
                createAndShowGUI(); // mendeklarasikan variabel yang dimana akan digunakan untuk 
            }
        });
    }
    private static void createAndShowGUI() { // mendeklarasikan method void private yang dimana akan digunakan untuk membuat GUI Java
        JFrame frame = new JFrame("Ini adalah title dari JPanel"); //JFrame adalah Subclass dari JPanel yang memiliki fungsi sama dengan JPanel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // dari variabel fram pada JFrame yang mendeklarasikan 
        JLabel label = new JLabel("Hello World"); // menambahkan label pada panel GUI Java. Label ini juga bisa menuliskan sebuah output dengan tipe data "String".
        frame.getContentPane().add(label); 
        frame.pack();
        frame.setVisible(true);
    }
}