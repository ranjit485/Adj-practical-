package Prcactical;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JProgressBarDemo {
    JProgressBarDemo(){

        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setSize(300,300);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(100, 1, 1, 1));

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setValue(100);
        progressBar.setSize(100, 60);
        progressBar.setOrientation(SwingConstants.HORIZONTAL);

        panel.add(progressBar);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new JProgressBarDemo();
    }
}
