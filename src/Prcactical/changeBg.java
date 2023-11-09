package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class changeBg {
    JFrame frame;
    changeBg(){
        frame = new JFrame();
        frame.setBackground(Color.BLUE);
        frame.setSize(270,300);
        frame.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                frame.getContentPane().setBackground(Color.YELLOW);
            }
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new changeBg();
    }
}
