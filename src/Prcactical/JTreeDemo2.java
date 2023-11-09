package Prcactical;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo2 {
    JFrame f;
    DefaultMutableTreeNode india,Mh,Gujarat,Mumbai,Pune,Nashik,Nagpur;
    JTreeDemo2()
    {
        f=new JFrame();

        india =new DefaultMutableTreeNode("India");

        Mh = new DefaultMutableTreeNode("Maharashtra");
        Gujarat = new DefaultMutableTreeNode("Maharashtra");

        String states [] = {"Mumbai", "Pune", "Nashik", "Nagpur"};

        for (String state : states) {
            Mh.add(new DefaultMutableTreeNode(state));
        }

        india.add(Mh);
        india.add(Gujarat);

        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode black= new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");

        JTree jt=new JTree(india);
        f.add(jt);
        f.setLocationRelativeTo(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTreeDemo2();
    }

}