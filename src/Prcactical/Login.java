package Prcactical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    JTextField Uname,Pass;
    JPasswordField Password;
    JLabel l1,l2,result;
    Login(){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(6,1));
        frame.setSize(270,300);
        l1 = new JLabel("Enter USERNAME");
        l2 = new JLabel("Enter PASSWORD");
        result = new JLabel("OUTPUT");
        Uname = new JTextField();
        Password = new JPasswordField();
        Password.setEchoChar('*');
        JButton button = new JButton("Login");
        frame.add(l1);
        frame.add(Uname);
        frame.add(l2);
        frame.add(Password);
        frame.add(result);
        frame.add(button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = Uname.getText();
                String myPass=String.valueOf(Password.getPassword());

                if (uname.equals ("Admin") && myPass.equals ("Admin#123")){
                    result.setText("Loged in as Admin");
                    JOptionPane.showMessageDialog(frame,"Login success");

                }
                else {
                    result.setText("Login Failed");
                    JOptionPane.showMessageDialog(frame,"Login Failed");
                }
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
