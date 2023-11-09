package Prcactical;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JProgressBarDemo2 {
    static int state = 0;
    static JProgressBar progressBar = new JProgressBar(0, 100);

    JProgressBarDemo2() {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(100, 1, 1, 1));
        progressBar.setStringPainted(true);
        progressBar.setSize(100, 60);
        progressBar.setOrientation(SwingConstants.HORIZONTAL);
        panel.add(progressBar);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void setState() {
        while (true) {
            int i = 0;
            while (i <= 100) {
                progressBar.setValue(state);
                System.out.println(i);
                i = i + 25;
                state = i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String[] args) {
        new JProgressBarDemo2();
        setState();
    }
}