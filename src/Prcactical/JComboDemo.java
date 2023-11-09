package Prcactical;

import javax.swing.*;

public class JComboDemo {
    JComboDemo() {
        JFrame F = new JFrame();
        String cities[] = {"Mumbai", "Solapur", "Pune", "Bangalore"};
        JComboBox cb = new JComboBox(cities);
        cb.setBounds(10, 10, 150, 50);
        F.add(cb);
        F.setLayout(null);
        F.setSize(400, 400);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setLocationRelativeTo(null);
        F.setResizable(false);
        F.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboDemo();
        new JComboDemo2();

    }
}
