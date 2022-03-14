package com.bellshade.learn.advanced.JavaGUI.Swing.JPanelWithJButton;

import javax.swing.*;

public class JButtonJPanel {
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            @Override 
            public void run() { 
                createAndShowGUI(); 
            }
        });
    }
    private static void createAndShowGUI() { 
        JFrame frame = new JFrame("Ini adalah JFrame"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 30, 300, 100); 
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);
        button.setBounds(20,20,200,20); 
        frame.setVisible(true);
    }
}
