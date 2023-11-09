package Prcactical;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {
    JFrame f;
    DefaultMutableTreeNode style,color,font,red,black,blue,green,yellow;
    JTreeDemo()
    {
        f=new JFrame();

        style =  new DefaultMutableTreeNode("style");

        color =  new DefaultMutableTreeNode("color");

        color.add(new DefaultMutableTreeNode("red"));
        color.add(new DefaultMutableTreeNode("Blue"));
        color.add(new DefaultMutableTreeNode("Black"));

        style.add(color);
        style.add(new DefaultMutableTreeNode("font"));

        JTree jt=new JTree(style);
        f.add(jt);
        f.setLocationRelativeTo(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTreeDemo();
    }

}