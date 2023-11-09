package Prcactical;

import javax.swing.*;

public class JComboDemo2 {
    JComboDemo2() {
        JFrame F = new JFrame();
        String states[] = {"Maharashtra", "Bihar ", "UP", "Manipur","Karnataka","Sikkim"};
        JComboBox cb = new JComboBox(states);
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
        new JComboDemo2();
    }
}
