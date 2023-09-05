package learn.advanced.JavaGUI.Swing.JPanelWithJTextField;

import javax.swing.*;
import java.awt.*;

public class JTextFieldJPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Membuat sebuah JFrame (jendela aplikasi)
        JFrame frame = new JFrame("Ini adalah JFrame");
        // Mengatur operasi default ketika tombol X di jendela diklik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Mengatur posisi dan ukuran jendela
        frame.setBounds(20, 30, 300, 100);
        // Menggunakan layout null untuk mengatur posisi elemen secara bebas
        frame.setLayout(null);

        // Membuat JTextField (form input teks)
        JTextField textField = new JTextField();
        // Mengatur jenis font, style, dan ukuran teks di dalam JTextField
        textField.setFont(new Font("Arial", Font.BOLD, 18));
        // Memungkinkan pengeditan teks di dalam JTextField
        textField.setEditable(true);
        // Mengatur teks yang dimasukkan ke dalam JTextField akan muncul di sebelah kanan
        textField.setHorizontalAlignment(JTextField.RIGHT);
        // Mengatur posisi dan ukuran JTextField
        textField.setBounds(20, 20, 200, 20);
        // Menambahkan JTextField ke dalam konten pane jendela
        frame.getContentPane().add(textField);
        // Menampilkan jendela
        frame.setVisible(true);
    }
}