import javax.swing.*;
import java.awt.*;

public class ContohPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("gambar di bawah adalah gambar warna COKLAT !!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 30, 300, 100);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(150, 75, 0));
        panel.setOpaque(true);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}