package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse2 {
    JFrame frame;
    int x = 0;

    Mouse2(){
        frame = new JFrame();
        JLabel label = new JLabel("Mouse ");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));
        frame.setSize(270,300);
        frame.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                label.setText("Mouse Dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse Moved");

            }
        });
         frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Mouse2();
    }
}
