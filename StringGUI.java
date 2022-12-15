import java.awt.*;
import javax.swing.*;

public class StringGUI {

    public static void main(String[] args) {
        JFrame f = new JFrame("Search and Replace String");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new GridLayout(6, 2, 10, 10));
        JLabel j1 = new JLabel("Input String");
        f.add(j1);
        final JTextField jt1 = new JTextField(10);
        f.add(jt1);
        JLabel j2 = new JLabel("Enter String to Search");
        f.add(j2);
        final JTextField jt2 = new JTextField(10);
        f.add(jt2);
        JLabel j3 = new JLabel("No of Occurences");
        f.add(j3);
        final JTextField jt3 = new JTextField(10);
        f.add(jt3);
        JLabel j4 = new JLabel("Replace String with");
        f.add(j4);
        final JTextField jt4 = new JTextField(10);
        f.add(jt4);
        JLabel j5 = new JLabel("New String");
        f.add(j5);
        final JTextField jt5 = new JTextField(20);
        f.add(jt5);
        JButton jb1 = new JButton("Search");
        jb1.setBackground(Color.BLUE);
        f.add(jb1);
        JButton jb2 = new JButton("Replace");
        jb2.setBackground(Color.BLUE);
        f.add(jb2);

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String str = jt1.getText();
                String str1 = jt2.getText();
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == str1.charAt(0)) {
                        int j = 0;
                        for (j = 0; j < str1.length(); j++) {
                            if (str1.charAt(j) != str.charAt(i + j))
                                break;
                        }
                        if (j == str1.length())
                            count++;
                    }
                }
                jt3.setText(Integer.toString(count));
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String str = jt1.getText();
                String str1 = jt2.getText();
                String str2 = jt4.getText();
                jt5.setText(str.replace(str1, str2));
            }
        });

    }
}