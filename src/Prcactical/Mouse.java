package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse {
    JFrame frame;
    Color [] colors ={Color.RED,Color.GREEN,Color.BLACK};
    Mouse(){
        frame = new JFrame();
        frame.setSize(270,300);
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("mouseDragged");
                int x = (int) (Math.random()*3);
                System.out.println(x);
                panel.setBackground(colors[x]);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("mouseMoved");
                int x = (int) (Math.random()*3);
                System.out.println(x);
                panel.setBackground(colors[x]);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Mouse();
    }
}
