package Prcactical;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo2 implements KeyListener {
    JLabel label;
    KeyEventDemo2(){
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        label = new JLabel("KEY EVENT");
        label.setFont(new Font("Arial", Font.BOLD,44));
        frame.add(label);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventDemo2();
    }

    @Override
    public void keyTyped(KeyEvent e) {
            label.setText("TYPED");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("PRESSED");

    }
    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("RELEASED");

    }
}