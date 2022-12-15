import java.awt.*;
import javax.swing.*;

class fourButtons {
    public static void main(String args[]) {
        JFrame f = new JFrame("Buttons");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new GridLayout(5, 1, 10, 10));
        final JLabel j1 = new JLabel("Empty");
        f.add(j1);
        final JButton jb1 = new JButton("Hello");
        f.add(jb1);
        final JButton jb2 = new JButton("Hi");
        f.add(jb2);
        final JButton jb3 = new JButton("Click");
        f.add(jb3);
        final JButton jb4 = new JButton("Damm");
        f.add(jb4);

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb1.getText());
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb2.getText());
            }
        });
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb3.getText());
            }
        });
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb4.getText());
            }
        });
    }
}