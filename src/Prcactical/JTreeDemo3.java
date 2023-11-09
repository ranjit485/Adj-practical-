package Prcactical;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo3 {
    JFrame f;
    DefaultMutableTreeNode ThisPc,CD,D;
    JTreeDemo3()
    {
        f=new JFrame();

        ThisPc = new DefaultMutableTreeNode("This Pc");

        CD =  new DefaultMutableTreeNode("C Drive");

        CD.add(new DefaultMutableTreeNode("Program files"));
        CD.add(new DefaultMutableTreeNode("Users"));
        CD.add(new DefaultMutableTreeNode("Windows"));


        D =  new DefaultMutableTreeNode("D Drive");

        D.add(new DefaultMutableTreeNode("Documents"));
        D.add(new DefaultMutableTreeNode("Downloads"));
        D.add(new DefaultMutableTreeNode("Music"));
        D.add(new DefaultMutableTreeNode("Ranjit"));

        ThisPc.add(CD);
        ThisPc.add(D);
        JTree jt=new JTree(ThisPc);
        f.add(jt);
        f.setLocationRelativeTo(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTreeDemo3();
    }

}