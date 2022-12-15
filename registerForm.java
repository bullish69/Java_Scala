import java.awt.*;
import javax.swing.*;

class registerForm {
    public static void main(String args[]) {
        final JFrame f = new JFrame("Register Form");
        f.setVisible(true);
        f.setSize(500, 300);
        f.setLayout(new GridLayout(6, 2, 10, 10));
        JLabel j1 = new JLabel("Name");
        f.add(j1);
        final JTextField jt1 = new JTextField(10);
        f.add(jt1);
        JLabel j2 = new JLabel("EmailID");
        f.add(j2);
        final JTextField jt2 = new JTextField(10);
        f.add(jt2);
        JLabel j3 = new JLabel("Phone No");
        f.add(j3);
        final JTextField jt3 = new JTextField(10);
        f.add(jt3);
        JLabel j4 = new JLabel("Username");
        f.add(j4);
        final JTextField jt4 = new JTextField(10);
        f.add(jt4);
        JLabel j5 = new JLabel("Password");
        f.add(j5);
        final JTextField jt5 = new JTextField(10);
        f.add(jt5);
        JButton jb1 = new JButton("Register Now");
        f.add(jb1);

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String str = jt1.getText();
                String str1 = jt2.getText();
                String str2 = jt3.getText();
                String str3 = jt4.getText();
                String str4 = jt5.getText();
                if (str.length() == 0 || str1.length() == 0 || str2.length() == 0 || str3.length() == 0
                        || str4.length() == 0) {
                    JOptionPane.showMessageDialog(f, "Please Form");
                } else {
                    JOptionPane.showMessageDialog(f, "Register Successfully");
                }
            }
        });
    }
}