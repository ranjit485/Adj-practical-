package Prcactical;

import javax.swing.*;
import java.awt.*;

public class MenuDemo {
    MenuDemo() {
        JFrame F = new JFrame();
        F.setSize(400, 400);


        MenuBar mb = new MenuBar();
        F.setMenuBar(mb);

        Menu Colors = new Menu("Colors");
        Menu Exit = new Menu("Exit");

        mb.add(Colors);
        mb.add(Exit);

        Colors.add(new MenuItem("Red"));
        Colors.add(new MenuItem("Green"));
        Colors.add(new MenuItem("Blue"));

        Exit.add(new MenuItem("Exit"));

        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setLocationRelativeTo(null);
        F.setResizable(false);
        F.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}
