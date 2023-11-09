package Prcactical;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo3 {
    JProgressBarDemo3(){
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setSize(300,300);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(100, 1, 1, 1));

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setSize(100, 60);
        progressBar.setOrientation(SwingConstants.HORIZONTAL);
        JButton hitMe = new JButton("Hit me");

        panel.add(progressBar);
        panel.add(hitMe);
        frame.add(panel);
        frame.setVisible(true);
            hitMe.addActionListener(new ActionListener() {
                int state = 0;
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (state == 100){
                        state = 0;
                    }
                    else {
                        state = state + 25;
                        progressBar.setValue(state);
                    }
                }
            });
    }
    public static void main(String[] args) {
        new JProgressBarDemo3();
    }
}
