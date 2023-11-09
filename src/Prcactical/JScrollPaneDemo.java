package Prcactical;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo {
    private static void ShowGUI() {
        JFrame frame = new JFrame("ScrollPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea(20, 40);
        for (int i = 0; i < 100; i++) {
            textArea.append("Hello Ranjit"+"\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        ShowGUI();

    }
}
