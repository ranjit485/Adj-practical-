package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KeysEventDemo {
    JLabel l1, l2, l3;
    String msg = " ";
    KeysEventDemo(){
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        l1 = new JLabel("You Pressed ");
        l1.setFont(new Font("Arial", Font.BOLD,20));
        frame.add(l1);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    l1.setText("You Pressed UP Arrow");
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    l1.setText("You Pressed Down Arrow");
                }
                else if (e.getKeyCode() ==KeyEvent.VK_LEFT) {
                    l1.setText("You Pressed Left Arrow");
                }
                else if (e.getKeyCode() ==KeyEvent.VK_RIGHT) {
                    l1.setText("You Pressed Right Arrow");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {   }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new KeysEventDemo();
    }
}