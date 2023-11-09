package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class clickCount {
    JLabel l1;
    int count = 0;
    clickCount(){
        JFrame frame = new JFrame();
        frame.setSize(270,300);
        l1 = new JLabel("0");
        l1.setFont(new Font("Arial", Font.BOLD,100));
        frame.add(l1);
        frame.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                count++;
                l1.setText(String.valueOf(count));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new changeBg();
    }
}
