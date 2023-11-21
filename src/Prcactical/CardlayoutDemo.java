package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class CardlayoutDemo implements ActionListener {
    JFrame frame;
    CardLayout card;
    Container con;
    public CardlayoutDemo() {

        frame = new JFrame();

        con = frame.getContentPane();

        frame.setSize(500,500);

        card =  new CardLayout();
        frame.setLayout(card);
        JButton button = new JButton("hello");
        JButton button2 = new JButton("iam");
        JButton button3 = new JButton("ranjit");

        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        frame.add("b",button);
        frame.add("b2",button2);
        frame.add("b3",button3);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
           new CardlayoutDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(con);
    }
}
