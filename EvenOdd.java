import javax.swing.*;
import java.awt.*;

public class EvenOdd {
    public static void main(String args[]) {
        JFrame f = new JFrame("Display Even Odd");
        f.setVisible(true);
        f.setSize(500, 400);
        f.setLayout(new GridLayout(3, 2, 10, 10));
        JLabel j1 = new JLabel("Enter List :");
        f.add(j1);
        final JTextField jt1 = new JTextField(10);
        f.add(jt1);
        JLabel j2 = new JLabel("Result :");
        f.add(j2);
        final JTextField jt2 = new JTextField(20);
        jt2.setEditable(false);

        f.add(jt2);
        JButton jb1 = new JButton("Even Nos");
        f.add(jb1);
        JButton jb2 = new JButton("Odd Nos");
        f.add(jb2);

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String str[] = jt1.getText().split(" ");
                String ans = "";
                for (int i = 0; i < str.length; i++) {
                    if (Integer.parseInt(str[i]) % 2 == 0)
                        ans += str[i] + " ";
                }
                jt2.setText(ans);
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String[] str = jt1.getText().split(" ");
                String ans = "";
                for (int i = 0; i < str.length; i++) {
                    if (Integer.parseInt(str[i]) % 2 == 1) {
                        ans += str[i] + " ";

                    }
                }
                jt2.setText(ans);
            }
        });
    }
}