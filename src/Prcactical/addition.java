package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addition {
    JTextField t1,t2;
    JLabel l1,l2,result;
    addition(){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(6,1));
        frame.setSize(270,300);
        l1 = new JLabel("Enter first no");
        l2 = new JLabel("Enter second no");
        result = new JLabel("OUTPUT");
        t1 = new JTextField();
        t2 = new JTextField();
        JButton button = new JButton("ADD");
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(result);
        frame.add(button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                int product = Integer.parseInt(String.valueOf(no2+no1));
                result.setText(String.valueOf( no1+"+"+no2+"="+product));
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new addition();
    }
}
